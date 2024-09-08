package DSACCodingInt.Math;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrime {

    public static boolean isPrime(int num){
        if(num==2||num==3){
            return true;
        }
        if(num%2==0||num%3==0){
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;

    }
public static List<Integer> generatePrimeList(int limit){

    List<Integer> mat = new ArrayList<>();

    for(int i=2;i<=limit;i++) {


        if (isPrime(i)) {
            mat.add(i);
        }
    }
return mat;
}

    public static void main(String[] args) {

        int limit = 200;
        List<Integer> prime = generatePrimeList(limit);
        System.out.println("clist of prime"+prime);

    }
}
