package InterviewCodeQues;

//Given an array of size N-1 such that it only contains
//        distinct integers in the range of 1 to N. Find the missing element.
public class Problem2 {
    static int MissingNumber(int array[], int n) {
        // Your Code Here
        // write api to verify email
        

        int sumofN =n*(n+1)/2;
        int sumofArray=0;
        for(Integer i :array){
            sumofArray+=i;
        }

        return sumofN-sumofArray;
    }

    public static void main(String args[]){

        int[] a = {1,2,3,5};
        int[] b ={6,1,2,8,3,4,7,10,5};
        System.out.println("missing element in Array "+MissingNumber(a,5));
        System.out.println("missing element in Array "+MissingNumber(b,10));

    }

}
