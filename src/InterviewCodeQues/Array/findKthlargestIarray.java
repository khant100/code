package InterviewCodeQues.Array;

import java.util.PriorityQueue;

public class findKthlargestIarray {

    public static int minheap(int[] arr,int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(Integer i: arr){
            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(minheap(nums,3));
    }
}
