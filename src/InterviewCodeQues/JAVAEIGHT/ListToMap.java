package InterviewCodeQues.JAVAEIGHT;

import java.util.List;
import java.util.stream.Collectors;

public class ListToMap {


    public static void main(String args[]) {
        List<String> fruits = List.of("apple", "banana","kiwi");
        System.out.println(" --> "+fruits.stream().collect(Collectors.groupingBy(x->x,Collectors.summingInt(x->x.length()))));
        System.out.println(" --> "+fruits.stream().collect(Collectors.toMap(x->x,x->x.length())));
    }
}
