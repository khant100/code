package JavaConcept;

import java.util.concurrent.Callable;

// Thread class which return a value
public class CallableRunner implements Callable<String> {
    public CallableRunner(String name) {
        this.name = name;
    }private String name;
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello"+name;
    }
}
