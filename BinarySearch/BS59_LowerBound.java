package DSA.BinarySearch;
/*
Question:
Given a sorted array nums and an integer target, return the index of the first element greater than or equal
 to target. If no such element exists, return nums.length.
Example 1:
Input:
int[] nums = {1,2,4,4,5};
int target = 4;
Output:
2
Explanation:
The first element greater than or equal to 4 is at index 2.
Example 2:
Input:
int[] nums = {1,2,4,4,5};
int target = 3;
Output:
2
Explanation:
The first element greater than or equal to 3 is 4 at index 2.
Example 3:
Input:
int[] nums = {1,2,4,4,5};
int target = 6;
Output:
5
Explanation:
No element is greater than or equal to 6, so return nums.length.
--------------------------------------------------
*/
public class BS59_LowerBound {
    public static int lowerBound(int nums[],int target) {
        int low = 0, high = nums.length - 1, lb = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                lb=mid;
                high=mid-1;
            }
            else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return (lb == -1) ? nums.length : lb;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,4,5};
        int target = 4;
        System.out.println(lowerBound(nums,target));
        int[] nums1 = {1,2,4,4,5};
        int target1 = 6;
        System.out.println(lowerBound(nums1,target1));

    }

}
