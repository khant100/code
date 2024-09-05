package DSACCodingInt.Searching;

import java.util.Arrays;

public class SearchInsortedRotationArray {


    private static int search(int[] arry,int target){

        int top =0;
        int bottom = arry.length-1;
        int mid =0;
        if (arry==null || arry.length<1){
            return -1;
        }
        if(arry[top]==target){
            return top;
        }
        if(arry[bottom]==target){
            return bottom;
        }

        while(top+1<bottom){
             mid = (top+bottom)/2;
            if(arry[mid]==target){
                return mid;
            }
           if(arry[mid]<bottom){
            if(target>arry[mid]&&target<arry[bottom]){
                top=mid;
            }else{
                bottom=mid;
            }
           }
           else{
               if(target<arry[mid]&&target>arry[top]){
                   bottom=mid;
               }else{
                   top=mid;
               }

           }


        }
        return -1;
    }

    public static void main(String[] args){
        int[] num = {4 ,5, 6, 7,8, 0, 1, 2};
        //System.out.println("Num is");
        System.out.println("Num is "+search(num,6));


    }
}
