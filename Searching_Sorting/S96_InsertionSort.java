package DSA.Searching_Sorting;

import java.util.Arrays;

/*
Question:
Given an integer array nums, sort the array in ascending order using Insertion Sort.
Input:
        int[] nums = {12,11,13,5,6};
        int[] nums1 = {5,2,4,6,1,3};
        int[] nums2 = {1,2,3,4};
Example 1:
Output:
5 6 11 12 13
Explanation:
Take each element and insert it into its correct position in the already sorted part of the array.
Example 2:
Output:
1 2 3 4 5 6
Explanation:
Elements are shifted to make space for the current element.
Example 3:
Output:
1 2 3 4
Explanation:
The array is already sorted.
--------------------------------------------------
*/
public class S96_InsertionSort {
    public static int [] insertionSort(int nums[]){
        for(int i=1;i< nums.length;i++){
            int j=i;
            while(j>0&& nums[j]<nums[j-1]){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                j--;
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {12,11,13,5,6};
        int[] nums1 = {5,2,4,6,1,3};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(insertionSort(nums)));
        System.out.println(Arrays.toString(insertionSort(nums1)));
        System.out.println(Arrays.toString(insertionSort(nums2)));

    }
}
