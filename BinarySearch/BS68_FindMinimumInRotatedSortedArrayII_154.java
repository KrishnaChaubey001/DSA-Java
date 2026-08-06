package DSA.BinarySearch;
/*
Question:
Given a rotated sorted array nums that may contain duplicate elements, return the minimum element.
Example 1:
Input:
int[] nums = {1,3,5};
Output:
1
Explanation:
1 is the minimum element.
Example 2:
Input:
int[] nums = {2,2,2,0,1};
Output:
0
Explanation:
0 is the minimum element.
Example 3:
Input:
int[] nums = {10,1,10,10,10};
Output:
1
Explanation:
Duplicate elements make the search slightly more difficult.
--------------------------------------------------
*/
public class BS68_FindMinimumInRotatedSortedArrayII_154 {
    public static  int findMin(int[] nums) {
        int low=0,high=nums.length-1,ans=nums[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]==nums[mid]&& nums[mid]==nums[high]){
                ans=Math.min(ans,nums[mid]);
                low++;
                high--;
            }
            else if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,5};
        int[] nums2 = {2,2,2,0,1};
        int[] nums = {10,1,10,10,10};
        System.out.println(findMin(nums1));
        System.out.println(findMin(nums2));
        System.out.println(findMin(nums));



    }
}
