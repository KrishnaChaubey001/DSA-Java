package DSA.TwoPointers;

import java.util.Arrays;

/*
Question:
You are given two integer arrays nums1 and nums2 sorted in non-decreasing order.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
Example 1:
Input:
int[] nums1 = {1,2,3,0,0,0};
int m = 3;
int[] nums2 = {2,5,6};
int n = 3;
Output:
1 2 2 3 5 6
Explanation:
Merge the first 3 elements of nums1 and all elements of nums2.
Example 2:
Input:
int[] nums1 = {1};
int m = 1;
int[] nums2 = {};
int n = 0;
Output:
1
Example 3:
Input:
int[] nums1 = {0};
int m = 0;
int[] nums2 = {1};
int n = 1;
Output:
1
 */
public class A25_MergeSortedArray_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;int j=n-1;int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]<=nums2[j]){
                nums1[k--] = nums2[j--];
            }else{
                nums1[k--] = nums1[i--];
            }
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }
}
