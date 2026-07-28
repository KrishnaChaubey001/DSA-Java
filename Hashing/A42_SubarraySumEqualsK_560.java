package DSA.Hashing;

import java.util.HashMap;

/*
Question:
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals k.
Example 1:
Input:
int[] nums = {1,1,1};
int k = 2;
Output:
2
Explanation:
Subarrays:
[1,1]
[1,1]
Example 2:
Input:
int[] nums = {1,2,3};
int k = 3;
Output:
2
Explanation:
Subarrays:
[1,2]
[3]
Example 3:
Input:
int[] nums = {1,-1,0};
int k = 0;
Output:
3
 */
public class A42_SubarraySumEqualsK_560 {
    public static  int SubarraySum(int nums[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;int count=0;
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
        int[] nums = {1,1,1};
        System.out.println(SubarraySum(nums,2));
        int[] nums1 = {1,2,3};
        System.out.println(SubarraySum(nums1,3));
        int[] nums2 = {1,-1,0};

        System.out.println(SubarraySum(nums2,0));

    }

}
