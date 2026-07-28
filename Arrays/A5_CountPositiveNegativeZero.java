package DSA.Arrays.Traversal;
/*
Question:
Given an integer array nums, count positive, negative, and zero elements.
Test Case 1
int[] nums = {1, -2, 0, 5, -7, 0};
Output:
Positive = 2
Negative = 2
Zero = 2
Test Case 2
int[] nums = {1, 2, 3};
Output:
Positive = 3
Negative = 0
Zero = 0
Test Case 3
int[] nums = {-1, -2, 0};
Output:
Positive = 0
Negative = 2
Zero = 1
 */
public class A5_CountPositiveNegativeZero {
    public static void count(int nums[]){
        if(nums.length==0){
            return;
        }
        int p=0;
        int n=0;
        int z=0;
        for(int i=0;i<nums.length ;i++){
            if(nums[i]>0){
                p++;
            } else if (nums[i]<0) {
                n++;
            }
            else {
                z++;
            }
        }
        System.out.println("Positive = "+p +
                "\nNegative = "+n +
                "\nZero = "+z);
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 0, 5, -7, 0};
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {-1, -2, 0};
        count(nums);
        count(nums1);
        count(nums2);

    }
}
