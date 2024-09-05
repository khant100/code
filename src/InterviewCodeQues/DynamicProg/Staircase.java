package InterviewCodeQues.DynamicProg;

public class Staircase {

    public static int ways(int n ){
        if(n==0) return  1;
        if(n==1) return 1;

        int[] ways = new int[n+1];
        ways[0]=1;
        ways[1]=1;
        for(int i=2;i<=n;i++){
            ways[i]=ways[i-1]+ways[i-2];
        }

        return ways[n];
    }
    public static void main(String args[]) {
        int N = 5;
        System.out.println("Number of unique ways to climb " + N + " steps: " + ways(N));
    }
}
