package DSA.Hashing;

import java.util.HashMap;

/*
Question:
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than n/2 times.
Example 1:
Input:
int[] nums = {3,2,3};
Output:
3
Example 2:
Input:
int[] nums = {2,2,1,1,1,2,2};
Output:
2
Example 3:
Input:
int[] nums = {5,5,5,2,2};
Output:
5
 */
public class A36_MajorityElement_169 {
    public static int majority(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)> nums.length/2) return n;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int[] nums1 = {2,2,1,1,1,2,2};
        int[] nums2 = {5,5,5,2,2};
        System.out.println(majority(nums));
        System.out.println(majority(nums1));
        System.out.println(majority(nums2));

    }

}
