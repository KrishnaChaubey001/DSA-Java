package DSA.revision.day2;

import java.util.Arrays;

/*
Question:
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element
appears only once.

Return the number of unique elements.

Example 1:
Input:
int[] nums = {1,1,2};

Output:
2

Array becomes:
[1,2,_]

Example 2:
Input:
int[] nums = {0,0,1,1,1,2,2,3,3,4};

Output:
5

Array becomes:
[0,1,2,3,4,_,_,_,_,_]
*/
public class q6 {
    public static int  removeDuplicates(int nums[]){
        int i=0;
        for(int j=i;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        System.out.println("modified elements are : "+Arrays.toString(nums));
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

}
