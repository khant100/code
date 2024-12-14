package JavaConcept.Multithreading.JavaEight;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class sendSms implements Runnable{
    private CountDownLatch c1;
    public sendSms(CountDownLatch c1) {
        this.c1 = c1;
    }
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c1.countDown();
        System.out.println(c1.getCount());
    }
}
public class CountDownLatch1 {
    public static void main(String args[])  {
        java.util.concurrent.CountDownLatch cm = new java.util.concurrent.CountDownLatch(10);

        ExecutorService es = Executors.newSingleThreadExecutor();
        for(int i=0;i<12;i++){
            es.submit(new sendSms(cm));
        }
        try {
            cm.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--task done ------");
    }
}
