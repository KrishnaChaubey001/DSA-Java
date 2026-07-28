package DSA.Hashing;

import java.util.Arrays;
import java.util.HashSet;

/*
uestion:
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique.
Example 1:
Input:
int[] nums1 = {1,2,2,1};
int[] nums2 = {2,2};
Output:
2
Example 2:
Input:
int[] nums1 = {4,9,5};
int[] nums2 = {9,4,9,8,4};
Output:
4 9
 */
public class A38_IntersectionOfTwoArrays_349 {
    public static int[] intersection(int num1[],int num2[]){
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> ansSet=new HashSet<>();
        for(int n:num1){
            set.add(n);
        }
        for(int n:num2){
            if(set.contains(n)){
                ansSet.add(n);
            }
        }
        int result[]=new int[ansSet.size()];
        int i=0;
        for(int n:ansSet){
            result[i++]=n;
        }
        return result;

    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(num1,num2)));

    }

}
