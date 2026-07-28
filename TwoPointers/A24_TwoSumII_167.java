package DSA.TwoPointers;

import java.util.Arrays;

/*/*
Question:
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
Return the indices of the two numbers (1-indexed).
Example 1:
Input:
int[] numbers = {2,7,11,15};
int target = 9;
Output:
1 2
Explanation:
numbers[0] + numbers[1] = 2 + 7 = 9
Example 2:
Input:
int[] numbers = {2,3,4};
int target = 6;
Output:
1 3
Explanation:
numbers[0] + numbers[2] = 2 + 4 = 6
Example 3:
Input:
int[] numbers = {-1,0};
int target = -1;
Output:
1 2
 */
public class A24_TwoSumII_167 {
    public static int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[2];
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            } else if (nums[i]+nums[j]<target) {
                i++;

            }else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
        int[] numbers1 = {-1,0};
        System.out.println(Arrays.toString(twoSum(numbers1, -1)));
        int[] numbers2 = {2,3,4};
        System.out.println(Arrays.toString(twoSum(numbers2, 11)));
    }
}
