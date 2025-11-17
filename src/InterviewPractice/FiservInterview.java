package InterviewPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FiservInterview {
    public static void main(String args[]){
        List<String> list = List.of("abc","avf","chandra","vaibha","vibhuti");
        list.stream().filter(x->x.startsWith("a")).collect(Collectors.toList()).forEach(x->System.out.println(x));
   Map<Integer,String > map = new HashMap<>();
   map.put(1,"ram");
        map.put(2,"shyam");
        map.put(3,"beti");
        map.put(4,"ram");
        map.put(5,"shyam");
        Map<String ,Long> map1= map.values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

     }
}
