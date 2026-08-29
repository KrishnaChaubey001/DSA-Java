package DSA.Searching_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Question:
Given an array of distinct integers arr, return all pairs of elements with the minimum absolute difference.
Input:
        int[] arr = {4,2,1,3};
        int[] arr1 = {1,3,6,10,15};
        int[] arr2 = {3,8,-10,23,19,-4,-14,27};
Example 1:
Output:
[1,2] [2,3] [3,4]
Explanation:
The minimum absolute difference is 1, so all pairs with difference 1 are returned.
Example 2:
Output:
[1,3]
Explanation:
The minimum absolute difference is 2 between 1 and 3.
Example 3:
Output:
[-14,-10] [19,23]
Explanation:
The minimum absolute difference is 4, so these pairs are returned.
--------------------------------------------------
*/
public class S100_MinimumAbsoluteDifference_1200 {
    public static List<List<Integer>> minimumAbsoluteDifference(int nums[]){
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]-nums[i-1]);
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i< nums.length;i++){
            if(nums[i]-nums[i-1]==min){
                list.add(Arrays.asList(nums[i-1],nums[i]));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        int[] arr1 = {1,3,6,10,15};
        int[] arr2 = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsoluteDifference(arr));
        System.out.println(minimumAbsoluteDifference(arr1));
        System.out.println(minimumAbsoluteDifference(arr2));

    }
}
