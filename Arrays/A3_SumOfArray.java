package DSA.Arrays.Traversal;
/*
Question
Given an integer array nums, return the sum of all elements.

Example 1

Input:
nums = [1, 2, 3, 4]

Output:
10
Example 2

Input:
nums = [5, 5, 5]

Output:
15
 */
public class A3_SumOfArray {
    public static int totalSum(int[]nums){
        if(nums.length==0){
            return 0;
        }
        int sum=0;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int []nums = {1, 2, 3, 4};
        int a1=totalSum(nums);
        System.out.println(a1);

    }
}
