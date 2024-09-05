package JavaEight;

import java.util.function.Consumer;

public class JavaEightConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println("this is a given String "+s);
    }
}
