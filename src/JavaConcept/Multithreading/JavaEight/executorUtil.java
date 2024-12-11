package JavaConcept.Multithreading.JavaEight;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class service implements Runnable{
    int i;public service(int i){this.i=i;}
    public void run(){
        System.out.println(" "+i);
        try {Thread.sleep(1000);}
        catch (InterruptedException e) {throw new RuntimeException(e);}
    }
}
public class executorUtil {
    // es need t be shoutdown for thread to shutdown
    // awaited termination used to either wait for time or shuttingdown thread
    public static void main(String args[]) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        System.out.println(new Date());
        for(int i=0;i<25;i++){
            es.execute(new service(i));
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(new Date());
    }
}

