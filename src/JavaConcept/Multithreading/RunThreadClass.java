package JavaConcept;

public class RunThreadClass {
    public static void main(String[] args) throws InterruptedException {
        ThreadingMulti threadingMulti = new ThreadingMulti(100);
        threadingMulti.start();
        threadingMulti.join();

        ThreadRunn threadRunn = new ThreadRunn();
        Thread thread = new Thread(threadRunn);
        thread.start();

    }

}
