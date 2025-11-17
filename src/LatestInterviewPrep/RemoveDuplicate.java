package LatestInterviewPrep;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] arry = {9,66,3,9,3,66,1,3,2,7,9,55};

        //Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));
        int findlength=arry.length;
        for(int i=0;i<arry.length;i++){
            for(int j=i+i;j<arry.length;j++){
                if(arry[i]!=-1&&arry[i]==arry[j]){
                    arry[j]=-1;
                    findlength--;

                }
            }
        }

        int[] arry1 = new int[findlength];
        int count=0;
        for(int i=0;i<arry.length;i++){
            if(arry[i]!=-1){
                arry1[count]=arry[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arry));
        System.out.println(Arrays.toString(arry1));


    }
}
