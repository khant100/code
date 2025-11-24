package LatestInterviewPrep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumber {

    public static boolean isPrime(int n ){
        if(n<=1){
            return false;
        }
        if (n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }

        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;

    }
    public static void main(String[] args){

        // find prime number
        List<Integer> pList =new ArrayList<>();
        pList.add(2);
        boolean f=true;
        for(int i=3;i<=100;i++){
            f=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    f=false;
                    break;
                }
            }
            if(f){
                pList.add(i);
            }
        }

        IntStream.rangeClosed(1,100).filter(x->isPrime(x)).forEach(x->System.out.print(x+" "));
        System.out.println("------ ---------");

        pList.stream().forEach(x->System.out.print(x+" "));
    }
}
