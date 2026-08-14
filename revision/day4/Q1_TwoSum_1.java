package DSA.revision.day4;

import java.util.Arrays;
import java.util.HashMap;

/*
Question:
Given an integer array nums and an integer target, return the indices of the two numbers
such that they add up to target.

Example 1:
Input:
int[] nums = {2,7,11,15};
int target = 9;

Output:
[0,1]

Example 2:
Input:
int[] nums = {3,2,4};
int target = 6;

Output:
[1,2]
--------------------------------------------------
*/
public class Q1_TwoSum_1 {
    public int [] twoSum(int[] nums,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int ch=target-nums[i];
            if(map.containsKey(ch)){
                return new int []{map.get(ch),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Q1_TwoSum_1 obj=new Q1_TwoSum_1();
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));
        int[] nums1 = {3,2,4};
        int target1 = 6;
        System.out.println(Arrays.toString(obj.twoSum(nums1,target1)));

    }
}
