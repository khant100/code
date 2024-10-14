package concept.recursion;

public class RecursionWithParam {

    // find sum of n numbers

    public void sum(int i,int s){

        if(i<1){
            System.out.println("sum is "+s);
            return ;
        }
        System.out.println("sum is -->"+s);
       sum(i-1,s+i);
    }


    // functional way

    public int summ(int N){
        if(N==0){
            return 0;
        }
        System.out.println("sum is :: "+N);
        return N+summ(N-1);
    }

    public static void main(String args[]){
        RecursionWithParam rs  = new RecursionWithParam();
        rs.sum(6,0);
        System.out.println("sum of 1 to 6 is "+rs.summ(6));
    }
}
