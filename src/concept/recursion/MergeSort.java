package concept.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    private void mergesort(int[] arr,int start,int end,int[] temp){
        if(start>=end){
            return;
        }
        int mid =(start+end)/2;
        mergesort(arr,start,mid,temp);
        mergesort(arr,mid+1,end,temp);
        merge(arr,start,mid,end,temp);
    }

    private void merge(int[] arr,int start,int mid,int end,int[] temp){

        int i=start;
        int j=mid+1;
        int k=start;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for (int x = start; x <= end; x++) {
            arr[x] = temp[x];
        }

    }

public static void main(String args[]){
        int[] arr = { 9, 4, 7, 6, 3, 1, 5};
        int[] temp = new int[arr.length];
        MergeSort m = new MergeSort();
    Arrays.stream(arr).forEach(x->System.out.print("->"+x));
        m.mergesort(arr,0,arr.length-1,temp);
        System.out.println();
    Arrays.stream(arr).forEach(x->System.out.print("->"+x));

}
}
