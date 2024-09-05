package JavaEight;

import java.util.List;
import java.util.stream.IntStream;

public class JavaEightStreamsUses {
    public static void main(String[] args) {

        // parallel stream is used for using multiple threads

        List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14).
                parallelStream().forEach(x->System.out.print(" "+x));
        System.out.println(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14).stream().filter(x->x%5==0).findFirst());
        List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14).stream().forEach(x->System.out.print(" "+x));
        System.out.println(" new"+List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14).stream().filter(x->x%5==0).findFirst().orElse(0));
        IntStream.range(1,15).forEach(x->System.out.print(" "+x));
    }
}
