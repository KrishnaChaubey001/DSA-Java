package DSA.BinarySearch;
/*
Difficulty:
Easy
Pattern:
Binary Search
Question:
Given a sorted array containing duplicate elements, find the index of the last occurrence of a target element. Return -1 if the target does not exist.
Example 1:
Input:
int[] nums = {1,2,2,2,3,4};
int target = 2;
Output:
3
Explanation:
The last occurrence of 2 is at index 3.
Example 2:
Input:
int[] nums = {5,5,5,5};
int target = 5;
Output:
3
Explanation:
The last occurrence is at index 3.
Example 3:
Input:
int[] nums = {1,2,3,4};
int target = 7;
Output:
-1
Explanation:
 */
public class BS57_LastOccurrenceInSortedArray {
    public static int lastOccurence(int nums[],int target){
        int low=0,high=nums.length-1,last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            } else if (nums[mid]<target) {
                low=mid+1;

            }else high=mid-1;
        }
        return last;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4};
        int target = 2;
        System.out.println(lastOccurence(nums,target));
        int[] nums1 = {1,2,3,4};
        int target1 = 7;
        System.out.println(lastOccurence(nums1,target1));
    }
}
