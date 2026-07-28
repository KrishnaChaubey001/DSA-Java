package DSA.TwoPointers;

import java.util.Arrays;

/*
Question:
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Example 1:
Input:
int[] nums = {-4,-1,0,3,10};
Output:
0 1 9 16 100
Explanation:
After squaring, the array becomes:
16 1 0 9 100
After sorting, it becomes:
0 1 9 16 100
Example 2:
Input:
int[] nums = {-7,-3,2,3,11};
Output:
4 9 9 49 121
Explanation:
After squaring, the array becomes:
49 9 4 9 121
After sorting, it becomes:
4 9 9 49 121
 */
public class A23_SquaresOfSortedArray_977 {
    public static int [] squaresArray(int nums[]){
        int arr[]=new int[nums.length];
        int k=nums.length-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]*nums[i]<=nums[j]*nums[j]){
                arr[k--]=nums[j]*nums[j];
                j--;
            }else{
                arr[k--]=nums[i]*nums[i];
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squaresArray(nums)));
    }
}
