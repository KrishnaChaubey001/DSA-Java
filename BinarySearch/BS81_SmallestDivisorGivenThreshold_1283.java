package DSA.BinarySearch;
/*
Question:
Given an integer array nums and an integer threshold, choose a positive integer divisor. Divide each number by the divisor and round the result up to the nearest integer. Return the smallest divisor such that the sum of all rounded results is less than or equal to threshold.
Example 1:
Input:
int[] nums = {1,2,5,9};
int threshold = 6;
Output:
5
Explanation:
Using divisor 5 gives ceil(1/5) + ceil(2/5) + ceil(5/5) + ceil(9/5) = 1 + 1 + 1 + 2 = 5.
Example 2:
Input:
int[] nums = {44,22,33,11,1};
int threshold = 5;
Output:
44
Explanation:
The smallest divisor that keeps the sum less than or equal to 5 is 44.
Example 3:
Input:
int[] nums = {2,3,5,7,11};
int threshold = 11;
Output:
3
Explanation:
Using divisor 3 gives a sum of 1 + 1 + 2 + 3 + 4 = 11.
--------------------------------------------------
*/
public class BS81_SmallestDivisorGivenThreshold_1283 {
    public static int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for (int i = 0; i < nums.length; i++) {
            high= Math.max(high, nums[i]);
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += (nums[i] + mid - 1) / mid;
            }
            if (sum <= threshold) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums,threshold));
    }
}
