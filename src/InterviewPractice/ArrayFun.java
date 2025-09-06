package InterviewPractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayFun {

//    1. Write a function which takes an array of n integers where array[i] is in the range of [1, n],
//    returns an array of all the integers in the range [1, n] that do not appear in the array.
//            Example: ---------------- 1) getDisappearedNumber([4,3,2,7,8,2,3,1]); // [5,6] 2) getDisappearedNumber([1,1]); // [2]

    public static List<Integer> missingArray(int[] given){

        for(int i=0;i<given.length;i++){
            int value=Math.abs(given[i])-1;
            if(given[value]>0){
                given[value]=-given[value];
            }
        }

      return IntStream.range(0,given.length).filter(i->given[i]>0).map(i->i+1).boxed().collect(Collectors.toList());


    }
    public static void main(String args[]){

        int[] given = {1,1};
        int[] given1 = {4, 3, 2, 7, 8, 2, 3, 1};
        missingArray(given).stream().forEach(System.out::print);
        System.out.println();
        missingArray(given1).stream().forEach(System.out::print);


    }
}
