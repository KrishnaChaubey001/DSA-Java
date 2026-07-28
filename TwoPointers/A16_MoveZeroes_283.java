package DSA.TwoPointers;

import java.util.Arrays;

/*
Question:
Given an integer array nums, move all 0's to the end while maintaining the relative order of non-zero elements.

Test Case 1
int[] nums = {0,1,0,3,12};

Test Case 2
int[] nums = {0};

Test Case 3
int[] nums = {1,0,2,0,4};

Output:
1 3 12 0 0
0
1 2 4 0 0
 */
public class A16_MoveZeroes_283 {
    public static int [] MoveZeroes(int nums[]){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
        }
        for(int j=i;j<nums.length;j++){
            nums[j]=0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int result[]=MoveZeroes(nums);
        System.out.println(Arrays.toString(result));
    }
}
