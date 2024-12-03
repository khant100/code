package JavaConcept;

public class ThreadRunn implements Runnable{

    @Override
    public void run() {
        System.out.println("Task started 2");
        for(int i=16;i<30;i++){
            System.out.print("  "+i);
        }
    }
}
