package concept.recursion;

public class SumOFNNumber {

    public void sumN(int i,int sum){
        // recursion using parameter and void function
        if(i<1){
            System.out.println(" "+sum);
            return;
        }
        System.out.print(": -> :"+sum);
        sumN(i-1,sum+i);
    }

    public int sumNum(int n){
        if(n==0){
            return 0;
        }
        System.out.print("-< "+n);
    return n+sumNum(n-1);
    }

    public static void main(String args[]){

        SumOFNNumber sum = new SumOFNNumber();
        sum.sumN(10,0);
        System.out.println("sum with function : "+sum.sumNum(10));
    }
}
