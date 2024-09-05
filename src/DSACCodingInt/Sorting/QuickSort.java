package DSACCodingInt.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void Quicksort(int[] arr ,int big,int end){
        int index = partation(arr,big, end);
        if(big<index-1){
            Quicksort(arr,big,index-1);
        }
        if(index<end){
            Quicksort(arr,index,end);
        }


    }

    private static int partation(int[] arry,int beg,int end){
        int mid = arry[(beg+end)/2];

        while(beg<=end) {
            while (arry[beg] < mid) {
                beg++;
            }
            while (arry[end] > mid) {
                end--;
            }

            if(beg<=end){
                swap(arry,beg,end);
                beg++;
                end--;
            }

        }
        return beg;
    }

private static void swap(int[] arr,int big, int end){
        int  temp = arr[big];
        arr[big]=arr[end];
        arr[end]=temp;
}
    public static void main(String[] args){
        int[] nums = { 3, 2, 1, 12, 4, 5, 3 };
        System.out.println(Arrays.toString(nums));
        Quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
}

