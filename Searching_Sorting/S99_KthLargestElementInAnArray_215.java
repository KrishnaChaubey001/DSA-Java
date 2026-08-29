package DSA.Searching_Sorting;

import java.util.Arrays;

/*
Question:
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in sorted order, not the kth distinct element.
Input:
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int[] nums1 = {3,2,3,1,2,4,5,5,6};
        int k1 = 4;
        int[] nums2 = {7};
        int k2 = 1;
Example 1:
Output:
5
Explanation:
After sorting in ascending order: 1 2 3 4 5 6
The 2nd largest element is 5.
Example 2:
Output:
4
Explanation:
After sorting, the 4th largest element is 4.
Example 3:
Output:
7
Explanation:
There is only one element, so the 1st largest element is 7.
--------------------------------------------------
*/
public class S99_KthLargestElementInAnArray_215 {
    public static  void merge(int nums[],int low,int mid,int high){
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
    public static void sortArray(int nums[],int low,int high){
        if(low>=high) return ;
        int mid=low+(high-low)/2;
        sortArray(nums,low,mid);
        sortArray(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public static int findKthLargest(int[] nums, int k) {
        sortArray(nums,0,nums.length-1);
        return(nums[nums.length-k]);
    }

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int[] nums1 = {3,2,3,1,2,4,5,5,6};
        int k1 = 4;
        int[] nums2 = {7};
        int k2 = 1;
        System.out.println(findKthLargest(nums,k));
        System.out.println(findKthLargest(nums1,k1));
        System.out.println(findKthLargest(nums2,k2));
    }
}
