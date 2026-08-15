package DSA.BinarySearch;
/*
Question:
Given a sorted array where every element appears exactly twice except for one element that appears exactly once, return the single element.
Example 1:
Input:
int[] nums = {1,1,2,3,3,4,4,8,8};
Output:
2
Explanation:
2 is the only element that appears once.
Example 2:
Input:
int[] nums = {3,3,7,7,10,11,11};
Output:
10
Explanation:
10 is the only element that appears once.
Example 3:
Input:
int[] nums = {1};
Output:
1
Explanation:
The only element appears once.
--------------------------------------------------
*/
public class BS76_SingleElementInASortedArray_540 {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low+(high-low) / 2;
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) low = mid + 2;
            else high= mid;
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int[] nums1 = {3,3,7,7,10,11,11};
        int[] nums2 = {1};
        System.out.println(singleNonDuplicate(nums));
        System.out.println(singleNonDuplicate(nums1));
        System.out.println(singleNonDuplicate(nums2));

        }
}
