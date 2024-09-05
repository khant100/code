package DSACCodingInt.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arry){
     int[] nums = new int[arry.length];
     mergeSort(arry,nums,0,arry.length-1);
    return arry;
    }

    private static void mergeSort(int[] given,int[] help,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergeSort(given,help,low,mid);
            mergeSort(given,help,mid+1,high);
            merge(given,help,low,mid,high);
        }

    }
private static void merge(int[] given,int[] help,int low ,int mid,int high){
        for(int i=0;i<help.length;i++){
            help[i] =given[i];
        }
        int leftHelp = low;
        int leftRight = mid+1;
        int current =low;

        while(leftHelp<=mid && leftRight<=high){
            if(help[leftHelp]<help[leftRight]){
                given[current]=help[leftHelp];
                leftHelp++;
            }else{
                given[current]=help[leftRight];
                leftRight++;
            }
        current++;
        }

        int rem = mid - leftHelp;
        for(int i=0;i<rem;i++){
            given[current+i]=help[leftHelp+1];
        }

}



public static void mergeSort1(int[] given){
     int[] proxy = new int[given.length];
     for(int i=0;i<given.length;i++){
         proxy[i]=given[i];
     }
     merge1(given,proxy,0,given.length-1);
}

private static void   merge1(int given[],int proxy[],int st, int fn){
        if(st<fn){
            int mid = (st+fn)/2;
            merge1(given,proxy,st,mid);
            merge1(given,proxy,mid+1,fn);
            mergeSort2(given,proxy,st,mid,fn);
        }


}
    private static void  mergeSort2(int[] given,int[] proxy,int st,int mid,int fn){
        int top=st;
        int bottom = mid+1;
        int current=st;
        while(top<=mid&&bottom<=fn){
            if(proxy[top]<proxy[bottom]){
                given[current]=proxy[top];
                top++;
            }else{
                given[current]=proxy[bottom];
                bottom++;
            }
            current++;
        }
        int rem= mid-current;
        for(int i=0;i<rem;i++){
            given[current+i]=proxy[top+i];
        }

    }

public static void main(String[] args){


        int[] nums = { 1, 2, 3, 5, 2, 4, 6, 7 };
    System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(mergeSort(nums)));
    mergeSort1(nums);
System.out.println(Arrays.toString(nums));
    }
}
