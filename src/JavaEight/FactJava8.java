package JavaEight;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FactJava8 {

    public long factFun(int n){
        return LongStream.rangeClosed(1,n).reduce(1,(x,y)->x*y);
    }

    public static void main(String[] args) {
        FactJava8 factJava8 = new FactJava8();
        System.out.println(" "+factJava8.factFun(5));

        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);

        String s = "we belong to Russia";

        String[] lis = s.split(" ");

      String mi=  List.of(lis).stream().min(Comparator.comparingInt(String::length)
                .thenComparing(word->Arrays.asList(lis).indexOf(word))).get();
     String mx =   Arrays.stream(lis).max(Comparator.comparingInt(String::length).
                thenComparing(x->Arrays.asList(lis).indexOf(x))).get();
        System.out.println(mi+"---"+mx);
Arrays.stream(lis).min(Comparator.comparingInt(String::length).thenComparing(x->Arrays.asList(lis).indexOf(x))).get();
        List.of(lis).stream().max(Comparator.comparingInt(String::length).thenComparing(x->Arrays.asList(lis).indexOf(x))).get();
        List<Integer> num = new ArrayList<>();
        String input1 = "hello world";
        IntStream.range(0,input1.length()).
                filter(i->"aeiouAEIOU".indexOf(input1.charAt(i))>0)
                .forEach(num :: add);


        Optional<String> input= words.stream().reduce((x1, x2)->x1.length()>x2.length()? x1:x2);
       System.out.println(input.get());
        System.out.println( array.stream().reduce(0,(x,y)->x+y));

        System.out.println(IntStream.rangeClosed(2,5).reduce(1,(a,b)->a*b));
        System.out.println(num);


    }
}
