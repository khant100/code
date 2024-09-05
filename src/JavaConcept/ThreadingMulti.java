package JavaConcept;

public class ThreadingMulti extends Thread {

    private int n;
    public ThreadingMulti(int n){
        this.n = n;
    }
    public void run(){
        System.out.println("Task started :"+n);
    for(int i=0+n;i<15+n;i++){
        System.out.print("  "+i);
    }
        System.out.println("Task ended:"+n);
    }



}
