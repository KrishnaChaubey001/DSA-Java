package DSA.BinarySearch;

/*
Question:
Given two sorted arrays nums1 and nums2 and an integer k, return the kth smallest element in the combined sorted array.
Example 1:
Input:
int[] nums1 = {2,3,6,7,9};
int[] nums2 = {1,4,8,10};
int k = 5;
Output:
6
Explanation:
The combined sorted array is {1,2,3,4,6,7,8,9,10}. The 5th element is 6.
Example 2:
Input:
int[] nums1 = {1,2,3,4};
int[] nums2 = {5,6,7,8};
int k = 3;
Output:
3
Explanation:
The 3rd smallest element is 3.
Example 3:
Input:
int[] nums1 = {1,4,7};
int[] nums2 = {2,3,6,8};
int k = 6;
Output:
7
Explanation:
The combined sorted array is {1,2,3,4,6,7,8}. The 6th element is 7.
--------------------------------------------------
*/
class  Solution {

    public  static int kthElement(int[] nums1, int[] nums2, int k) {

        if (nums1.length > nums2.length) {
            return kthElement(nums2, nums1, k);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {

            int cut1 = low + (high - low) / 2;
            int cut2 = k - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int right1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];

            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                return Math.max(left1, left2);
            }

            else if (left1 > right2) {
                high = cut1 - 1;
            }

            else {
                low = cut1 + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,6,7,9};
        int[] nums2 = {1,4,8,10};
        int k = 5;
        System.out.println(kthElement(nums1,nums2,k));
    }
}