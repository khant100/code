package concept.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSetSumWithDupli {

    // given arry with duplicates return all subsets without duplicate
    public static void subSetWDup(int[] arr,int index,int n,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> temp){
        ans.add(new ArrayList<>(temp));
        if(index==n){
            return;
        }

        for(int i=index;i<n;i++){
           if(i>index&&arr[i]==arr[i-1])continue;

            temp.add(arr[i]);
            subSetWDup(arr, i+1, n, ans, temp);
            temp.remove(temp.size()-1);
        }


    }

    public static void main(String args[]){
        SubSetSumWithDupli sd = new SubSetSumWithDupli();
        int[] arr = {1,2,2};
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        subSetWDup(arr,0,arr.length,res,new ArrayList<>());
        res.stream().forEach(x->System.out.println(x));
    }
}
