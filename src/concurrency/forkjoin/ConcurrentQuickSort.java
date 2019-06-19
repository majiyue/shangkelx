package concurrency.forkjoin;

import java.nio.channels.MulticastChannel;
import java.util.concurrent.RecursiveAction;

public class ConcurrentQuickSort extends RecursiveAction {

    private int threadhole = 30;
    private int low;
    private int high;
    private Long[] numbers;

    public ConcurrentQuickSort(int threadhole, Long[] numbers) {
        this.threadhole = threadhole;
        this.low = 0;
        this.high = numbers.length - 1;
        this.numbers = numbers;
    }

    public ConcurrentQuickSort(Long[] numbers, int low, int high) {
        this.low = low;
        this.high = high;
        this.numbers = numbers;
    }

    private static int partition(Long[] numbers, int low, int high) {

        Long soldier = numbers[low];

        while (low < high) {
            while (low < high) {
                if ( numbers[high] < soldier ) {
                    numbers[low] = numbers[high];
                    break;
                }
                high--;
            }
            while (low < high) {
                if ( numbers[low] > soldier ) {
                    numbers[high] = numbers[low];
                    break;

                }
                low++;
            }


        }
        numbers[low] = soldier;
        return low;
    }


    @Override
    protected void compute() {

        if ( high - low < threadhole ) {
            QuickSort.qsort(numbers, low, high);
        } else {
            int soldier = partition(numbers, low, high);
            ConcurrentQuickSort left = new ConcurrentQuickSort(numbers, low, soldier - 1);
            ConcurrentQuickSort right = new ConcurrentQuickSort(numbers, soldier + 1, high);
            invokeAll(left, right);       //将两个线程的结果拼接。

        }
    }
}
