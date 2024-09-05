package DSA.Hard;

public class FindFirstMissing {

    public static void main(String[] args) {

        FindFirstMissing findFirstMissing = new FindFirstMissing();
        int[] abc = {3,4,-1,1};
        System.out.println(""+findFirstMissing.firstMissingPositive(abc));
    }


        public int firstMissingPositive(int[] nums) {
            int arrLen = nums.length;
            int currVal = 0;

            for(int i = 0; i < arrLen; i++){
                currVal = nums[i];
                if (currVal <= 0 || currVal > arrLen) {
                    nums[i] = arrLen + 1;

                }
                System.out.println("1st oper"+nums[i]);
            }

            for (int i = 0; i < arrLen; ++i) {
                int num = Math.abs(nums[i]);
                if (num <= arrLen) {
                    nums[num - 1] = -Math.abs(nums[num - 1]);
                    System.out.println("index: "+i+"value :"+num+"second oper inside"+nums[num-1]);
                }
                System.out.println("second oper "+nums[i]);
                //System.out.println("index: "+i+"value :"+num+"second oper inside"+nums[num-1]);
            }

            for(int i = 0; i < arrLen; i++){
                System.out.println("third oper"+nums[i]);
                if (nums[i] > 0){
                    return i+1;
                }
                //System.out.println("third oper"+nums[i]);
            }

            return arrLen + 1;

        }
    }

