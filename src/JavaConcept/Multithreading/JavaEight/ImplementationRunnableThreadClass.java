package JavaConcept.Multithreading.JavaEight;

import JavaConcept.Multithreading.CreateThreadClass;

public class ImplementationRunnableThreadClass implements Runnable{

    @Override
    public void run(){
        System.out.println("my thread");
    }

    public static void main(String[] args){
        Thread t1 = new CreateThreadClass();
        t1.start();

    }


}
