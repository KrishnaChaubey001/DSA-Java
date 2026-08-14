package DSA.BinarySearch;
/*
Question:
Given a nearly sorted array where every element may be present at index i, i-1 or i+1,
 search for a target element and return its index. Return -1 if the target is not present.
Example 1:
Input:
int[] nums = {5,10,30,20,40};
int target = 20;
Output:
3
Explanation:
20 is found at index 3.
Example 2:
Input:
int[] nums = {10,3,40,20,50,80,70};
int target = 40;
Output:
2
Explanation:
40 is present at index 2.
Example 3:
Input:
int[] nums = {2,1,3,5,4};
int target = 6;
Output:
-1
Explanation:
Target is not present.
--------------------------------------------------
*/
public class BS71_SearchInNearlySortedArray {
    public static int search(int nums[],int target){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(mid-1>=low && nums[mid-1]==target){
                return mid-1;
            }else if(mid+1<=high && nums[mid+1]==target){
                return mid+1;
            }else if(nums[mid]<target) low=mid+2;
            else high=mid-2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,10,30,20,40};
        int target = 20;
        System.out.println(search(nums,target));
        int[] nums1 = {10,3,40,20,50,80,70};
        int target1 = 40;
        System.out.println(search(nums1,target1));
        int[] nums2 = {2,1,3,5,4};
        int target2 = 6;
        System.out.println(search(nums2,target2));

    }
}
