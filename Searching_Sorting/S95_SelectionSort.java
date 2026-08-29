package DSA.Searching_Sorting;

import java.util.Arrays;

/*
Question:
Given an integer array nums, sort the array in ascending order using Selection Sort.
Input:
        int[] nums = {64,25,12,22,11};
        int[] nums1 = {3,1,2};
        int[] nums2 = {1,2,3};
Example 1:
Output:
11 12 22 25 64
Explanation:
Find the minimum element from the unsorted part and place it at the beginning.
Example 2:
Output:
1 2 3
Explanation:
The smallest element is repeatedly selected and placed in its correct position.
Example 3:
Output:
1 2 3
Explanation:
The array is already sorted.
--------------------------------------------------
*/
public class S95_SelectionSort {
    public static int []  selectionSort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {64,25,12,22,11};
        int[] nums1 = {3,1,2};
        int[] nums2 = {1,2,3};
        System.out.println(Arrays.toString(selectionSort(nums)));
        System.out.println(Arrays.toString(selectionSort(nums1)));
        System.out.println(Arrays.toString(selectionSort(nums2)));



    }
}
