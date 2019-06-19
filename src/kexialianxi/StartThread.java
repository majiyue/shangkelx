package kexialianxi;

public class StartThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {

            System.out.println("玩游戏！！！");
        }
    }

    public static void main(String[] args) {
        StartThread s1 =new StartThread();
        s1.start();
        for (int i = 0; i <10000 ; i++) {
            System.out.println("吃饭！！！");

        }
    }
}
