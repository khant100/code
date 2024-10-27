package DSACCodingInt.Searching;

public class BinarySearch {


    public static Integer binarySearchIterative(int value,int[] arr){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>value){
                end =mid-1;
            } else if (arr[mid]<value) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return null;
    }

    public static Integer binarySearchRecursive(int start,int end,int[] arr,int value){
        if(start>=end){
            return null;
        }
        int mid =(start+end)/2;
        if(arr[mid]<value){
         return   binarySearchRecursive(mid+1,end,arr,value);
        } else if (arr[mid]>value) {
            return   binarySearchRecursive(start,mid-1,arr,value);
        }else {
            return mid;
        }


    }



    public static void main(String args[]){
        System.out.println(binarySearchRecursive(0,8,new int[]{ -3, -1, 0, 2, 9, 22, 23, 25, 53 }, -1));
       System.out.println(binarySearchIterative(2,new int[]{ -5, -4, 0, 1, 2 }));

    }
}

