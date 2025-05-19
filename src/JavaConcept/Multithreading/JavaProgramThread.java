package JavaConcept.Multithreading;

public class JavaProgramThread {

    public static void PrintTable(int n){
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }
    }

    public static void main(String[] args) throws InterruptedException{

        Runnable t1 =()-> {

                PrintTable(2);




        };

        Runnable t2 = () ->{
            int n = 3;
            for (int i = 1; i < 10; i++) {
                System.out.println(n + " * " + i + " = " + i * n);
            }
        };

        new Thread(t1).start();
        new Thread(t2).start();




    }
}
