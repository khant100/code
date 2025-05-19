package JavaConcept.Multithreading;

public class AnonyomousInnerClassRunnable {

    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(" Runnable Annonious class");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
    }

}
