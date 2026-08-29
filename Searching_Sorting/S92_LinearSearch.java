package DSA.Searching_Sorting;
/*
Question:
Given an integer array nums and a target value, return the index of the target if it is present in the array.
 Otherwise, return -1.
Example 1:
Input:
        int[] nums = {4,2,7,1,9};
        int target = 7;
        int[] nums1 = {10,20,30,40};
        int target1 = 25;
        int[] nums2 = {5};
        int target2 = 5;
Output:
2
Explanation:
7 is present at index 2.
Example 2:
Output:
-1
Explanation:
25 is not present in the array.
Example 3:
Output:
0
Explanation:
The target is present at index 0.
--------------------------------------------------
*/
public class S92_LinearSearch {
    public static int linearSearch(int nums[],int target){
        for(int i=0;i< nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,7,1,9};
        int target = 7;
        int[] nums1 = {10,20,30,40};
        int target1 = 25;
        int[] nums2 = {5};
        int target2 = 5;
        System.out.println(linearSearch(nums,target));
        System.out.println(linearSearch(nums1,target1));
        System.out.println(linearSearch(nums2,target2));

    }

}
