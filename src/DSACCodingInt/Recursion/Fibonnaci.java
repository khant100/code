package DSACCodingInt.Recursion;

public class Fibonnaci {

    public int fibonachi(int n ){
        if(n==1||n==0){
            return n;
        }
        return fibonachi(n-1)+fibonachi(n-2);
    }

    public static void main(String[] args){
Fibonnaci fb = new Fibonnaci();
        System.out.println(" "+fb.fibonachi(7));


    }
}
