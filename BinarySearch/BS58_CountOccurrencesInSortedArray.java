package DSA.BinarySearch;
/*
Question:
Given a sorted array containing duplicate elements, count the total number of occurrences of a target element. Return 0 if the target is not present.
Example 1:
Input:
int[] nums = {1,2,2,2,3,4};
int target = 2;
Output:
3
Explanation:
2 appears three times.
Example 2:
Input:
int[] nums = {5,5,5,5};
int target = 5;
Output:
4
Explanation:
5 appears four times.
Example 3:
Input:
int[] nums = {1,2,3,4};
int target = 8;
Output:
0
Explanation:
Target is not present.
--------------------------------------------------
*/
public class BS58_CountOccurrencesInSortedArray {
    public static int firstOccurence(int[] nums,int target){
        int low=0,high= nums.length -1,first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else high=mid-1;
        }
        return first;
    }
    public static int lastOccurence(int[] nums,int target){
        int low=0,high= nums.length -1,last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else high=mid-1;
        }
        return last;
    }
    public static int countOccurence(int nums[],int target){
        int first=firstOccurence(nums,target);
        if(first==-1) return 0;
        int last=lastOccurence(nums,target);
        return (last-first+1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4};
        int target = 2;
        System.out.println(countOccurence(nums,target));
        int[] nums1 = {5,5,5,5};
        int target1 = 5;
        System.out.println(countOccurence(nums1,target1));

    }
}
