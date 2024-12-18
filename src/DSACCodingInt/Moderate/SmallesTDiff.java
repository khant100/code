package DSACCodingInt.Moderate;

import java.util.Arrays;

public class SmallesTDiff {
    public static int findSmallestDifference1(int[] arrayA, int[] arrayB) {
        if (arrayA.length == 0 || arrayB.length == 0) return -1;

        int smallestDifference = Integer.MAX_VALUE;
        for (int a : arrayA) {
            for (int b : arrayB) {
                smallestDifference = Math.min(smallestDifference, Math.abs(a - b));
            }
        }
        return smallestDifference;
    }
    private static int findSmallestDifference(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int index=0;
        int index2=0;
        int min=Integer.MAX_VALUE;
        while(index<arr1.length&&index2<arr2.length){
            int diff = arr1[index]-arr2[index2];
            min=Math.min(min,Math.abs(diff));
            if(arr1[index]<arr2[index2]){
                index++;
            }else{
                index2++;
            }

        }

        return min;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 15, 11, 2};
        int[] array2 = {23, 127, 234, 19, 8};
        int difference = findSmallestDifference(array1, array2);
        int difference1 = findSmallestDifference1(array1, array2);
        System.out.println(difference);
        System.out.println(difference1);
    }
}
