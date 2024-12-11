package JavaConcept.Multithreading.JavaEight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

class service1 implements Runnable{
    int i;public service1(int i){this.i=i;}
    public void run(){
        System.out.println(" "+i);
        try {Thread.sleep(1000);}
        catch (InterruptedException e) {throw new RuntimeException(e);}
    }
}
public class ExecutorUtilSubmit {


    // future stores data recived by submit
    public static void main(String args[]) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        System.out.println(new Date());
        List<Future<String>> fut = new ArrayList<>();
        for(int i=0;i<10;i++){
            fut.add((Future<String>)es.submit(new service1(i)));
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(new Date());
        for(Future<String> f :fut){
            System.out.println(f.get());
        }
    }
}
