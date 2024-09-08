package DSACCodingInt.Recursion;

public class MagicIndex {

    /**
     *
     * Problem: A magic index in an array A[0...n - 1] is defined to be an index
     * such that A[i] = i. Given a sorted array of distinct integers, write a method
     * to find a magic index, if one exits, in array A.
     *
     * Follow up: what is the value are not distinct?
     *
     */
    public int magicInd(int[] arry){

        return magicIndex(arry,0,arry.length-1);
    }

    public int magicInd2(int[] arry){

        return magicIndex2(arry,0,arry.length-1);
    }
    private int magicIndex(int[] arry,int min,int max){

        if(min>max) {
            return -1;
        }
        int mid = min+(max-min)/2;
            if (arry[mid] == mid) {
                return mid;
            }
            else if (arry[mid] < mid) {
                return magicIndex(arry, mid + 1, max);
            }
            else  {
                return magicIndex(arry, min, mid - 1);
            }

    }

    private int magicIndex2(int[] arry,int min,int max){

        if(min>max) {
            return -1;
        }
        int mid = min+(max-min)/2;

        if (arry[mid] == mid) {
            return mid;
        }
        int minleft = Math.min(arry[mid],arry[mid-1]);
         int l= magicIndex(arry, 0, minleft);
         if(l>=0) {
             return l;
         }

         int maxright = Math.max(arry[mid],arry[mid+1]);
            int r= magicIndex(arry, maxright,arry.length-1 );

                return r;


    }

    public static void main(String[] args){
        System.out.println("n :");

    }
}
