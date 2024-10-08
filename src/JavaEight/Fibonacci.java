package JavaEight;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {

    // print fibonacci series
    public static void main(String[] args) {

        Stream.iterate(new int[] {0,1},f -> new int[]{f[1],f[0]+f[1]})
                .limit(10)
                .map(f->f[0])
                .forEach(x->System.out.println(x));

        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]})
                .limit(10).map(f->f[0])
                .forEach(x->System.out.println(""+x));

        Stream.iterate(new int[]{1,1},f->new int[]{f[1],f[0]+f[1]}).limit(9)
                .map(f->f[0])
                .forEach(x->System.out.print(" "+x));



    }
}
