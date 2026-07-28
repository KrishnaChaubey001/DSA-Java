package DSA.Arrays.Traversal;
/*
Question:
Given an array, print the first and last element together.
Test Case 1
int[] nums = {1, 2, 3, 4, 5};
Output:
1 5
Test Case 2
int[] nums = {10, 20, 30, 40};
Output:
10 40
Test Case 3
int[] nums = {99};
Output:
99 99
 */
public class A7_PrintFirstAndLastTogether {
    public static void printElement(int nums[]){
        if(nums.length==0){
            return;
        }

         System.out.println(nums[0]+" "+nums[nums.length-1]);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        printElement(nums);
        int[] nums1 = {99};
        printElement(nums1);

    }
}

