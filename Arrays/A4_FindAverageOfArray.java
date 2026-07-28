package DSA.Arrays.Traversal;
/*
Question:
Given an integer array nums, return the average of all elements.
Test Case 1
int[] nums = {2, 4, 6, 8};
Output:
5
Test Case 2
int[] nums = {10, 20, 30};
Output:
20
Test Case 3
int[] nums = {5, 5, 5, 5};
Output:
5
 */
public class A4_FindAverageOfArray {
    public static double average(int nums[]){
        if(nums.length==0){
            return 0;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return (double)sum/nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8};
        double a1=average(nums);
        int[] nums1 = {10, 20, 30};
        double a2=average(nums1);
        System.out.println(a1);
        System.out.println(a2);

    }
}
