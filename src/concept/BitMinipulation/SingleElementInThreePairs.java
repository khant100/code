package concept.BitMinipulation;

import java.util.Arrays;

public class SingleElementInThreePairs {

    // find single element in pair of 3 elements
    // there is only 1 single element all others are 3 pair
    //

//    public static int singleNumber(int[] arr){
//        int ans =0;
//
//        for(int i=0;i<32;i++){
//            int cnt =0;
//            for(int j=0;j<arr.length;j++){
//                if(arr[j]&(1<<i)){
//
//                }
//            }
//        }
//    }

    public static int singleNumber(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i=i+3){
            if(arr[i-1]!=arr[i]){
                return arr[i-1];
            }

        }
         return arr[arr.length-1];
    }
    public static int retsingNum(int[] arr){
        int ones =0;
        int twos =0;
        for(int i=0;i<arr.length;i++) {
            ones = (ones ^ arr[i])&~twos;
            twos = (twos^arr[i])&~ones;
        }
    return ones;
    }


    public static void main(String args[]) {
        int[] arr = { 2,4,6,7,4,4,6,7,6,7,2,2,5};
        int[] arr1 = { 2,4,6,7,4,4,6,7,6,7,2,8,2};
        System.out.println(singleNumber(arr));
      System.out.println( retsingNum(arr));
    }
}
