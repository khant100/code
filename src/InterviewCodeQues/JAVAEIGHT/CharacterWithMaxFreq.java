package InterviewCodeQues.JAVAEIGHT;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterWithMaxFreq {

//    Input: arr[] = [8, 3, 1, 2,2,8,8,8]
//
//    print repeated number in the given array
//
//    String str="AAABBCCDDEEFFGG"
//
//    write a logic more repeated character in the given string

    public static void main(String args[]){
        int[] arr1 = {8, 3, 1, 2,2,8,8,8};
       int maxf = Arrays.stream(arr1).boxed().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        Integer[] arr = {8, 3, 1, 2,2,8,8,8};
       Integer maxFreq= Arrays.asList(arr).stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
        String str="AAABBCCDDEEFFGG";
      char c=  str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()))
                        .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
       System.out.println(maxf);
        System.out.println(maxFreq);
        System.out.println(c);

    }

}
