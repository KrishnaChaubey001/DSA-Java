package DSA.Hashing;

import java.util.HashSet;

/*
Difficulty:
Easy
Pattern:
HashSet
Question:
Given an integer array nums, return any duplicate element.
Test Case 1
int[] nums = {1,3,4,2,2};
Test Case 2
int[] nums = {3,1,3,4,2};
Test Case 3
int[] nums = {1,1};
Output:
2
3
1
Explanation:
A duplicate element appears more than once.
--------------------------------------------------
 */
public class A30_FindDuplicateElement {
    public static int duplicate(int nums[]){
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,5};
        System.out.println(duplicate(nums));
        int[] nums1 = {3,1,3,4,2};
        System.out.println(duplicate(nums1));

    }

}
