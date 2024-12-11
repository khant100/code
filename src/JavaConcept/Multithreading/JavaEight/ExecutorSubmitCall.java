package JavaConcept.Multithreading.JavaEight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

class service2 implements Callable<String>{
    int i;public service2(int i){this.i=i;}
    public String call() throws Exception{
        System.out.println("in thread"+i);
        return "Thread run"+i;
    }
}
public class ExecutorSubmitCall {


    public static void main(String args[]) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        System.out.println(new Date());
        List<Future<String>> fut = new ArrayList<>();
        for(int i=0;i<10;i++){
            fut.add((Future<String>)es.submit(new service2(i)));
        }
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(new Date());
        for(Future<String> f :fut){
            System.out.println(f.get());
        }
    }
}
