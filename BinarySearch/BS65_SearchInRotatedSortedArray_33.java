package DSA.BinarySearch;
/*
Question:
Given a rotated sorted array nums with distinct integers and an integer target, return the index of target if it exists. Otherwise, return -1.
Example 1:
Input:
int[] nums = {4,5,6,7,0,1,2};
int target = 0;
Output:
4
Explanation:
Target 0 is present at index 4.
Example 2:
Input:
int[] nums = {4,5,6,7,0,1,2};
int target = 3;
Output:
-1
Explanation:
Target is not present.
Example 3:
Input:
int[] nums = {1};
int target = 0;
Output:
-1
Explanation:
Target does not exist.
--------------------------------------------------
*/
public class BS65_SearchInRotatedSortedArray_33 {
    public static int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    high=mid-1;
                } else low=mid+1;


            }else{
                if(nums[high]>=target && target>nums[mid]){
                    low=mid+1;
                }else high=mid-1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
        int[] nums1 = {1};
        int target1 = 0;
        System.out.println(search(nums1,target1));
    }
}
