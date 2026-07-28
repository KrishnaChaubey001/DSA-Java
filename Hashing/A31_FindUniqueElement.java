package DSA.Hashing;

import java.util.HashMap;

/*
Question:
Given an integer array nums where every element appears twice except one, return that unique element.
Test Case 1
int[] nums = {2,2,1};
Test Case 2
int[] nums = {4,1,2,1,2};
Test Case 3
int[] nums = {1};
Output:
1
4
1
Explanation:
Only one element appears exactly once.
--------
 */
public class A31_FindUniqueElement {
    public static int unique(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)==1) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        int[] nums1 = {4,1,2,1,2};
        int[] nums2 = {1};
        System.out.println(unique(nums));
        System.out.println(unique(nums1));
        System.out.println(unique(nums2));

    }
}
