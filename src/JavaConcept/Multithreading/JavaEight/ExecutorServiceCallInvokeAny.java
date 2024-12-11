package JavaConcept.Multithreading.JavaEight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

class service3 implements Callable<String> {
    int i;public service3(int i){this.i=i;}
    public String call() throws Exception{
        System.out.println("in thread"+i);
        return "Thread run"+i;
    }
}

public class ExecutorServiceCallInvokeAny {
    public static void main(String args[]) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        System.out.println(new Date());
        List<Callable<String>> fut = new ArrayList<>();
        fut.add(new service3(1));
        fut.add(new service3(2));
        fut.add(new service3(4));
        fut.add(new service3(3));
        fut.add(new service3(5));
        String str =es.invokeAny(fut);
        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(str);
        System.out.println(new Date());



    }
}
