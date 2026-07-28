package DSA.Arrays.Traversal;

import java.util.Arrays;

/*
Question:
Given an array nums. We define a running sum of an array as:
runningSum[i] = sum(nums[0]…nums[i])
Return the running sum of nums.

Test Case 1
int[] nums = {1, 2, 3, 4};

Test Case 2
int[] nums = {1, 1, 1, 1, 1};

Test Case 3
int[] nums = {3, 1, 2, 10, 1};

Output:
1 3 6 10
1 2 3 4 5
3 4 6 16 17
--------------------------------------------------
 */
public class A9_RunningSumOf1DArray_1480 {
    public static int [] runningSum(int  nums[]){
        int prefix[]=new int [nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];

        }
        return prefix;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int result[]= runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

}
