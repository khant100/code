package concept.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCombination {


    private void combination(int index,int[] arr,int target,List<List<Integer>> ans, List<Integer> temp){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(arr[index]<=target){
            temp.add(arr[index]);
            combination(index,arr,target-arr[index],ans,temp);
            temp.remove(temp.size()-1);
        }
        combination(index+1,arr,target,ans,temp);

    }
    public static void main(String args[]){
        int[] arr = {2,3,6,7};
        List<List<Integer>> res = new ArrayList<>();
        LeetCombination lc = new LeetCombination();
        lc.combination(0,arr,7,res,new ArrayList<>());
        res.stream().forEach(x->System.out.println(x));


    }
}
