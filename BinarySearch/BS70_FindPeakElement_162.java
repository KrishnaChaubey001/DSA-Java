package DSA.BinarySearch;
/*
Question:
A peak element is an element that is strictly greater than its neighbours. Given an integer array nums,
 return the index of any peak element.
Example 1:
Input:
int[] nums = {1,2,3,1};
Output:
2
Explanation:
3 is greater than both of its neighbours.
Example 2:
Input:
int[] nums = {1,2,1,3,5,6,4};
Output:
5
Explanation:
6 is a peak element. Index 1 is also a valid answer because 2 is another peak.
Example 3:
Input:
int[] nums = {1};
Output:
0
Explanation:
The only element is the peak.
--------------------------------------------------
*/
public class BS70_FindPeakElement_162 {
    public static int findPeakElement(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else high=mid;
        }
        return high;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};

        int[] nums1 = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
        System.out.println(findPeakElement(nums1));
    }
}
