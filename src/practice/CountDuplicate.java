package practice;

import java.util.List;
import java.util.stream.Collectors;

public class CountDuplicate {
    public static void main(String args[]){
        List<String> list = List.of("s","ss","LL","s","LL");

        System.out.println(list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));
    }
}
