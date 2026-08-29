package DSA.Searching_Sorting;
/*
Question:
Given an integer array nums, return the number of inversions in the array.
An inversion is a pair of indices (i,j) such that i < j and nums[i] > nums[j].
Input:
        int[] nums = {5,3,2,4,1};
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {5,4,3,2,1};
Example 1:
Output:
8
Explanation:
The inversion pairs are:
(5,3) (5,2) (5,4) (5,1) (3,2) (3,1) (2,1) (4,1)
Example 2:
Output:
0
Explanation:
The array is already sorted, so there are no inversions.
Example 3:
Output:
10
Explanation:
Every pair is an inversion because the array is sorted in descending order.
--------------------------------------------------
*/
public class S103_CountInversions {
    public static int mergeSort(int nums[],int low,int high){
        if(low>=high) return 0;
        int mid=low+(high-low)/2;
        int count=0;
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=merge(nums,low,mid,high);

        return count;
    }
    public static int merge(int nums[],int low,int mid,int high){
        int temp[]=new int [high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        int c=0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
            }else{
                temp[k++]=nums[right++];
                c+=(mid-left)+1;

            }
        }
        while(left<=mid){
            temp[k++]=nums[left++];

        }
        while(right<=high){
            temp[k++]=nums[right++];

        }
        for (int i = 0; i < temp.length; i++) {
            nums[low + i] = temp[i];
        }
        return c;
    }
    public static int countInversion(int nums[]){
        return mergeSort(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums = {5,3,2,4,1};
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {5,4,3,2,1};
        System.out.println(countInversion(nums));
        System.out.println(countInversion(nums1));
        System.out.println(countInversion(nums2));

    }
}
