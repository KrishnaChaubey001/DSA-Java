package DSA.BinarySearch;
/*
Difficulty:
Easy
Pattern:
Binary Search
Question:
Given a sorted array containing duplicate elements, find the index of the first occurrence of a target element. Return -1 if the target does not exist.
Example 1:
Input:
int[] nums = {1,2,2,2,3,4};
int target = 2;
Output:
1
Explanation:
The first occurrence of 2 is at index 1.
Example 2:
Input:
int[] nums = {1,1,1,1};
int target = 1;
Output:
0
Explanation:
The first occurrence is at index 0.
Example 3:
Input:
int[] nums = {2,3,4,5};
int target = 1;
Output:
-1
Explanation:
Target is not present.
 */
public class BS56_FirstOccurrenceInSortedArray {
    public static int firstOccurence(int nums[],int target){
        int low=0,high=nums.length-1,first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            } else if (nums[mid]<target) {
                low=mid+1;

            }else high=mid-1;
        }
        return first;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4};
        int target = 2;
        System.out.println(firstOccurence(nums,target));
        int[] nums1 = {1,1,1,1};
        int target1 = 1;
        System.out.println(firstOccurence(nums1,target1));
        int[] nums2 = {2,3,4,5};
        int target2= 1;
        System.out.println(firstOccurence(nums2,target2));

    }
}
