package DSA.BinarySearch;
/*
Difficulty:
Easy
Pattern:
Classic Binary Search
Question:
Given a sorted array of integers nums in ascending order and an integer target, return the index of target if it exists. Otherwise, return -1.
Example 1:
Input:
int[] nums = {-1,0,3,5,9,12};
int target = 9;
Output:
4
Explanation:
Target 9 is present at index 4.
Example 2:
Input:
int[] nums = {-1,0,3,5,9,12};
int target = 2;
Output:
-1
Explanation:
Target 2 is not present in the array.
Example 3:
Input:
int[] nums = {5};
int target = 5;
Output:
0
Explanation:
Target is found at index 0.
 */
public class BS54_BinarySearch_704 {
    public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]) return mid;
            else if(target<nums[mid]) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
        int[] nums1 = {-1,0,3,5,9,12};
        int target1 = 2;
        System.out.println(search(nums1,target1));
    }
}
