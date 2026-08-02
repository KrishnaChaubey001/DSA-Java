package DSA.BinarySearch;
/*
Difficulty:
Easy
Pattern:
Classic Binary Search
Question:
Given a sorted array of distinct integers nums and a target value, return the index if the target is found. If not, return the index where it would be inserted to maintain sorted order.
Example 1:
Input:
int[] nums = {1,3,5,6};
int target = 5;
Output:
2
Explanation:
Target 5 is found at index 2.
Example 2:
Input:
int[] nums = {1,3,5,6};
int target = 2;
Output:
1
Explanation:
2 should be inserted before 3.
Example 3:
Input:
int[] nums = {1,3,5,6};
int target = 7;
Output:
4
Explanation:
7 should be inserted at the end of the array.
 */
public class BS55_SearchInsertPosition_35 {
    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int[] nums1 = {1,3,5,6};
        int target1 = 2;
        System.out.println(searchInsert(nums,target));
        System.out.println(searchInsert(nums1,target1));

    }
}
