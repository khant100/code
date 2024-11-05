package concept.BitMinipulation;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSingleNumber {

    // having xor with all numbers in array so all number occuring
    // even number of times will cancle eachother
    // finally it will be xor of 2 number occuring odd number of  times
    // so both since they both are unique number there will be difference of atleat 1 setbit
    // xor & xor-1 will eliminate right most part of number
    //doing xor ^  xor will provide us with right most part
    // eg 10 1010 (1010 & 1001) = (1000) =8 (8 ^ 10) =(1000 ^ 1010)=(0010)=2 2 is right most part
    public static int[] findTwoNumber(int[] arr){
        int xor = 0;
        for(int a : arr){
            xor=xor^a;
        }
System.out.println(" xor"+xor);
        int rightmostbit = (xor&xor-1)^xor;

        System.out.println(" (xor&xor-1)="+(xor&xor-1));
        System.out.println(" right="+rightmostbit);
        int xor1=0;
        int xor2=0;
        for(int a: arr){
            if((a&rightmostbit)==0){
                xor1^=a;
            }else{
                xor2^=a;
            }
        }
        System.out.println(" xor1="+xor1);
        System.out.println(" xor2="+xor2);

int[] ans = {xor1,xor2};
        return ans;
    }
    public static void main(String args[]){

        int[] arr = {4,2,3,4,7,5,3,2,7,6};
        Arrays.stream(findTwoNumber(arr)).mapToObj(x->(Integer)x).collect(Collectors.toList()).forEach(x->System.out.println(x));
        Arrays.stream(arr).mapToObj(x->(Integer)x).collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()==1).
                map(x->x.getKey()).collect(Collectors.toList()).forEach(x->System.out.println(x));

    }
}
