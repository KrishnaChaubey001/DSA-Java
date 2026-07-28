package DSA.Arrays.Traversal;
/*
Question:
Given an integer array nums and an integer target, return true if target exists else false.
Test Case 1
int[] nums = {4, 7, 1, 9};
int target = 7;
Output:
true
Test Case 2
int[] nums = {3, 8, 5};
int target = 10;
Output:
false
Test Case 3
int[] nums = {11, 22, 33};
int target = 22;
Output:
true
 */
public class A6_SearchElement_LinearSearch {
    public static boolean search(int nums [],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {4, 7, 1, 9};
        int target = 7;
        System.out.println(        search(nums,target)
        );
        int[] nums1 = {3, 8, 5};
        int target1 = 10;
        System.out.println(        search(nums1,target1));

    }
}
