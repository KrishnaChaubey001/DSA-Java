package DSA.SlidingWindow;

/*
Question:
Given an array of positive integers nums and a positive integer target,
return the minimal length of a subarray whose sum is greater than or equal to target.
*/

public class A48_MinimumSizeSubarraySum_209 {

    public static int minimumSize(int[] nums, int target) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        while (j < nums.length) {

            sum += nums[j];

            while (sum >= target) {

                ans = Math.min(ans, j - i + 1);

                sum -= nums[i];
                i++;
            }

            j++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(minimumSize(nums, target));

        int target1 = 4;
        int[] nums1 = {1,4,4};
        System.out.println(minimumSize(nums1, target1));

        int target2 = 11;
        int[] nums2 = {1,1,1,1,1,1,1,1};
        System.out.println(minimumSize(nums2, target2));
    }
}