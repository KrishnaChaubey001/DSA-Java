package DSA.Searching_Sorting;

import java.util.Arrays;

/*
Question:
Given a binary array containing only 0s and 1s, sort the array so that all 0s appear before all 1s.
Input:
        int[] nums = {1,0,1,0,1,0};
        int[] nums1 = {1,1,1,0,0};
        int[] nums2 = {0,0,0,0};
Example 1:
Output:
0 0 0 1 1 1
Explanation:
All 0s are placed before all 1s.
Example 2:
Output:
0 0 1 1 1
Explanation:
The array is sorted in ascending order.
Example 3:
Output:
0 0 0 0
Explanation:
The array is already sorted.
--------------------------------------------------
*/
public class S97_BinaryArraySorting {
    public static int [] binaryArraySorting(int nums[]){
        int i=0;
        int j= nums.length-1;
        while(i<j){
            if(nums[i]==0){i++;}

            else if(nums[j]==1){j--;}
            else{
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1,0};
        int[] nums1 = {1, 1, 0, 0,1};
        int[] nums2 = {0,0,0,0};
        System.out.println(Arrays.toString(binaryArraySorting(nums)));
        System.out.println(Arrays.toString(binaryArraySorting(nums1)));
        System.out.println(Arrays.toString(binaryArraySorting(nums2)));


    }
}
