package InterviewCodeQues.Mapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewMphasis {

//    Sum : 5 , Pairs : [[2, 3], [1, 4]]
//
//    Sum : 6 , Pairs : [[2, 4], [1, 5]]
//
//    Sum : 7 , Pairs : [[2, 5], [3, 4], [1, 6]]
//
//    Sum : 8 , Pairs : [[2, 6], [3, 5], [1, 7]]
//
//    Sum : 9 , Pairs : [[2, 7], [3, 6], [1, 8], [4, 5]]
//
//    Sum : 10 , Pairs : [[2, 8], [3, 7], [4, 6]]
//
//    Sum : 11 , Pairs : [[3, 8], [5, 6], [4, 7]]
//
//    Sum : 12 , Pairs : [[5, 7], [4, 8]]
//
//    Sum : 13 , Pairs : [[5, 8], [6, 7]]
//
//    Map<Integer, List<List<Integer>>>


    public  static void main(String args[]){
        int[] arr = {2,3,5,7,1,8,4,6};
        Map<Integer,List<List<Integer>>> pair = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum =arr[i]+arr[j];
                List<Integer> templis = new ArrayList<>();
                templis.add(arr[i]);
                templis.add(arr[j]);
                if(pair.containsKey(sum)){
                    pair.get(sum).add(templis);
                }else{
                    List<List<Integer>> lis = new ArrayList<>();
                    lis.add(templis);
                    pair.put(sum,lis);
                }
            }
        }

        pair.entrySet().stream().
                filter(x->x.getValue().size()>=2).
                forEach(x->System.out.println("sum : "+x.getKey()+"  Pairs : "+x.getValue()));

    }
}
