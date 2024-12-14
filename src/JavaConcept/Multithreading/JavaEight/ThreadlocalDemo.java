package JavaConcept.Multithreading.JavaEight;

public class ThreadlocalDemo implements Runnable{

    public static Integer number = new Integer(10);
    static ThreadLocal<Integer> number1 = new ThreadLocal<>();
    // to get different data e use threadLoacl
    // as it acquire lock on thread so all 3 threads will share same data only
    public static void main(String args[]){
        Thread t1 = new Thread(new ThreadlocalDemo());
        Thread t2 = new Thread(new ThreadlocalDemo());
        Thread t3 = new Thread(new ThreadlocalDemo());
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void run(){
        number = (int) (Math.random()*100);
        number1.set((int)(Math.random()*100));
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(number);
        System.out.println(number1.get());
    }
}
