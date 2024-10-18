package concept.recursion;

import java.util.Arrays;

public class QuickSort {


private void quicksort(int low, int high,int[] given){
// time complexity is N logN

    // no extera space but we are using recursion stack space

    if(low<high){
        int pivot = pivot(low,high,given);
        quicksort(low,pivot-1,given);
        quicksort(pivot+1,high,given);
    }


}
private int pivot(int low,int high,int[] given){
    int mid = given[low];
    int i =low;
    int j=high;
    while(i<j){

        while(given[i]<=mid){
            i++;
        }
        while(given[j]>mid&&j>=low+1){
            j--;
        }
        if(i<j){
            swap(i,j,given);
        }

    }
    swap(low,j,given);
    return j;
}
private void swap(int i,int j,int[] arr){
    int tem = arr[i];
    arr[i]=arr[j];
    arr[j]=tem;

}


    public static void main(String args[]){
    int[] arr = {4,6,2,5,7,9,1,3};
    int[] ar1 = { 3, 2, 1, 12, 4, 5, 3 };
        QuickSort q = new QuickSort();
        q.quicksort(0,arr.length-1,arr);
        q.quicksort(0,ar1.length-1,ar1);
        Arrays.stream(arr).forEach(x->System.out.print("-> "+x));
        System.out.println(Arrays.toString(ar1));

    }
}
