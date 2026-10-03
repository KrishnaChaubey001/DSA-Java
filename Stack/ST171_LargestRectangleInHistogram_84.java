package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Question:
Given an array of integers representing the heights of histogram bars,
where each bar has width 1, find the area of the largest rectangle
that can be formed in the histogram.
Input:
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        int[] heights2 = {2, 4};
        int[] heights3 = {2, 2, 2, 2};
Example 1:
Output:
        10
Explanation:
        The rectangle formed using heights 5 and 6 has width 2.
        Its area is 5 × 2 = 10.
Example 2:
Output:
        4
Explanation:
        The largest rectangle has height 2 and width 2.
Example 3:
Output:
        8
Explanation:
        All four bars have height 2, so the largest rectangle has
        width 4 and height 2.
--------------------------------------------------
*/
public class ST171_LargestRectangleInHistogram_84 {
    public static int largestRectangleInHistogram(int nums[]){
        Deque<Integer> st= new ArrayDeque<>();
        int max=Integer.MIN_VALUE;
        int n= nums.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                int el=st.peek();
                st.pop();
                int nsc=i;
                int psc=(st.isEmpty())?-1:st.peek();
                max=Math.max(max,nums[el]*(nsc-psc-1));

            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int el=st.peek();
            st.pop();
            int nsc=n;
            int psc=(st.isEmpty())?-1:st.peek();
            max=Math.max(max,nums[el]*(nsc-psc-1));

        }
        return  max;
    }

    public static void main(String[] args) {

        int[] heights1 = {2, 1, 5, 6, 2, 3};
        int[] heights2 = {2, 4};
        int[] heights3 = {2, 2, 2, 2};
        System.out.println(largestRectangleInHistogram(heights1));
        System.out.println(largestRectangleInHistogram(heights2));
        System.out.println(largestRectangleInHistogram(heights3));
    }

}
