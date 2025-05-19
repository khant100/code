package JavaConcept.Multithreading.JavaEight;

public class ThreadClassWithSleepAndJoinDemon {

    public static void main(String[] args){


        Thread t1 = new Thread(()->{
            try {
                Thread.sleep(2000);
                System.out.println("thread worker started "+Thread.currentThread().getName());
            }catch (InterruptedException ex){
                System.out.println("thread worker interuptted "+Thread.currentThread().getName());
            }
        },"worker-thread");
        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(2000);
                System.out.println("thread demon started "+Thread.currentThread().getName());
            }catch (InterruptedException ex){
                System.out.println("thread demon interuptted "+Thread.currentThread().getName());
            }
        },"demon-thread");
        t2.setDaemon(true);

        t1.start();
        t2.start();
        System.out.println("main Thread started");
//        try{
//            t1.join();
//        }catch (InterruptedException ex){
//            System.out.println("main Thread interptted");
//        }
        System.out.println("main Thread ended");
    }


}
