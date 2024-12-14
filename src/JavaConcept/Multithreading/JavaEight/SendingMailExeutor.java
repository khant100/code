package JavaConcept.Multithreading.JavaEight;

// sending a mail to studenttakse 0.5 sec
// there are 6000 studnts so  it will 3000 seconds
// 50 minuts , In such senerio we need multithreading and executor service

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class sendMail implements Runnable{

    public void run(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
public class SendingMailExeutor {
    public static void main(String args[]) {
        // how using multiple threads will reduce the time it take for this send mail


        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        System.out.println(df.format(new Date()));
        for(int i=0;i<40;i++){
            executorService.submit(new sendMail());
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(df.format(new Date()));
    }

}
