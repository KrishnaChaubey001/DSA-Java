package DSA.Hashing;

import java.util.HashSet;

/*
Question:
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input:
int[] nums = {1,2,3,1};
Output:
true
Example 2:
Input:
int[] nums = {1,2,3,4};
Output:
false
Example 3:
Input:
int[] nums = {1,1,1,3,3,4,3,2,4,2};
Output:
true
--------------------------------------------------
 */
public class A34_ContainsDuplicate_217 {
    public static boolean existDuplicate(int nums[]){
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums){
            if(set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(existDuplicate(nums));
        int[] nums1 = {1,2,3,4};
        System.out.println(existDuplicate(nums1));

    }

}
