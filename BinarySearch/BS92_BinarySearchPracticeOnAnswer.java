package DSA.BinarySearch;
/*
Question:
Given an array of positive integers and an integer k, find the minimum possible value of the maximum sum when the array is divided into k contiguous non-empty parts.
Example 1:
Input:
int[] nums = {7,2,5,10,8};
int k = 2;
Output:
18
Explanation:
The best division is {7,2,5} and {10,8}. The maximum sum is 18.
Example 2:
Input:
int[] nums = {1,2,3,4,5};
int k = 3;
Output:
6
Explanation:
The best division is {1,2,3}, {4}, {5}. The maximum sum is 6.
Example 3:
Input:
int[] nums = {10,20,30};
int k = 1;
Output:
60
Explanation:
With one part, all elements belong to the same subarray.
--------------------------------------------------
*/

public class BS92_BinarySearchPracticeOnAnswer {

    public static int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static boolean canSplit(int[] nums, int k, int maxSum) {

        int parts = 1;
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num > maxSum) {
                parts++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }

        return parts <= k;
    }

    public static void main(String[] args) {

        int[] nums1 = {7, 2, 5, 10, 8};
        System.out.println(splitArray(nums1, 2));

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(splitArray(nums2, 3));

        int[] nums3 = {10, 20, 30};
        System.out.println(splitArray(nums3, 1));
    }
}