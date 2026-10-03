package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
Question:
Given an integer array, find the Next Smaller Element for every element.
The Next Smaller Element is the first element smaller than the current element
while moving toward the right.
If no smaller element exists, return -1.
Input:
        int[] arr1 = {4, 8, 5, 2, 25};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 2, 3, 4, 5};
Example 1:
Output:
        [2, 5, 2, -1, -1]
Explanation:
        The next smaller element of 4 is 2.
        The next smaller element of 8 is 5.
        The next smaller element of 5 is 2.
Example 2:
Output:
        [4, 3, 2, 1, -1]
Explanation:
        Each element has the next element as its next smaller element.
Example 3:
Output:
        [-1, -1, -1, -1, -1]
Explanation:
        No element has a smaller element to its right.
--------------------------------------------------
*/
public class ST169_NextSmallerElement {

    public static int [] nextSamllerElemnt(int nums[]){
        int n= nums.length;
        Deque<Integer>st=new ArrayDeque<>();
        int ans []=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& nums[i]<=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else {
                ans[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 8, 5, 2, 25};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nextSamllerElemnt(arr1)));
        System.out.println(Arrays.toString(nextSamllerElemnt(arr2)));
        System.out.println(Arrays.toString(nextSamllerElemnt(arr3)));

    }
}
