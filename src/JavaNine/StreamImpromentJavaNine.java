package JavaNine;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamImpromentJavaNine {
    public static void main(String[] args) {
        // it stopes when it gets unmatch element
        // takeWhile method is used to consifer streaming unless we encounter false condition
        // dropwhile Stream dropWhile method returns result on the basis of order of stream elements.
       // iterate method allow us to stream element till the specified condition

        List<Integer> list
                = Stream.of(2,2,1,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
        List<Integer> list1
                = Stream.of(2,2,2,3,4,5,6,7,8,9,10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println( Stream.iterate(0,i->i<=15,i->i+1).collect(Collectors.toList()));


    }
}
