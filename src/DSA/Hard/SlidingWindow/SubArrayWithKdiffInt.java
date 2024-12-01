package DSA.Hard.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithKdiffInt {
//    Given an integer array nums and an integer k, return the number of good subarrays of nums.
//
//    A good array is an array where the number of different integers in that array is exactly k.
//
//    For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
//    A subarray is a contiguous part of an array.
//
//
//
//            Example 1:
//
//    Input: nums = [1,2,1,2,3], k = 2
//    Output: 7
//    Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
//    Example 2:
//
//    Input: nums = [1,2,1,3,4], k = 3
//    Output: 3
//    Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].

    public static int subarraysWithKDistinct(int[] nums, int K) {
        int[] numFreq = new int[nums.length+1];
        int distinct = 0, start = 0, minEnd = 0, total = 0;
        while (distinct == K || minEnd < nums.length) {
            while (distinct < K && minEnd < nums.length)
                if (numFreq[nums[minEnd++]]++ == 0)
                    distinct++;
            int maxEnd = minEnd;
            while (maxEnd < nums.length && numFreq[nums[maxEnd]] > 0)
                maxEnd++;
            while (distinct == K) {
                if (numFreq[nums[start++]]-- == 1)
                    distinct--;
                total += (maxEnd - minEnd + 1);
            }
        }
        return total;
    }

    public static int findNsub(int[] nums,int k){
        int l=0;
        int count=0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int r=0;r<nums.length;r++){
            if(m.containsKey(nums[r])){
                m.put(nums[r],m.get(nums[r])+1);
            }else{
                m.put(nums[r],1);
            }

            while(m.size()>k){
                m.put(nums[l],m.get(nums[l])-1);
                if(m.get(nums[l])==0){
                    m.remove(nums[l]);
                }
                l++;
            }
            count+=r-l+1;

        }
        return count;
    }
    public static int subarraysWithKDistinct1(int[] nums, int k) {
        return findNsub(nums,k)-findNsub(nums,k-1);
    }
    public static void main(String args[]){

        System.out.println(subarraysWithKDistinct1(new int[]{1,2,1,2,3},2));
        System.out.println(subarraysWithKDistinct1(new int[]{1,2,1,3,4},3));
        System.out.println(subarraysWithKDistinct(new int[]{1,2,1,2,3},2));
        System.out.println(subarraysWithKDistinct(new int[]{1,2,1,3,4},3));
    }
}

