package JavaConcept.Multithreading;

public class ImplementationRunnableThreadClass implements Runnable{

    @Override
    public void run(){
        System.out.println("my thread Runnable");
    }
// Implement runnable interface in run() method
    public static void main(String[] args){
        Thread t1 = new Thread(new ImplementationRunnableThreadClass());
        t1.start();
    }


}
