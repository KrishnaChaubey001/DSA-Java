package DSA.BinarySearch;
/*
Question:
Given a rotated sorted array nums that may contain duplicates and an integer target, return true if target
exists in the array. Otherwise, return false.
Example 1:
Input:
int[] nums = {2,5,6,0,0,1,2};
int target = 0;
Output:
true
Explanation:
Target exists in the array.
Example 2:
Input:
int[] nums = {2,5,6,0,0,1,2};
int target = 3;
Output:
false
Explanation:
Target does not exist.
Example 3:
Input:
int[] nums = {1,1,1,1,1};
int target = 1;
Output:
true
Explanation:
Target is present.
--------------------------------------------------
*/
public class BS66_SearchInRotatedSortedArrayII_81 {
    public static boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] == nums[low] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if (nums[high] >= target && target > nums[mid]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
        int target1 = 3;
        System.out.println(search(nums,target1));
        int[] nums1 = {1,1,1,1,1};
        System.out.println(search(nums1,2));


    }
}
