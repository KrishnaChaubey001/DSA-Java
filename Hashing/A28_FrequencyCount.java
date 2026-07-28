package DSA.Hashing;

import java.util.HashMap;

/*
A28_FrequencyCount
Difficulty:
Easy
Pattern:
Hashing
Question:
Given an integer array nums and an integer target, return the frequency of target in the array.
Test Case 1
int[] nums = {1,2,2,3,2,4};
int target = 2;
Test Case 2
int[] nums = {5,5,5,5};
int target = 5;
Test Case 3
int[] nums = {1,2,3};
int target = 4;
Output:
3
4
0
Explanation:
Count how many times target appears in the array.
-----------------------
 */
public class A28_FrequencyCount {
    public static int countOccurence(int nums[],int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        return map.getOrDefault(target,0);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,2,4};
        System.out.println(countOccurence(nums,2));
        int[] nums1 = {5,5,5,5};
        System.out.println(countOccurence(nums1,5));
        int[] nums2 = {1,2,3};
        System.out.println(countOccurence(nums2,4));

    }
}
