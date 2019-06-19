package concurrency.multthread;


import javax.swing.table.TableRowSorter;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class BasicThreadTimer extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer task started at:"+new Date());
        prcessing();
        System.out.println("Timer task finished at"+new Date());
    }

    private void prcessing() {

        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        TimerTask timerTask = new BasicThreadTimer();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask,1000,3*1000);

        System.out.println("Timertask started");


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.cancel();
        System.out.println("Timertask cancelled");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
