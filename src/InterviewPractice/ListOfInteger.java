package InterviewPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfInteger {

    public static void main(String args[]){
        List<Integer> intList = List.of(2,3,5,6,6,73,22,34,555);
        intList.stream().distinct().collect(Collectors.toList()).forEach(x->System.out.print(" "+x));
    }
}
