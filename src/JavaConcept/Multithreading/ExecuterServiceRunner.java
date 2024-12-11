package JavaConcept.Multithreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceRunner {
    public static void main(String[] args) {
        ExecutorService executerService = Executors.newSingleThreadExecutor();
        executerService.execute(new ThreadingMulti(1));
        executerService.execute(new Thread(new ThreadRunn()));


executerService.shutdown();
    }

}
