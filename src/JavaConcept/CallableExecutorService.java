package JavaConcept;
import java.util.concurrent.*;
public class CallableExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(1);
   Future<String> callablefut =
    executorService.submit(new CallableRunner("khant"));


       String msg= callablefut.get();
        System.out.println(msg);
        System.out.println("callable executed completed");
        System.out.println("Main completed");

    }


}
