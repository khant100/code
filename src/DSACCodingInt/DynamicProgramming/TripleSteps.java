package DSACCodingInt.DynamicProgramming;

import java.util.Arrays;

/**
 *
 * Problem: A child is running up a staircase with n steps and can hop either 1
 * step, 2 steps, or 3 steps at a time. Implement a method to count how many
 * possible ways the child can run up the stairs.
 *
 */
public class TripleSteps {

    private static int waysP(int stairs){
        int[] arry = new int[stairs+1];
        Arrays.fill(arry,-1);
       return waysc(stairs,arry);
    }
    public static int waysc(int stairs ,int[] arry){

        if(stairs<0){
            return 0;
        }else if(stairs==0){
            return 1;
        }else if(arry[stairs]>-1) {
            return arry[stairs];
        }else{
                arry[stairs]= waysc(stairs-1,arry)+waysc(stairs-2,arry)+waysc(stairs-3,arry);
            return arry[stairs];
        }

    }

    public static void main(String[] args){
        System.out.println("n :"+waysP(4));
    }

}
