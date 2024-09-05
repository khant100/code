package JavaConcept;

import java.util.List;
import java.util.concurrent.*;

public class MultipleCallableService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(6);

       List<CallableRunner> callables= List.of(new CallableRunner("vyas"),new CallableRunner("het"), new CallableRunner("anne"));
//        List<Future<String>> futures = executorService.invokeAll(callables);
//
//        for(Future<String> i : futures){
//            System.out.println(" "+i.get());
//        }

        String obj = executorService.invokeAny(callables);
        System.out.println(" "+obj);
        executorService.shutdown();
    }
}
