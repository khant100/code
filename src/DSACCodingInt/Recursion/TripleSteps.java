package DSACCodingInt.Recursion;

public class TripleSteps {
    public static int ways(int stairs){
        int ways =0;
        if(stairs<0){
            return 0;
        }else if(stairs==0){
            return 1;
        }else{
            return ways+ways(stairs-1)+ways(stairs-2)+ways(stairs-3);
        }

    }

    public static void main(String[] args){
        System.out.println("n :"+ways(4));
    }
}
