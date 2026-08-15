package DSA.BinarySearch;

import java.util.ArrayList;
import java.util.List;

/*
Question:
Given a sorted integer array nums, two integers k and x, return the k closest integers to x in the array.
 The result should be sorted in ascending order.
Example 1:
Input:
int[] nums = {1,2,3,4,5};
int k = 4;
int x = 3;
Output:
1 2 3 4
Explanation:
The four elements closest to 3 are 1, 2, 3, and 4.
Example 2:
Input:
int[] nums = {1,2,3,4,5};
int k = 4;
int x = -1;
Output:
1 2 3 4
Explanation:
The four closest elements to -1 are 1, 2, 3, and 4.
Example 3:
Input:
int[] nums = {1,3,5,7,9};
int k = 2;
int x = 6;
Output:
5 7
Explanation:
5 and 7 are the two closest elements to 6.
--------------------------------------------------
*/
public class BS77_FindKClosestElements_658 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>list=new ArrayList<>();
        int low=0,high=arr.length-k;
        while(low<high){
            int mid=low+(high-low)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                low=mid+1;
            }else high=mid;
        }
        for(int i=low;i<low+k;i++){
            list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        System.out.println(findClosestElements(nums,k,x));
    }
}
