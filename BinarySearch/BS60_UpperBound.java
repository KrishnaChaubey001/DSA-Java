package DSA.BinarySearch;
/*
Question:
Given a sorted array nums and an integer target, return the index of the first element strictly greater than
target. If no such element exists, return nums.length.
Example 1:
Input:
int[] nums = {1,2,4,4,5};
int target = 4;
Output:
4
Explanation:
The first element greater than 4 is 5 at index 4.
Example 2:
Input:
int[] nums = {1,2,4,4,5};
int target = 3;
Output:
2
Explanation:
The first element greater than 3 is 4 at index 2.
Example 3:
Input:
int[] nums = {1,2,4,4,5};
int target = 7;
Output:
5
Explanation:
No element is greater than 7, so return nums.length.
--------------------------------------------------
*/
public class BS60_UpperBound {
    public static int upperBound(int nums[],int target){
        int low=0,high=nums.length-1,ub=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                ub=mid;
                high=mid-1;

            }else low=mid+1;
        }
        return (ub==-1)? nums.length : ub;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,4,5};
        int target = 4;
        System.out.println(upperBound(nums,target));
        int[] nums1 = {1,2,4,4,5};
        int target1 = 3;
        System.out.println(upperBound(nums1,target1));
    }
}
