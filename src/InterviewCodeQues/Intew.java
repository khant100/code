package InterviewCodeQues;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intew  {

    public static void main(String args[]){
        int[] arr ={9,5,99,44,77,6,99,101};
        int maxx = Arrays.stream(arr).max().getAsInt();
        System.out.println(""+maxx);
        int max = Stream.of(2,5,6,7,9).max(Integer::compare).get();
        int min = Stream.of(2,5,6,7,9).min(Integer::compare).get();
        System.out.println(""+min);
        System.out.println(""+max);
        System.out.println(""+Stream.of(2,5,6,7,9).mapToInt(x->x).min().getAsInt());
        System.out.println(""+Stream.of(2,5,6,7,9).mapToInt(x->x).max().getAsInt());
        System.out.println(""+Stream.of(2,5,6,7,9).mapToInt(x->x).sum());
    }
}
