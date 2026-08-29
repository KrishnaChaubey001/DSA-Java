package DSA.Searching_Sorting;

import java.util.Arrays;

/*
Question:
Given an integer array nums containing only 0s, 1s, and 2s, sort the array in-place so that all 0s come first, followed by all 1s, and then all 2s.
Input:
        int[] nums = {2,0,2,1,1,0};
        int[] nums1 = {2,0,1};
        int[] nums2 = {0,1,2,0,1,2};
Example 1:
Output:
0 0 1 1 2 2
Explanation:
All 0s are placed first, followed by 1s, and then 2s.
Example 2:
Output:
0 1 2
Explanation:
The array is sorted in the required order.
Example 3:
Output:
0 0 1 1 2 2
Explanation:
The array is sorted using the Dutch National Flag approach.
--------------------------------------------------
*/
public class S98_SortColors_75 {
    public static void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;

                i++;
                j++;
            }
            else if(nums[j]==1){
                j++;
            }
            else{
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                k--;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int[] nums1 = {2,0,1};
        int[] nums2 = {0,1,2,0,1,2};
        sortColors(nums);
        sortColors(nums1);
        sortColors(nums2);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }
}
