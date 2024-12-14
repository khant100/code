package JavaConcept.Multithreading.JavaEight;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

class Consumer1 implements Runnable{
    BlockingQueue<Integer> bq;
    public Consumer1(BlockingQueue<Integer> bq) {
        this.bq = bq;
        Thread cons = new Thread(this);
        cons.start();
    }

    public void run(){
        while(true) {
            try {
                System.out.println("Consumer" + bq.take());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class Producer1 implements Runnable{
    BlockingQueue<Integer> bq;

    public Producer1(BlockingQueue<Integer> bq) {
        this.bq = bq;
        Thread prod = new Thread(this);
        prod.start();
    }

    public void run(){
        int i=0;
        while(true){
            System.out.println("Producer"+i);
            try {
                bq.put(i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
public class ProducerConsumerBlockingQueue {

    public static void main(String args[]){
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
        new Producer1(bq);
        new Consumer1(bq);


    }
}
