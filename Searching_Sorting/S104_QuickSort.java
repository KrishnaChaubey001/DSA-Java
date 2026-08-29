package DSA.Searching_Sorting;

import java.util.Arrays;

/*
Question:
Given an integer array nums, sort the array in ascending order using Quick Sort.
Input:
        int[] nums = {10,7,8,9,1,5};
        int[] nums1 = {3,6,8,10,1,2,1};
        int[] nums2 = {1,2,3,4};
Example 1:
Output:
1 5 7 8 9 10
Explanation:
Choose a pivot element and place smaller elements on its left and larger elements on its right.
Example 2:
Output:
1 1 2 3 6 8 10
Explanation:
Quick Sort recursively partitions the array around pivot elements until the array becomes sorted.
Example 3:
Output:
1 2 3 4
Explanation:
The array is already sorted.
--------------------------------------------------
*/
public class S104_QuickSort {
    public static void quickSort(int nums[],int low,int high){
        if(low>=high) return ;
        int pivotindex=partition(nums,low,high);
        quickSort(nums,low,pivotindex-1);
        quickSort(nums,pivotindex+1,high);
    }
    public static int partition(int nums[],int low,int high){
        int pivot=nums[low];

        int i=low;
        int j=high;
        while(i<=j){
            while( i<=high && nums[i]<=pivot){
                i++;
            }
            while (j>=0&& nums[j]>pivot){
                j--;
            }
            if(i<j){
                int temp= nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int[] nums = {10,7,8,9,1,5};
        int[] nums1 = {3,6,8,10,1,2,1};
        int[] nums2 = {1,2,3,4};
        quickSort(nums, 0, nums.length - 1);
        quickSort(nums1, 0, nums1.length - 1);
        quickSort(nums2, 0, nums2.length - 1);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
