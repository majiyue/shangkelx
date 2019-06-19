package kexialianxi;

public class LamdaStratRun  {

    static class Test implements Runnable{

        @Override
        public void run() {

            for (int i = 0; i <10000 ; i++) {
                System.out.println("喝水！！！！");
            }
        }
    }
}
