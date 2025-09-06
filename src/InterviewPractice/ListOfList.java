package InterviewPractice;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfList {
    public static void main(String args[]){
        List<List<Integer>> listofList = List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));
        listofList.stream().forEach(System.out::println);
//        List<Integer> lis = listofList.stream().flatMap(List::stream).collect(Collectors.toList());
//        lis.stream().forEach(System.out::println);
    }
}
