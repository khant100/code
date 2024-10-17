package concept.recursion;

import java.util.Arrays;

public class ReverseArray {

    public void reverseArray(int[] given,int i, int j){

        if(i>j){
            return;
        }
        swap(given,i,j);
        reverseArray(given,i+1,j-1);
    }
    public void swap(int[] giv,int i,int j){
        int temp = giv[i];
        giv[i]=giv[j];
        giv[j]=temp;
    }


    public static void main(String args[]){
        int[] given = {1,2,3,4,5,6,7,8,9,0};

        ReverseArray res = new ReverseArray();
        Arrays.stream(given).forEach(x->System.out.print("-> "+x));
        System.out.println();
        res.reverseArray(given,0,given.length-1);
        Arrays.stream(given).forEach(x->System.out.print("-> "+x));
    }
}
