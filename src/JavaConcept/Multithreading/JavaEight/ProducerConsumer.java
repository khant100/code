package JavaConcept.Multithreading.JavaEight;


class Produces implements Runnable{
private utilityConsumerProducer util;
    public void run(){
        int i=0;
        while(true) {
            try {
                util.set(i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Produces(utilityConsumerProducer util) {
        this.util=util;
        Thread producer = new Thread(this,"producer");
        producer.start();
    }
}
class utilityConsumerProducer {

    int i;
    boolean bool=false;
    public synchronized void get() throws InterruptedException {
        while(!bool){
            wait();
        }
        bool=false;
        System.out.println("Consumer"+i);
        notify();
    }

    public synchronized void set(int i) throws InterruptedException {
        while(bool){
            wait();
        }
        bool=true;
        this.i=i;
        System.out.println("Producer"+i);
        notify();
    }
}

class consumer implements Runnable{
    private utilityConsumerProducer util;
    public consumer(utilityConsumerProducer util) {
        this.util=util;
        Thread consumer = new Thread(this,"consumer");
        consumer.start();
    }
    public void run(){
        while(true){
            try {
                util.get();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
public class ProducerConsumer {

    public static void main(String args[]){
        utilityConsumerProducer util = new utilityConsumerProducer();
        new Produces(util);
        new consumer(util);
    }
}
