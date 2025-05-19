package JavaConcept.Multithreading;

public class CreateThreadClass extends Thread{

    @Override
    public void run(){
        System.out.println("my thread");
    }

    // thread class extension
    public static void main(String[] args){
        Thread t1 = new CreateThreadClass();
        t1.start();

    }

}
