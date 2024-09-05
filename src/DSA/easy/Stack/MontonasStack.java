package DSA.easy.Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class MontonasStack {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack =  new Stack();
        if(nums1.length==0||nums2.length==0){
            return new int[0];
        }

        for(int i=nums2.length-1;i>=0;i--){

            if(!stack.isEmpty()){
                while(!stack.isEmpty()&& stack.peek()<=nums2[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
            System.out.println("map "+map);
            System.out.println(" stack"+stack);




        }
        for(int j=0;j<nums1.length;j++){
            nums1[j]=map.get(nums1[j]);
        }
        return nums1;


    }
    public static void main(String args[]){

        MontonasStack montonasStack = new MontonasStack();
       int[] num1= {4,2};
        int[] nums2 = {1,4,3,2};
        System.out.println(" "+ Arrays.stream(montonasStack.nextGreaterElement(num1,nums2)).asLongStream().mapToObj(x->x).collect(Collectors.toList()));
        System.out.println(" ");

    }
}
