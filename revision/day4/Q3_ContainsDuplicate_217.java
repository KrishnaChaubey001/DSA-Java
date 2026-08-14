package DSA.revision.day4;

import java.util.HashSet;

/*
Question:
Given an integer array nums, return true if any value
appears at least twice in the array.
Otherwise return false.
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
--------------------------------------------------
*/
public class Q3_ContainsDuplicate_217 {
    public static boolean containsDuplicate(int nums[]){
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            if(set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
        int[] nums1 = {1,2,3,4};
        System.out.println(containsDuplicate(nums1));
    }
}
