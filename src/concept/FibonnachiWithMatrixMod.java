package concept;


//You are given an integer ‘N’, your task is to find and return the N’th Fibonacci number using matrix exponentiation.
//
//        Since the answer can be very large, return the answer modulo 10^9 +7.
//
//        Fibonacci number is calculated using the following formula:
//        F(n) = F(n-1) + F(n-2),
//        Where, F(1) = F(2) = 1.
//        For Example:


//    1 0  1 1
//    0 1  1 0
public class FibonnachiWithMatrixMod {

   static int MOD = 1000000007;

    public static long[][] multipleMatrix(long[][] A,long[][] B){

        long[][] result = new long[2][2];
        result[0][0] = (A[0][0] * B[0][0] + A[0][1] * B[1][0]) % MOD;
        result[0][1] = (A[0][0] * B[0][1] + A[0][1] * B[1][1]) % MOD;
        result[1][0] = (A[1][0] * B[0][0] + A[1][1] * B[1][0]) % MOD;
        result[1][1] = (A[1][0] * B[0][1] + A[1][1] * B[1][1]) % MOD;
        return result;

    }
    public static long[][] matrix(long[][] giv,long n){
        long[][] result = {{1,0},{0,1}};
        long[][] base = giv;
        while(n>0){
            if(n%2==1){
                result = multipleMatrix(result,base);
            }
            base = multipleMatrix(base,base);
            n/=2;
        }
        return result;
    }
    public static long fibonachi(int n){
        long[][] a = {{1,1},{1,0}};
        long[][] result = matrix(a,n-1);

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return result[0][0];

    }

public static void main(String args[]){

        int n =4;
        System.out.println(fibonachi(4));

}


}
