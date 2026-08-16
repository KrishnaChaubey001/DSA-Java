package DSA.BinarySearch;
/*
Question:
A conveyor belt has packages that must be shipped within days days.\
 The packages must be shipped in the given order. Return the least weight capacity of the
 ship that will allow all packages to be shipped within the given number of days.
Example 1:
Input:
int[] weights = {1,2,3,4,5,6,7,8,9,10};
int days = 5;
Output:
15
Explanation:
A ship capacity of 15 is the minimum capacity needed to ship all packages within 5 days.
Example 2:
Input:
int[] weights = {3,2,2,4,1,4};
int days = 3;
Output:
6
Explanation:
A capacity of 6 allows all packages to be shipped within 3 days.
Example 3:
Input:
int[] weights = {1,2,3,1,1};
int days = 4;
Output:
3
Explanation:
A capacity of 3 is sufficient to ship all packages within 4 days.
--------------------------------------------------
*/
public class BS82_CapacityToShipPackagesWithinDDays_1011 {
    public static  int shipWithinDays(int[] nums, int days) {
        int low=nums[0],high=0;
        for(int n:nums){
            high+=n;
            if(n>low){
                low=n;
            }
        }
        while(low<=high){
            int mid=(low+high)/2;
            int day=1;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(sum>mid){
                    day++;
                    sum=nums[i];
                }
            }
            if(day<=days)high=mid-1;
            else low=mid+1;
        }
        return low;

    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
}
