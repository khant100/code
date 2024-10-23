package concept.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutation {


    public void printall(int[] arr,List<List<Integer>> ans,boolean[] vis,List<Integer> temp){

        if(temp.size()==arr.length) {
            //if (temp.size() == n) {
                ans.add(new ArrayList<>(temp));

            //}
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!vis[i]) {
                vis[i]=true;
                temp.add(arr[i]);
                printall(arr, ans, vis, temp);
                temp.remove(temp.size() - 1);
                vis[i]=false;
            }
        }
    }

    public static void main(String[] args){

        int arr[] = {1,2,3};
        PrintAllPermutation p  = new PrintAllPermutation();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean vis[] = new boolean[arr.length];
         p.printall(arr,ans,vis,temp);
        ans.stream().forEach(x->System.out.println(x));

    }
}
