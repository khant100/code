package JavaConcept.Multithreading.JavaEight;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class CompetableFuture {

   // execute() method of framework
    // shutDown() shutting down after completion of task
/// Future Stores  data recived by submit
// Submit(new Runnable()) return null
// Submit(new Callable()) return data
// invokeAny(callable list) returns single data from list of callable objects
/// invokeall(callable list) returns list of future objects
//
    private static int data=5;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("data->"+data);
        CompletableFuture.runAsync (()->{
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data =10;
        });

        System.out.println("data-> not change : "+data);
        Thread.sleep(1500);
        System.out.println("data-> changed : "+data);
            // Run a task asynchronously
        // supplyasync to return object
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(3000); // Simulate a long-running task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "Hello, World!";
            });
            // Get the result (blocking call)
            System.out.println(future.get());// Output: Hello, World!
        System.out.println("this will wait till 3000 mili second");
        }
}
