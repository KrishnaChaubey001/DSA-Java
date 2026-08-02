package DSA.BinarySearch;

import java.util.Arrays;

/*
Difficulty:
Medium
Pattern:
Binary Search (First & Last Occurrence)
Question:
Given a sorted array of integers nums and a target value, return the starting and ending position of the target. If the target is not found, return {-1,-1}.
Example 1:
Input:
int[] nums = {5,7,7,8,8,10};
int target = 8;
Output:
3 4
Explanation:
The first occurrence is at index 3 and the last occurrence is at index 4.
Example 2:
Input:
int[] nums = {5,7,7,8,8,10};
int target = 6;
Output:
-1 -1
Explanation:
Target is not present.
Example 3:
Input:
int[] nums = {};
int target = 0;
Output:
-1 -1
Explanation:
The array is empty.
 */
public class BS58_FindFirstAndLastPositionOfElementInSortedArray_34 {
    private static int firstOccurence(int nums[], int target){
        int low =0,high=nums.length-1,first=-1;
        while(low<=high){
            int mid=low+ (high-low)/2;
            if(nums[mid]==target){
                first =mid;
                high=mid-1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return first;
    }
    private static int lastOccurence(int nums[],int target){
        int low =0,high=nums.length-1,last=-1;
        while(low<=high){
            int mid=low+ (high-low)/2;
            if(nums[mid]==target){
                last =mid;
                low=mid+1;
            }
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return last;
    }
    public static  int[] searchRange(int[] nums, int target) {
        int first=firstOccurence(nums,target);
        if(first==-1) return new int[] {-1,-1};
        int last=lastOccurence(nums,target);
        return new int [] {first,last};

    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}
