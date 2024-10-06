package InterviewCodeQues.Array;

//Input: nums = [1,1,0,1]
//        Output: 3
//        Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers
//        with value of 1'
public class ConsicutiveOnes {

    private int longSubArray(int[] giv){
        int left = 0;
        int right=0;
        int nuOfone = 0;
        int maxlen=0;

        while(right<giv.length){

            if(giv[right]!=1){
                nuOfone++;
            }

            while(nuOfone>1){
                if(giv[right]!=1){
                    nuOfone--;
                }
                left++;
            }
maxlen = Math.max(maxlen,right-left);
right++;


        }
    return maxlen;



    }

    public static void main(String[] args) {
        ConsicutiveOnes cs = new ConsicutiveOnes();
        int[] given = {0,1,1,1,0,1,1,0,1};
        //cs.longSubArray(given);
        System.out.println("int[] given = {0,1,1,1,0,1,1,0,1}"+cs.longSubArray(given));

    }

}
