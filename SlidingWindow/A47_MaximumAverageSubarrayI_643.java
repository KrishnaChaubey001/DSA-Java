package DSA.SlidingWindow;
/*
Given an integer array nums consisting of n elements and an integer k, find the contiguous subarray whose length is equal to k that has the maximum average value.
Example 1:
Input:
int[] nums = {1,12,-5,-6,50,3};
int k = 4;
Output:
12.75
Explanation:
Subarray:
12 -5 -6 50
Sum = 51
Average = 12.75
Example 2:
Input:
int[] nums = {5};
int k = 1;
Output:
5.0
 */
public class A47_MaximumAverageSubarrayI_643 {
    public static double maximumAverage(int nums[],int k){
        int i=0,j=0,sum=0,max=Integer.MIN_VALUE;
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
        return (double)max/k;
    }
}
