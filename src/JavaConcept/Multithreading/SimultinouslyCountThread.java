package JavaConcept.Multithreading;

public class SimultinouslyCountThread {
    public static int sharedcounter =1;
    public static int limit =50;
    private static final Object lock =new Object();

    public static void printNumber(int i){
        while (true){
            synchronized (lock){
                if(sharedcounter>limit){
                    break;
                }
                if(sharedcounter%3==i%3){
                    System.out.println("T"+i+" "+sharedcounter);
                    sharedcounter++;
                    lock.notifyAll();
                }else{
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

    }
    public static void main(String args[]){

        Thread t1 = new Thread(()->printNumber(1));
        Thread t2 = new Thread(()->printNumber(2));
        Thread t3 = new Thread(()->printNumber(3));
        t1.start();
        t2.start();
        t3.start();

    }
}
