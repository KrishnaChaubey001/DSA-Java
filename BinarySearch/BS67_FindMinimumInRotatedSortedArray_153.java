package DSA.BinarySearch;
/*
Question:
Given a rotated sorted array of unique elements, return the minimum element.
Example 1:
Input:
int[] nums = {3,4,5,1,2};
Output:
1
Explanation:
1 is the minimum element.
Example 2:
Input:
int[] nums = {4,5,6,7,0,1,2};
Output:
0
Explanation:
0 is the minimum element.
Example 3:
Input:
int[] nums = {11,13,15,17};
Output:
11
Explanation:
The array is not rotated, so the first element is the minimum.
--------------------------------------------------
*/
public class BS67_FindMinimumInRotatedSortedArray_153 {
    public static int findMin(int[] nums) {
        int low=0,high =nums.length-1,ans=nums[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
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
        int[] nums = {3,4,5,1,2};
        int[] nums1 = {4,5,6,7,0,1,2};
        int[] nums2 = {11,13,15,17};
        System.out.println((findMin(nums)));
        System.out.println((findMin(nums1)));
        System.out.println((findMin(nums2)));




    }
}
