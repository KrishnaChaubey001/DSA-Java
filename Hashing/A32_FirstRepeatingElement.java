package DSA.Hashing;

import java.util.HashMap;

/*
Question:
Given an integer array nums, return the first repeating element.
Test Case 1
int[] nums = {10,5,3,4,3,5,6};
Test Case 2
int[] nums = {1,2,3,4,2};
Test Case 3
int[] nums = {7,7,8};
Output:
5
2
7
Explanation:
Return the first element whose frequency becomes greater than 1.
--------------------------------------------------
 */
public class A32_FirstRepeatingElement {
    public static int firstRepeating(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:nums){
            if(map.get(n)>1) return n;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {10,5,3,4,3,5,6};
        System.out.println(firstRepeating(nums));
    }
}
