package concept.recursion;

import java.util.ArrayList;
import java.util.List;

public class KthPermutationOfNum {


   private String findKthPermute(int n ,int k){
        List<Integer> num = new ArrayList<>();
        int fact = 1;
        for(int i=1;i<n;i++){
            num.add(i);
            fact=fact*i;
        }
        num.add(n);
        k=k-1;
        String temp ="";
        while(true){
            int gr = k%fact;
            temp=temp+num.get(k/fact);
            num.remove(k/fact);
            if(num.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/num.size();
        }
return temp;
    }

    public static void main(String args[]){

       int n =3;
       int k = 3;
       KthPermutationOfNum kt = new KthPermutationOfNum();
System.out.println(kt.findKthPermute(4,17));
        System.out.println(kt.findKthPermute(n,n));
    }
}
