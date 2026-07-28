package DSA.Hashing;

import java.util.HashMap;

/*
Pattern:
HashMap + Prefix Sum
Question:
Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
Example 1:
Input:
int[] nums = {0,1};
Output:
2
Example 2:
Input:
int[] nums = {0,1,0};
Output:
2
Example 3:
Input:
int[] nums = {0,0,1,0,0,0,1,1};
Output:
6
 */
public class A40_ContiguousArray_525 {
    public static int contiguousArray(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max=0,sum=0,con;
        for(int i=0;i<nums.length;i++){

            sum+=(nums[i]==0)?-1:1;

            if(map.containsKey(sum)){
                con=i-map.get(sum);
                max=Math.max(max,con);

            }else{
                map.put(sum,i);
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,0,0,0,1,1};
        System.out.println(contiguousArray(nums));
        int[] nums1 = {0,1,0};
        System.out.println(contiguousArray(nums1));
        int[] nums2 = {0,1};
        System.out.println(contiguousArray(nums2));

    }

}
