package DSA.BinarySearch;
/*
Question:
Given an array of board lengths and an integer painters, divide the boards among the painters such that each
painter gets contiguous boards and the maximum amount of work assigned to any painter is minimized.
Example 1:
Input:
int[] boards = {10,20,30,40};
int painters = 2;
Output:
60
Explanation:
The optimal division is [10,20,30] and [40]. The maximum work is 60.
Example 2:
Input:
int[] boards = {10,20,30,40,50};
int painters = 3;
Output:
60
Explanation:
The boards can be divided as [10,20,30], [40], and [50]. The maximum work is 60.
Example 3:
Input:
int[] boards = {5,5,5,5};
int painters = 2;
Output:
10
Explanation:
Each painter can handle two boards, giving a maximum workload of 10.
--------------------------------------------------
*/
public class BS86_PainterPartitionProblem {
    public static int painterproblem(int nums[],int k){
        int low=nums[0],high=0;
        for(int n:nums){
            high+=n;
            if(n>low){
                low=n;
            }
        }
        while(low<=high){
            int mid=(high+low)/2;
            int sum=0,painter=1;
            for(int n:nums){
                sum+=n;
                if(sum>mid){
                    painter++;
                    sum=n;
                }
            }
            if(painter>k){
                low=mid+1;
            }else high=mid-1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] boards = {10,20,30,40};
        int painters = 2;
        System.out.println(painterproblem(boards,painters));
        int[] boards1 = {10,20,30,40,50};
        int painters1 = 3;
        System.out.println(painterproblem(boards1,painters1));
        int[] boards2 = {5,5,5,5};
        int painters2 = 2;
        System.out.println(painterproblem(boards2,painters2));
    }

}
