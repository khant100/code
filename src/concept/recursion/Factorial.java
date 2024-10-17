package concept.recursion;

public class Factorial {

    public void fact(int i,int sum){
        // recursion using parameter and void function
        if(i==1){
            System.out.println(" "+sum);
            return;
        }
        System.out.print(": -> :"+sum);
        fact(i-1,sum*i);
    }

    public int factNum(int n){
        if(n==1){
            return 1;
        }
        System.out.print("-< "+n);
        return n*factNum(n-1);
    }

    public static void main(String args[]){
        Factorial fact = new Factorial();
        fact.fact(1,6);
        System.out.println(fact.factNum(6));
    }
}

// time and space complexity