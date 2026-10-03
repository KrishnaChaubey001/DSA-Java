package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
Question:
Given a circular integer array nums, find the next greater element for every element.
The next greater element of an element is the first element greater than it
when moving to the right.
Since the array is circular, after reaching the last element, continue from the beginning.
If no greater element exists, return -1.
Input:
        int[] nums1 = {1, 2, 1};
        int[] nums2 = {1, 2, 3, 4, 3};
        int[] nums3 = {5, 4, 3, 2, 1};
Example 1:
Output:
        [2, -1, 2]
Explanation:
        The next greater element of 1 is 2.
        There is no greater element for 2.
        For the last 1, we continue from the beginning and find 2.
Example 2:
Output:
        [2, 3, 4, -1, 4]
Explanation:
        The array is circular, so after reaching the end, we continue searching from the beginning.
Example 3:
Output:
        [-1, 5, 5, 5, 5]
Explanation:
        For every element except 5, the next greater element is 5.
        There is no element greater than 5.
--------------------------------------------------
*/
public class ST165_NextGreaterElementII_503 {
    public static int [] nextGreaterElement(int nums[]) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = nums.length;
        int ans[] = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i % n] >= st.peek()) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }
            st.push(nums[i % n]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1};
        System.out.println(Arrays.toString(nextGreaterElement(nums1)));
    }


}
