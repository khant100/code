package concept.DynamicProgramming;



// fibonachi number =F(n-1) +F (n-2)
public class Fibonnachi

{


    public int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

        int prev=1;
        int prev0=0;
        int res=0;
        for(int i=2;i<=n;i++){
            res = prev+prev0;
            prev0=prev;
            prev=res;
            System.out.println("->"+prev);
        }
return prev;
    }
    public static void main(String args[]){

        Fibonnachi f = new Fibonnachi();
        System.out.println("Fibonnac"+f.fibonacci(5));

    }


}
