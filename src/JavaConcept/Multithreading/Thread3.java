package JavaConcept.Multithreading;

public class Thread3 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<500;i++){
            System.out.println("thread--3");
        }
    }
}
