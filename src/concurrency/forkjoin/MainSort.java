package concurrency.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class MainSort {

    private static Long[] getRandomLongNumber(int n) {
        Random random = new Random();
        Long[] numbers = new Long[n];

        for (int i = 0; i < n; i++) {
            Long num = random.nextLong();
            numbers[i] = num < 0 ? Math.abs(num) : num;
        }
        return numbers;
    }


    public static void main(String[] args) {

        final int RUNNTIMES=10;
        final int SORTNUM =10000000;
        final int QUICKSORT_THRESHOLD=10;
        long startTime;
        for (int i = 1; i <RUNNTIMES+1 ; i++) {
            System.out.println("The "+i+" run");
            System.out.println("Generating "+SORTNUM+" numbers");

            Long[] qsNumbers = getRandomLongNumber(SORTNUM);

            System.out.println("Executing Quick Sort ");
            startTime = System.currentTimeMillis();
            QuickSort.qsort(qsNumbers,0,qsNumbers.length-1);
            Long runTime = System.currentTimeMillis() - startTime;
            System.out.println("Total use "+runTime);


            Long[] cqsNumbers = getRandomLongNumber(SORTNUM);

            System.out.println("Executing Concurr Quick Sort ");
            ForkJoinPool pool = new ForkJoinPool();
            ConcurrentQuickSort cqs = new ConcurrentQuickSort(QUICKSORT_THRESHOLD,cqsNumbers);
            startTime = System.currentTimeMillis();

            pool.execute(cqs);
            while (!cqs.isDone()){}



            Long cqsrunTime = System.currentTimeMillis() - startTime;
            System.out.println("Total use "+cqsrunTime);

        }


    }

}
