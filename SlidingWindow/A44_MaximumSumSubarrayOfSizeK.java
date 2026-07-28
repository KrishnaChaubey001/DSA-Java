package DSA.SlidingWindow;
/*
Question:
Given an integer array nums and an integer k, find the maximum sum of any contiguous subarray of size k.
Example 1:
Input:
int[] nums = {2,1,5,1,3,2};
int k = 3;
Output:
9
Explanation:
Subarray:
5 1 3
Sum = 9
Example 2:
Input:
int[] nums = {2,3,4,1,5};
int k = 2;
Output:
7
Explanation:
Subarray:
3 4
Sum = 7
 */
public class A44_MaximumSumSubarrayOfSizeK {
    public static int MaximumSum(int nums[],int k){
        if(nums==null|| nums.length==0|| k<=0|| k>nums.length) return -1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;

        for(int i=k;i<nums.length;i++ ){
            sum+=nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return max;
    }
    public static int maximumSum(int [] nums,int k){
        int i=0, j=0,sum=0; int max=Integer.MIN_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(max,sum);
                sum-=nums[i];
                i++;j++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,1,3,2};
        int k=3;
        System.out.println(MaximumSum(nums,k));
        System.out.println(maximumSum(nums,k));
        int[] nums1 = {2,3,4,1,5};
        int k1 = 2;
        System.out.println(MaximumSum(nums1,k1));
        System.out.println(maximumSum(nums1,k1));


    }

}
