package DSA.Searching_Sorting;

import java.util.Arrays;

/*
Question:
Given an integer array nums, sort the array in ascending order using Bubble Sort.
Input:
        int[] nums = {5,1,4,2,8};
        int[] nums1 = {3,2,1};
        int[] nums2 = {1,2,3,4};
Example 1:
Output:
1 2 4 5 8
Explanation:
Repeatedly compare adjacent elements and swap them if they are in the wrong order.
Example 2:
Output:
1 2 3
Explanation:
After sorting, the elements are in ascending order.
Example 3:
Output:
1 2 3 4
Explanation:
The array is already sorted.
--------------------------------------------------
*/
public class S94_BubbleSort {
    public static int[] bubbleSort(int nums[]){
        for(int i=0;i<nums.length;i++){
            boolean swapped = false;

            for(int j=1;j<= nums.length-i-1;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
                swapped=true;
            }
            if(!swapped){
                break;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {5,1,4,2,8};
        int[] nums1 = {3,2,1};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(bubbleSort(nums)));
        System.out.println(Arrays.toString(bubbleSort(nums1)));
        System.out.println(Arrays.toString(bubbleSort(nums2)));


    }
}
