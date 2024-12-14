package JavaConcept.Multithreading.JavaEight;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

// execute() method of framework
// shutDown() shutting down after completion of task
/// Future Stores  data recived by submit
// Submit(new Runnable()) return null
// Submit(new Callable()) return data
// invokeAny(callable list) returns single data from list of callable objects
/// invokeall(callable list) returns list of future objects
//
class service4 implements Callable<String> {
    int i;public service4(int i){this.i=i;}
    public String call() throws Exception{
        System.out.println("in thread"+i);
        return "Thread run"+i;
    }
}
public class ExecutorServiceInvokeAll {
    public static void main(String args[]) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        System.out.println(new Date());
        List<Callable<String>> fut = new ArrayList<>();
        fut.add(new service3(1));
        fut.add(new service3(2));
        fut.add(new service3(4));
        fut.add(new service3(3));
        fut.add(new service3(5));

        List<Future<String>> futureList =es.invokeAll(fut);

        es.shutdown();
        es.awaitTermination(10, TimeUnit.SECONDS);
        for (Future<String> s : futureList){
            System.out.println(s.get());
        }
        System.out.println(new Date());



    }
}
