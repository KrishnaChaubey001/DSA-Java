package DSA.Hashing;

import java.util.Arrays;
import java.util.HashSet;

/*
Question:
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
Example 1:
Input:
int[] nums = {100,4,200,1,3,2};
Output:
4
Explanation:
Sequence:
1 2 3 4
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
public class A41_LongestConsecutiveSequence_128 {
    public static int BruteForceLongestConsecutive(int nums[]){
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int max=1,curr=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                curr++;
            }else if(nums[i]==nums[i-1]){
                continue;
            }else{
                curr=1;
            }

            max=Math.max(max,curr);

        }
        return max;
    }
    public static int OptimalSolutionLongestConsecutive(int nums[]){
        if(nums.length==0) return 0;
        HashSet<Integer>set=new HashSet<>();
        for(int n:nums) set.add(n);
        int max=1;
        for(int n:set){
            if(!set.contains(n-1)){
                int current=n;int length=0;
                while(set.contains(current)){
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
        System.out.println(BruteForceLongestConsecutive(nums));
        System.out.println(OptimalSolutionLongestConsecutive(nums));
    }

}
