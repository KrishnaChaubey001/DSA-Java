package DSA.TwoPointers;

import java.util.Arrays;

/*
Question:
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent.
Use:
0 = Red
1 = White
2 = Blue
Example 1:
Input:
int[] nums = {2,0,2,1,1,0};
Output:
0 0 1 1 2 2
Explanation:
All 0s come first, then 1s, then 2s.
Example 2:
Input:
int[] nums = {2,0,1};
Output:
0 1 2
Example 3:
Input:
int[] nums = {1,2,0};
Output:
0 1 2
 */
public class A26_SortColors_75 {
    public static void sortColors(int[] nums) {
        int i=0;int j=0;int k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else if(nums[j]==1){
                j++;
            }else{
                int temp = nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
        int[] nums1 = {2,0,1};
        sortColors(nums1);
        System.out.println(Arrays.toString(nums1));


    }
}
