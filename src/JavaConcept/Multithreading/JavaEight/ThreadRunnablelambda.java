package JavaConcept.Multithreading.JavaEight;

import JavaConcept.Multithreading.CreateThreadClass;

import java.util.stream.IntStream;

public class ThreadRunnablelambda {

    public static void main(String[] args){

        Runnable runnable= ()->{

                IntStream.range(0,25).filter(x->x%2==0).forEach(System.out::println);

        };
        Runnable runnable1 =() ->{

                IntStream.range(25,50).filter(x->x%2==1).forEach(System.out::println);

        };

        Thread thread1 = new Thread(runnable,"t1 even");
        Thread thread2 = new Thread(runnable1,"t2 odd");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
