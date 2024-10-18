package concept.recursion;

import java.util.ArrayList;
import java.util.List;

public class printAllsubSequencewithKsum {

// time complexity is 2 to power N

    public void sumofKth(int k,int[] arr,ArrayList<Integer> list,int index,int sum){

        if(index==arr.length){

            if(sum==k){
                System.out.println(list);
                return;
            }
            return;
        }
        list.add(arr[index]);
        sum+=arr[index];
        sumofKth(k,arr,list,index+1,sum);

        sum-=arr[index];
        list.remove(list.size()-1);
        sumofKth(k,arr,list,index+1,sum);


    }
    public Boolean sumofKthB(int k,int[] arr,ArrayList<Integer> list,int index,int sum){

        if(index==arr.length){

            if(sum==k){
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(arr[index]);
        sum+=arr[index];
        if(sumofKthB(k,arr,list,index+1,sum)==true){
            return true;
        }

        sum-=arr[index];
        list.remove(list.size()-1);
       if(sumofKthB(k,arr,list,index+1,sum)){
           return true;
       }
return false;

    }

    public int sumofKthI(int k,int[] arr,int index,int sum){
// count number of subsequence
        if(index==arr.length){

            if(sum==k){
                return 1;
            }
            return 0;
        }

        sum+=arr[index];
        int l= sumofKthI(k,arr,index+1,sum);

        sum-=arr[index];
      int r =  sumofKthI(k,arr,index+1,sum);
return l+r;

    }

    public static void main(String args[]){

        int[] arr = {1,2,1};
        ArrayList list = new ArrayList<>();
        printAllsubSequencewithKsum p = new printAllsubSequencewithKsum();
        p.sumofKth(2,arr,list,0,0);
        System.out.println("-> "+p.sumofKthB(2,arr,list,0,0));
        System.out.println("-> Number of subsequence->"+p.sumofKthI(2,arr,0,0));


    }


}
