package DSA.Arrays.Traversal;
/*
2️⃣ Find Minimum Element
Question
Given an integer array nums, return the smallest element in the array.

Example 1

Input:
nums = [8, 4, 2, 10, 6]

Output:
2
Example 2

Input:
nums = [-3, -8, -1]

Output:
-8
 */
public class A2_FindMinimumElement {
    public static int minimumElemnt(int nums[]){
        if(nums.length==0){
            return -1;
        }
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=min){
                min=nums[i];
            }

        }
        return min;

    }

    public static void main(String[] args) {
        int nums[] = {8, 4, 2, 10, 6};
        int a1=minimumElemnt(nums);
        System.out.println(a1);
        int []nums1 = {-3, -8, -1};
        int a2=minimumElemnt(nums1);
        System.out.println(a2);
    }

}
