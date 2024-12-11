package JavaConcept.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicethreadpull {
    public static void main(String[] args) {
        ExecutorService executerService = Executors.newFixedThreadPool(4);
        executerService.execute(new ThreadingMulti(100));
        executerService.execute(new ThreadingMulti(200));
        executerService.execute(new ThreadingMulti(300));
        executerService.execute(new ThreadingMulti(400));
        executerService.execute(new ThreadingMulti(50));
        executerService.execute(new ThreadingMulti(70));
//        System.out.println("Task started 3");
//        for(int i=30;i<46;i++){
//            System.out.print("  "+i);
//        }
        executerService.shutdown();
    }
}
