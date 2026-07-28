package DSA.Hashing;

import java.util.Arrays;
import java.util.HashMap;

/*
Question:
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Example 1:
Input:
int[] nums = {2,7,11,15};
int target = 9;
Output:
0 1
Explanation:
nums[0] + nums[1] = 2 + 7 = 9
Example 2:
Input:
int[] nums = {3,2,4};
int target = 6;
Output:
1 2
Example 3:
Input:
int[] nums = {3,3};
int target = 6;
Output:
0 1
 */
public class A33_TwoSum_1 {
    public  static int[] twoSum(int nums[],int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int el=target-nums[i];
            if(map.containsKey(el)){
                return new int[]{map.get(el),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }
}
