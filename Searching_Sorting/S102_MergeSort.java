package DSA.Searching_Sorting;

import java.util.Arrays;

/*
Question:
Given an integer array nums, sort the array in ascending order using Merge Sort.
Input:
        int[] nums = {5,2,3,1};
        int[] nums1 = {5,1,1,2,0,0};
        int[] nums2 = {1,2,3,4};
Example 1:
Output:
1 2 3 5
Explanation:
Divide the array into smaller halves, sort them recursively, and merge them back together.
Example 2:
Output:
0 0 1 1 2 5
Explanation:
Merge Sort recursively divides and merges the elements in sorted order.
Example 3:
Output:
1 2 3 4
Explanation:
The array is already sorted, but Merge Sort still divides and merges the array.
--------------------------------------------------
*/
public class S102_MergeSort {
    public static void mergeSort(int nums[],int low,int high){
        if(low>=high) return ;
        int mid=low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);

    }
    public static void merge(int[] nums,int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
            }
            else{
                temp[k++]=nums[right++];
            }
        }
        while(left<=mid){
            temp[k++]=nums[left++];

        }
        while(right<=high){
            temp[k++]=nums[right++];
        }
        for(int i=0;i<temp.length;i++){
            nums[low+i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int[] nums1 = {5,1,1,2,0,0};
        int[] nums2 = {1,2,3,4};
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
}
