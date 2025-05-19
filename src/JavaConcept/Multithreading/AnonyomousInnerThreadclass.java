package JavaConcept.Multithreading;

public class AnonyomousInnerThreadclass {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread running using anonymous inner class thread.");
            }
        };

        t1.start();
        // thread Name
        System.out.println("Name of thread "+Thread.currentThread().getName());

    }
}
