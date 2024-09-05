package JavaEight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem2 {
    public static void main(String[] args) {


//funtional interface implemented
        FunInterface f = i -> System.out.println("kiss "+i);
        f.add(4);
        // consumer interface implemented with external class
        Consumer<String> c = new JavaEightConsumer();
        c.accept("Vyas");

        // Consumer interface implemented with inner class implementation

        Consumer<Integer> i = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("square of number is "+integer*integer);
            }
        };
        //i.accept(5);
        Stream.of(2,4,6,7,8,2).forEach(i);

        // further optimize code accourding to java 8

        Consumer<Character> q = x-> System.out.println(x.toString()+x.toString());
        Stream.of('a','b','c').forEach(q);
        String s="my name is khant aeiou";
        String s1="my name is khant aeiou";
        String s2="my name is khant aeiou";
        String s3="my name is khant aeiou";
        List<Integer> index =new ArrayList<>();
        List<Integer> index1 =new ArrayList<>();
        List<Integer> index2 =new ArrayList<>();
        List<Integer> index3 =new ArrayList<>();

// return the indexes from the string

        IntStream.range(0,s.length())
                .filter(x->" aeiouAEIOU".indexOf(s.charAt(x))>0)
                        .forEach(index :: add);
        System.out.println(" list of index"+index);
        IntStream.range(0,s1.length())
                .filter(x->" aeiou".indexOf(s1.charAt(x))>0)
                .forEach(index1 :: add);
        System.out.println(" list of index"+index1);
IntStream.range(0,s2.length()).filter(x->"aeiouAEIOU".indexOf(s2.charAt(x))!=-1).forEach(index2::add);
        System.out.println(" list of index"+index2);


IntStream.range(0,s3.length())
        .filter(x->" aeiouAEIOU".indexOf(s3.charAt(x))>0)
        .forEach(x->index3.add(x));
        System.out.println(" list of index"+index3);


        IntStream.rangeClosed(0,100)
                .filter(x->x%5==0)
                .forEach(x->System.out.println(x));
    }
}
