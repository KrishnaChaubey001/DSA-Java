package DSA.Arrays.Traversal;

import java.util.Arrays;

/*
Question:
Given the array nums consisting of 2n elements in the form:
[x1,x2,...,xn,y1,y2,...,yn]
Return the array in the form:
[x1,y1,x2,y2,...,xn,yn]

Test Case 1
int[] nums = {2, 5, 1, 3, 4, 7};
int n = 3;

Test Case 2
int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
int n = 4;

Test Case 3
int[] nums = {1, 1, 2, 2};
int n = 2;

Output:
2 3 5 4 1 7
1 4 2 3 3 2 4 1
1 2 1 2
 */
public class A11_ShuffleTheArray_1470 {
    public static int[] shuffleArray(int nums[]){
        int j=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length/2;i++){
            arr[j++]=nums[i];
            arr[j++]=nums[i+nums.length/2];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int result[]=shuffleArray(nums);
        System.out.println(Arrays.toString(result));
    }

}
