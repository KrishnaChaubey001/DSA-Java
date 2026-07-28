package DSA.Arrays.Traversal;
/*
1️⃣ Find Maximum Element
Question
Given an integer array nums, return the largest element in the array.
Example 1
Input:
nums = [3, 7, 2, 9, 5]
Output:
9
Example 2
Input:
nums = [-1, -5, -2]
Output:
-1
*/
public class A1_FindMaximumElement{
    public static int LargestElement(int[] nums){
        if(nums.length==0){
            return -1;
        }
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=max){
                max=nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int []nums = {3, 7, 2, 9, 5};
        int l1=LargestElement(nums);
        System.out.println(l1);
        int []nums1 = {-1, -5, -2};
        int l2=LargestElement(nums1);
        System.out.println(l2);
    }

}
