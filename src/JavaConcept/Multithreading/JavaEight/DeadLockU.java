package JavaConcept.Multithreading.JavaEight;

import java.util.concurrent.ExecutionException;

public class DeadLockU {

    public static void main(String args[])  {

       final String dLock1= "User1";
        final String dLock2= "User2";
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (dLock1){
                    System.out.println("inside Thread 1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (dLock2){
                        System.out.println("first block passed");
                    }
                }

            }
        });
// if you use lock1 and lock2 and lock2 and lock1 it will be dead lock

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (dLock2){
                    System.out.println("inside Thread 2");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (dLock1){
                        System.out.println("second block passed");
                    }
                }

            }
        });

        t1.start();
        t2.start();

    }
}
