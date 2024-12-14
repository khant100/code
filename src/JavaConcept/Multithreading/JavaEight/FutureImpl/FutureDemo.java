package JavaConcept.Multithreading.JavaEight.FutureImpl;


import java.util.concurrent.*;

class myCallIn implements Callable<String>{

    public String call(){
        return "Callable interface";
    }
}
public class FutureDemo {

    public static void main(String args[]) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<String > stringFuture=es.submit(new myCallIn());
        System.out.println(stringFuture.get());

        FutureTask<String> futueObj = new FutureTask<>(new myCallIn());
        es.submit(futueObj);
        es.shutdown();
        System.out.println(futueObj.isDone()+"-----"+futueObj.get());

    }
}
