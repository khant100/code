package DSA.easy.Graph;

public class TwoJudge {

    public int findJudge(int n, int[][] trust) {
        int count=0;
        int key=0;

        int[] at = new int[n+1];

        for(int i=0;i<trust.length;i++){
            at[trust[i][1]]++;
            System.out.println( " 1st "+trust[i][1]);
        }
        int answer = 0;

        for(int i=1;i<=n;i++){
            System.out.println(" 2nd "+ at[i]);
            if(at[i]==n-1){
                answer=i;
            }
        }

        for(int i=0;i<trust.length;i++){
            if(trust[i][0]==answer){
                return -1;
            }
        }

        return answer==0?-1 :answer;
    }


    public static void main(String args[]){
        TwoJudge twoJudge = new TwoJudge();
        int[][] ab = {{1,3},{2,3},{3,1}};
       System.out.println( " ans"+twoJudge.findJudge(3,ab));



    }
}
