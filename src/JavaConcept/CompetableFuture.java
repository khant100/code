package JavaConcept;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class CompetableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
            // Run a task asynchronously
            CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
                try {
                    Thread.sleep(1000); // Simulate a long-running task
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "Hello, World!";
            });
            // Get the result (blocking call)
            System.out.println(future.get()); // Output: Hello, World!
        }
}
