package concept.recursion;

import java.util.ArrayList;
import java.util.List;

public class CountInversion {
    private static int countIn(int[] arr){
        // brut force
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
    return count;
    }
   private static int merger(int st,int mid , int end, int[] arr){
        int left = st;
        int right =mid+1;
        int cnt=0;
       List<Integer> lis = new ArrayList<>();

       while(left<=mid&&right<=end){
           if(arr[left]<=arr[right]){
               lis.add(arr[left]);
               left++;
           }else{
               lis.add(arr[right]);
               cnt+=(mid-left+1);
               right++;
           }
       }
       while(left<=mid){
           lis.add(arr[left]);
           left++;
       }
       while(right<=end){
           lis.add(arr[right]);
           right++;
       }

       for(int i=st;i<=end;i++){
            arr[i]=lis.get(i-st);
       }
   return cnt;
    }
    public static int mergerSort(int st,int end,int[] arr){
        int cnt =0;
        int mid=(st+end)/2;
        if(st>=end){
            return cnt;
        }
        // optimise solution using merge sort
        cnt=cnt+mergerSort(st,mid,arr);
        cnt=cnt+mergerSort(mid+1,end,arr);
        cnt=cnt+merger(st,mid,end,arr);
return cnt;
    }

    private static int numOfIn(int[] arr){

        int n =arr.length;
        return mergerSort(0,n-1,arr);

    }
    public static void main(String args[]){
        int[] arr = {5,3,2,4,1};
            System.out.println(countIn(arr));
        System.out.println(numOfIn(arr));

    }
}
