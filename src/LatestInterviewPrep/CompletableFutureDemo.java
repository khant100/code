package LatestInterviewPrep;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //SypplyAsync runs task asynchronously then supply a result
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(
                ()->{ System.out.println("thread 1 runn"+Thread.currentThread().getName());
                return 10;});
// ThenApply  Transform the result
        CompletableFuture<Integer> future2 = future1.thenApply(result -> {
            System.out.println("task 2 running"+Thread.currentThread().getName());
       return result*3;  });

        future2.thenAccept(result->System.out.println("result"+result));

    }
}
