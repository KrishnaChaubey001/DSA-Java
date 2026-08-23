package DSA.BinarySearch;
/*
Question:
Given two sorted arrays nums1 and nums2 of sizes m and n, return the median of the two sorted arrays. The overall run time complexity should be O(log(m+n)).
Example 1:
Input:
int[] nums1 = {1,3};
int[] nums2 = {2};
Output:
2.0
Explanation:
The combined sorted array is {1,2,3}. The median is 2.
Example 2:
Input:
int[] nums1 = {1,2};
int[] nums2 = {3,4};
Output:
2.5
Explanation:
The combined sorted array is {1,2,3,4}. The median is (2 + 3) / 2 = 2.5.
Example 3:
Input:
int[] nums1 = {};
int[] nums2 = {1};
Output:
1.0
Explanation:
The only element is 1, so the median is 1.
--------------------------------------------------
*/
public class BS89_MedianOfTwoSortedArrays_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while (low <= high) {

            int cut1 = low + (high - low) / 2;
            int cut2 = (m + n + 1) / 2 - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];

            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {

                if ((m + n) % 2 == 0) {
                    return ((double) Math.max(left1, left2)
                            + Math.min(right1, right2)) / 2;
                }

                return Math.max(left1, left2);
            }

            else if (left1 > right2) {
                high = cut1 - 1;
            }

            else {
                low = cut1 + 1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
