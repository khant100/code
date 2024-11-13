package InterviewCodeQues.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SecondHigestInArry {



    public static void main(String args[]){
        int[] given ={8,11,6,22,9,42,14};
        // getting second higest from array
      int secHig= Arrays.stream(given).mapToObj(x->(Integer)x).sorted().collect(Collectors.toList()).get(given.length-2);
        // getting higest from array
        System.out.println("second higest "+secHig);
        int hig =Arrays.stream(given).mapToObj(x->(Integer)x).max(Integer::compareTo).orElse(Integer.MAX_VALUE);
        // getting minimum element in array
        System.out.println("higest "+hig);
        int lowest = Arrays.stream(given).mapToObj(x->(Integer)x).min(Integer::compare).orElse(Integer.MIN_VALUE);
        System.out.println("lowest "+lowest);
        int sum = Arrays.stream(given).sum();
        System.out.println("sum of entire array "+sum);
    }
}
