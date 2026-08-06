package DSA.BinarySearch;
/*
Question:
Given a sorted array that has been rotated clockwise, find how many times the array has been rotated.
Example 1:
Input:
int[] nums = {15,18,2,3,6,12};
Output:
2
Explanation:
The minimum element 2 is at index 2, so the array is rotated 2 times.
Example 2:
Input:
int[] nums = {7,9,11,12,5};
Output:
4
Explanation:
The minimum element 5 is at index 4.
Example 3:
Input:
int[] nums = {1,2,3,4,5};
Output:
0
Explanation:
The array is already sorted and not rotated.
--------------------------------------------------
*/
public class BS69_FindHowManyTimesArrayIsRotated {
    public static int timesRotated(int nums[]){
        int low=0,high=nums.length-1,ans=-1,min=Integer.MAX_VALUE;
        while(low<=high){
            if(nums[low]<=nums[high]){
                if(nums[low]<min){
                    min=nums[low];
                    ans=low;
                }
                break;
            }
            int mid=low+(high-low)/2;
            if(nums[low]<=nums[mid]){
                if(nums[low]<min){
                    min=nums[low];
                    ans=low;
                }
                low=mid+1;
            }else{
                if(nums[mid]<min){
                    min=nums[mid];
                    ans=mid;
                }
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {15,18,2,3,6,12};
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {7,9,11,12,5};
        System.out.println(timesRotated(nums));
        System.out.println(timesRotated(nums1));
        System.out.println(timesRotated(nums2));

    }
}
