package DSA.BinarySearch;
/*
Question:
Given a sorted array nums and an integer target, find the floor and ceil of the target.
Floor is the greatest element smaller than or equal to the target.
Ceil is the smallest element greater than or equal to the target.
If floor or ceil does not exist, return -1 for that value.
Example 1:
Input:
int[] nums = {1,2,4,6,10};
int target = 5;
Output:
Floor = 4
Ceil = 6
Explanation:
4 is the greatest number less than or equal to 5 and 6 is the smallest number greater than or equal to 5.
Example 2:
Input:
int[] nums = {1,2,4,6,10};
int target = 4;
Output:
Floor = 4
Ceil = 4
Explanation:
Target exists in the array.
Example 3:
Input:
int[] nums = {2,4,6,8};
int target = 1;
Output:
Floor = -1
Ceil = 2
Explanation:
There is no floor for 1.
--------------------------------------------------
*/
public class BS61_FloorAndCeilInSortedArray {
    public static int floor(int nums[],int target){
        int low=0,high=nums.length-1,floor=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target){
                floor=mid;
                low=mid+1;
            }else high=mid-1;
        }
        return (floor==-1)?-1:nums[floor];
    }
    public static int ceil(int nums[],int target){
        int low=0,high=nums.length-1,ceil=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ceil=mid;
                high=mid-1;
            }else low=mid+1;
        }
        return (ceil==-1)?-1: nums[ceil];
    }
    public static void floorAndCeilin(int []nums,int target){
        int floor=floor(nums,target);
        System.out.println("floor = "+floor);
        int ceil=ceil(nums,target);
        System.out.println("ceil = "+ceil);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,6,10};
        int target = 5;
        int[] nums1 = {1,2,4,6,10};
        int target1 = 4;
        int[] nums2 = {2,4,6,8};
        int target2 = 1;
        floorAndCeilin(nums,target);
        floorAndCeilin(nums1,target1);
        floorAndCeilin(nums2,target2);


    }
}
