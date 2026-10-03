package DSA.Stack;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
Question:
Given two arrays nums1 and nums2 where nums1 is a subset of nums2,
for each element in nums1, find the first greater element to its right
in nums2.

If no greater element exists, return -1.

Input:
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};

Example 1:
Output:
        [-1, 3, -1]
Explanation:
        For 4, there is no greater element to its right.
        For 1, the next greater element is 3.
        For 2, there is no greater element to its right.

Example 2:
Output:
        [3, -1]
Explanation:
        The next greater element of 2 is 3.
        There is no greater element to the right of 4.

Example 3:
Input:
        int[] nums5 = {1};
        int[] nums6 = {1};

Output:
        [-1]
Explanation:
        There is no element greater than 1 to its right.
--------------------------------------------------
*/
public class ST164_NextGreaterElementI_496 {
    public static int [] nextGreaterElement(int nums1[],int nums2[]){
        Deque<Integer>st=new ArrayDeque<>();
        int freq[]=new int[100000];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty()&& nums2[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                freq[nums2[i]]=-1;
            }else{
                freq[nums2[i]]= st.peek();
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=freq[nums1[i]];
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));

    }
}
