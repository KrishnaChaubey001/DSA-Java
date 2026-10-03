package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
/*
Question:
Given an integer array, find the Previous Smaller Element for every element.
The Previous Smaller Element is the first element smaller than the current element
while moving toward the left.
If no smaller element exists, return -1.
Input:
        int[] arr1 = {4, 10, 5, 8, 20, 15, 3};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};
Example 1:
Output:
        [-1, 4, 4, 5, 8, 8, -1]
Explanation:
        For each element, find the closest smaller element on its left.
Example 2:
Output:
        [-1, 1, 2, 3, 4]
Explanation:
        Each element has the previous element as its previous smaller element.
Example 3:
Output:
        [-1, -1, -1, -1, -1]
Explanation:
        Every element is smaller than all elements before it.
--------------------------------------------------
*/
public class ST170_PreviousSmallerElement {
    public static int [] previousSamllerElemnt(int nums[]){
        int n= nums.length;
        Deque<Integer> st=new ArrayDeque<>();
        int ans []=new int[n];
        for(int i=0;i<n;i++){
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
        int[] arr1 = {4, 10, 5, 8, 20, 15, 3};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(previousSamllerElemnt(arr1)));
        System.out.println(Arrays.toString(previousSamllerElemnt(arr2)));
        System.out.println(Arrays.toString(previousSamllerElemnt(arr3)));
    }
}
