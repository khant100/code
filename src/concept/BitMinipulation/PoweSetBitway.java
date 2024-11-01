package concept.BitMinipulation;

import java.util.ArrayList;
import java.util.List;

public class PoweSetBitway {

    public static void generatePowerSet(int[] arr,List<List<Integer>> result){

        int len = 1<<arr.length;
        for(int i=0;i<len;i++){
            List<Integer> lis = new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                if((i&(1<<j))!=0){
                    System.out.println(" i= "+i+" j= "+j+" 1<<j= "+(1<<j)+" arr[j]= "+arr[j]);
                    lis.add(arr[j]);
                }
            }
            System.out.println();
            result.add(lis);
        }
    }


    public static void main(String args[]){
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        generatePowerSet(arr,ans);
        ans.stream().forEach(x->System.out.println(x));

    }
}
