package DSA.Hashing;

import java.util.HashMap;

/*
Question:
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
Example 1:
Input:
int[] nums = {2,2,1};
Output:
1
Example 2:
Input:
int[] nums = {4,1,2,1,2};
Output:
4
Example 3:
Input:
int[] nums = {1};
Output:
1
 */
public class A35_SingleNumber_136 {
    public static int singleNumber(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);

        }
        for(int n:nums){
            if(map.get(n)==1){
                return  n;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
        int[] nums1 = {4,1,2,1,2};
        System.out.println(singleNumber(nums1));
        int[] nums2 = {1};

        System.out.println(singleNumber(nums2));


    }

}
