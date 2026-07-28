package DSA.Arrays.Traversal;

import java.util.Arrays;

/*
Question:
Given an integer array nums of length n, create an array ans of length 2n where:
ans = nums + nums
Test Case 1
int[] nums = {1, 2, 1};
Test Case 2
int[] nums = {1, 3, 2, 1};
Test Case 3
int[] nums = {7, 8};
Output:
1 2 1 1 2 1
1 3 2 1 1 3 2 1
7 8 7 8
 */
public class A10_ConcatenationOfArray_1929 {
    public static int[] getConcatenation(int nums[]){
        int arr[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        //Test Case 1
        int[] nums = {1, 2, 1};
        //Test Case 2
        int[] nums1 = {1, 3, 2, 1};
       // Test Case 3
        int[] nums2 = {7, 8};
        int res[]=getConcatenation(nums);
        System.out.println(Arrays.toString(res));
    }

}
