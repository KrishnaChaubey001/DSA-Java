package revision.day1;

import java.util.HashMap;

/*
Question:
Given an integer array nums and an integer k, return the total number
of continuous subarrays whose sum equals k.

Example 1:
Input:
int[] nums = {1,1,1};
int k = 2;

Output:
2

Example 2:
Input:
int[] nums = {1,2,3};
int k = 3;

Output:
2

Example 3:
Input:
int[] nums = {3,4,7,2,-3,1,4,2};
int k = 7;

Output:
4
*/
public class q3 {
    public static int subarraySum(int nums[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0,count=0;
        for(int n:nums){
            sum+=n;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,7,2,-3,1,4,2};
        int k=7;
        System.out.println(subarraySum(nums,k));
        int[] nums1 = {1,1,1};
        int k1=2;
        System.out.println(subarraySum(nums1,k1));

    }
}
