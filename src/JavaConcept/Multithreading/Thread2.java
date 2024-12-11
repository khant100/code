package JavaConcept.Multithreading;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=51;i<600;i++){
            System.out.println("thread 2");
        }
    }
}
