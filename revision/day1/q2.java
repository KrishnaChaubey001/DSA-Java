package revision.day1;

import java.util.Arrays;

/*
Question:
Given an integer array nums, move all 0's to the end of it while maintaining
the relative order of the non-zero elements.

You must do this in-place without making a copy of the array.

Example 1:
Input:
int[] nums = {0,1,0,3,12};

Output:
[1,3,12,0,0]

Example 2:
Input:
int[] nums = {0};

Output:
[0]

Example 3:
Input:
int[] nums = {0,0,1};

Output:
[1,0,0]
*/
public class q2 {
    public static int[] moveZeroes(int nums[]){
        int i=0,j=0;
        while(j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        for(int k=i;k<nums.length;k++){
            nums[k]=0;
        }
        return nums;
    }
    public static int [] twoPointerSolution(int nums[]){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));

        int[] nums1 = {0};
        System.out.println(Arrays.toString(moveZeroes(nums1)));
        System.out.println("-----");
        System.out.println(Arrays.toString(twoPointerSolution(nums)));
        System.out.println(Arrays.toString(twoPointerSolution(nums1)));


    }
}

