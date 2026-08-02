package DSA.revision.day2;

import java.util.HashSet;

/*
Question:
Given an unsorted array of integers nums,
return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:
Input:
int[] nums = {100,4,200,1,3,2};

Output:
4

Explanation:
The longest consecutive sequence is
1,2,3,4

Example 2:
Input:
int[] nums = {0,3,7,2,5,8,4,6,0,1};

Output:
9

Example 3:
Input:
int[] nums = {1,2,0,1};

Output:
3
*/
public class q7 {
    public static  int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int max=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int current =n,length=1;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                max=Math.max(max,length);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
