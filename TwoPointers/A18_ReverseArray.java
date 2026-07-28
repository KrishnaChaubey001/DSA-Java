package DSA.TwoPointers;

import java.util.Arrays;

/*
Question:
Given an integer array nums, reverse the array using two pointers.

Test Case 1
int[] nums = {1,2,3,4,5};

Test Case 2
int[] nums = {7,8,9};

Test Case 3
int[] nums = {10,20};

Output:
5 4 3 2 1
9 8 7
20 10
 */
public class A18_ReverseArray {
    public static int [] reverse(int nums[]){
        int i=0;
        int j= nums.length-1;
        while(i<j){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] nums1 = {7,8,9};
        int a[]=reverse(nums);
        int a1[]=reverse(nums1);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a1));
    }

}
