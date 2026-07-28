package DSA.Arrays.Traversal;

import java.util.Arrays;

/*
Question:
Given an integer array nums, rotate the array to the right by k steps.

Test Case 1
int[] nums = {1,2,3,4,5,6,7};
int k = 3;

Test Case 2
int[] nums = {-1,-100,3,99};
int k = 2;

Test Case 3
int[] nums = {1,2};
int k = 1;

Output:
5 6 7 1 2 3 4
3 99 -1 -100
2 1
 */
public class A17_RotateArray_189 {
    public static  void ReverseArray(int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static int [] RotateArray(int nums[],int k){
        int n=nums.length;
        if(nums.length == 0){
            return nums;
        }
        k=k%n;
        ReverseArray(nums,0,n-k-1);
        ReverseArray(nums,n-k,n-1);
        ReverseArray(nums,0,n-1);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] nums1 = {-1,-100,3,99};
        int[] nums2 = {1,2};
        int a[]=RotateArray(nums,3);
        int a1[]=RotateArray(nums1,2);
        int a2[]=RotateArray(nums2,1);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
