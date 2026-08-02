package DSA.revision.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
Question:
Given an integer array nums, rotate the array to the right by k steps,
where k is non-negative.

Example 1:
Input:
int[] nums = {1,2,3,4,5,6,7};
int k = 3;

Output:
[5,6,7,1,2,3,4]

Example 2:
Input:
int[] nums = {-1,-100,3,99};
int k = 2;

Output:
[3,99,-1,-100]
*/
public class q5 {
    public static int[] rotate (int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j--;
        }
        return nums;
    }
    public static int [] rotateArray(int nums[],int k){
        int n=nums.length;
        k=k%n;
        rotate(nums,0,n-k-1);
        rotate(nums,n-k,n-1);
        rotate(nums,0,n-1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotateArray(nums,k)));
        int[] nums1 = {-1,-100,3,99};
        int k1 = 2;
        System.out.println(Arrays.toString(rotateArray(nums1,k1)));

    }
}
