package DSA.revision.day1;
/*
Question:
Given an integer array nums, return an array answer such that answer[i] is equal to
the product of all the elements of nums except nums[i].

You must solve it without using division and in O(n) time.

Example 1:
Input:
int[] nums = {1,2,3,4};

Output:
[24,12,8,6]

Example 2:
Input:
int[] nums = {-1,1,0,-3,3};

Output:
[0,0,9,0,0]
*/

import java.util.Arrays;

public class q1 {
    public static  int [] product(int nums[]){
        int n=nums.length;
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            left[i]=suffix*left[i];
            suffix*=nums[i];
        }
        return left;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(product(nums)));
        int[] nums1 = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(product(nums1)));

    }
}
