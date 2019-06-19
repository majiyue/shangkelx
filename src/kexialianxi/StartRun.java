package kexialianxi;


public class StartRun implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("一边听歌。。");
        }
    }


    public static void main(String[] args) {

//        StartRun sr = new StartRun();
//        Thread s1 = new Thread(sr);
//        s1.start();

        new Thread(new StartRun()).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("一边玩游戏。。");
        }
    }

}
