package InterviewCodeQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaEightQu {

//Given two lists = [1,5,7,7,8] and [2,3,,3,4,5]
    public  static void main(String args[]){
    Stream<Integer> l1 = Stream.of(1,5,7,7,8);

        Stream<Integer> l2 = Stream.concat(l1,Stream.of(2,3,3,4,5));
        String s= "Missippi";

        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();

        t1 = List.of(1,5,7,7,8);
        t2 = List.of(2,3,3,4,5);
        List<Integer> l3 = Stream.concat(t1.stream(),t2.stream()).collect(Collectors.toList());


//for(Integer i : l2){
//    l1.add(i);
//}


        List<Integer> list =  l2.sorted().distinct().collect(Collectors.toList());
        System.out.println(" "+Stream.concat(t1.stream(),t2.stream()).collect(Collectors.toList()).stream().sorted().distinct().collect(Collectors.toList()));
        System.out.println(" "+t2.stream().sorted().distinct().collect(Collectors.toList()));
        Map<Character,Long> map =s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(""+s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        List input = List.of("abc", 12, "def", 3, "ghi", 5);
        input.stream().filter(x -> x instanceof Integer).mapToInt(x->(int)x).sum();

        //output = 20

        System.out.println("Hello world!"+input.stream().filter(x -> x instanceof Integer).mapToInt(x->(int)x).sum());

    }

}
