package concept.BitMinipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class SingleElementInArray {

    // doing it bitwise way
    // Xor of 2 similial number is =0
    // if we XoR from 0th index to n-1 index of array
    // the number appering only 1s will be leftout

    public int oneOccurance(int[] given){
        int xor = 0;

        for(Integer i :given){
            xor^=i;
        }
        return xor;
    }

    public static void main(String args[]){
        int[] arr = {4,1,2,2,1};
SingleElementInArray s = new SingleElementInArray();
     Integer a =Arrays.stream(arr).mapToObj(x->(Integer)x).collect(Collectors.groupingBy(x->x,Collectors.counting()))
                      .entrySet().stream().filter(x->x.getValue()==1).collect(Collectors.toList()).get(0).getKey();
    System.out.println("number occcurance 1 time = "+a);
        System.out.println("number occcurance 1 time = "+s.oneOccurance(arr));
    }
}
