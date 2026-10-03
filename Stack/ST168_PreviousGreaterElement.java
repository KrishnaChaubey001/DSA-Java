package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
Question:
Given an integer array, find the Previous Greater Element for every element.
The Previous Greater Element of an element is the first element greater than it
while moving toward the left.
If no greater element exists, return -1.
Input:
        int[] arr1 = {10, 4, 2, 20, 40, 12, 30};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 2, 3, 4, 5};
Example 1:
Output:
        [-1, 10, 4, -1, -1, 40, 40]
Explanation:
        For each element, find the closest greater element on its left.
Example 2:
Output:
        [-1, 5, 4, 3, 2]
Explanation:
        Each element has the immediately previous element as its previous greater element.
Example 3:
Output:
        [-1, -1, -1, -1, -1]
Explanation:
        Every element is greater than all elements before it.
--------------------------------------------------
*/
public class ST168_PreviousGreaterElement {
    public static int [] previousGreaterElement(int nums[]) {
        Deque<Integer> st = new ArrayDeque<>();
        int n= nums.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& nums[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 4, 2, 20, 40, 12, 30};
        System.out.println(Arrays.toString(previousGreaterElement(arr1)));
        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(previousGreaterElement(arr2)));



    }
}
