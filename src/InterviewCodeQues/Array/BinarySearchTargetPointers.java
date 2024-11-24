package InterviewCodeQues.Array;

import java.util.Arrays;

public class BinarySearchTargetPointers {


    private int binarySarch(int st,int end,int tar,int po,int[] arr){
        int left=st;
        int right =end;
        int mid = (st+end)/2;
        int res =-1;
        while(left<=right){
            mid=(right+left)/2;
            if(arr[mid]==tar){
                res=mid;
                if(po==0){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else if(arr[mid]<tar){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return res;

    }

    private int[] pointer(int[] arr,int tar){
        int[] res = {-1,-1};

        if(binarySarch(0,arr.length-1,tar,0,arr)!=-1){
            res[0]=binarySarch(0,arr.length-1,tar,0,arr);
        }
        res[1]=binarySarch(0,arr.length-1,tar,1,arr);
        return res;
    }
    public static void main(String args[]){
        int[] arr = {4,5,6,9,9,10};

        BinarySearchTargetPointers b = new BinarySearchTargetPointers();
       Arrays.stream(b.pointer(arr,8)).forEach(x->System.out.println(x));

    }
}
