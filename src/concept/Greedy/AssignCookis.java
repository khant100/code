package concept.Greedy;

import java.util.Arrays;

public class AssignCookis {

//    Problem Statement: Given two arrays representing children’s green factor and cookie sizes,
//    the goal is to maximise the number of content children.
//
//    Each child i has a greed factor of g[i],
//    which is the minimum size of a cookie that will make the child content.
//    Each cookie j has a size of s[j]. If s[j] >= g[j], we can assign cookie j to child i,
//    making the child content. Each child can only receive one cookie.

    private static int findContentChildren(int[] greed,int[] cookie){
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int left=0;
        int right=0;
        while(left<greed.length&&right<cookie.length){
            if(greed[left]<=cookie[right]){
                left++;
            }
            right++;
        }
        return left;
    }
    public static void main(String[] args) {
        int[] greed = {1, 5, 3, 3, 4};
        int[] cookieSize = {4, 2, 1, 2, 1, 3};

        System.out.print("Array Representing Greed: ");
        for (int i = 0; i < greed.length; i++) {
            System.out.print(greed[i] + " ");
        }
        System.out.println();

        System.out.print("Array Representing Cookie Size: ");
        for (int i = 0; i < cookieSize.length; i++) {
            System.out.print(cookieSize[i] + " ");
        }

        int ans = findContentChildren(greed, cookieSize);

        System.out.println();
        System.out.println("No. of kids assigned cookies " + ans);
        System.out.println();
    }
}
