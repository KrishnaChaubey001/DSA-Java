package DSA.BinarySearch;
/*
Question:
Given a sorted array nums and a target, find the first index where nums[index] is greater than or equal to target. If no such element exists, return nums.length.
Example 1:
Input:
int[] nums = {1,3,5,7,9};
int target = 6;
Output:
3
Explanation:
7 is the first element greater than or equal to 6.
Example 2:
Input:
int[] nums = {2,4,6,8,10};
int target = 2;
Output:
0
Explanation:
2 is already the first element greater than or equal to the target.
Example 3:
Input:
int[] nums = {2,4,6,8,10};
int target = 11;
Output:
5
Explanation:
No element is greater than or equal to 11.
--------------------------------------------------
*/

public class BS93_BinarySearchFinalPractice {

    public static int lowerBound(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 3, 5, 7, 9};
        System.out.println(lowerBound(nums1, 6)); // 3

        int[] nums2 = {2, 4, 6, 8, 10};
        System.out.println(lowerBound(nums2, 2)); // 0

        int[] nums3 = {2, 4, 6, 8, 10};
        System.out.println(lowerBound(nums3, 11)); // 5
    }
}
