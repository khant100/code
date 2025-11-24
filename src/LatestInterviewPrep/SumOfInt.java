package LatestInterviewPrep;

import java.util.List;

public class SumOfInt {
    public static void main(String[] args){

       System.out.println( List.of(1,3,2,4,5).stream().mapToInt(x->x).sum());
        System.out.println( List.of(1,3,2,4,5).stream().reduce(0,(a,b)->a+b));
        System.out.println( List.of(1,3,2,4,5).stream().reduce(1,(a,b)->a*b));

    }
}
