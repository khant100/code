package InterviewPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseInteger {

    public static void main(String args[]){
        List<Integer> lis = List.of(3, 4, 5,6,7);
        lis.stream().forEach(System.out::print);
       List<Integer> rev= IntStream.range(0,lis.size()).mapToObj(i->lis.get(lis.size()-1-i)).collect(Collectors.toList());
        System.out.println();
        rev.stream().forEach(System.out::print);
    }
}
