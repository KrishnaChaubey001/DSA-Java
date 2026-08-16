package DSA.BinarySearch;
/*
Question:
You are given an integer array bloomDay where bloomDay[i] is the day the ith flower will bloom. To make one bouquet, you need k adjacent flowers. Return the minimum number of days needed to make m bouquets. Return -1 if it is impossible.
Example 1:
Input:
int[] bloomDay = {1,10,3,10,2};
int m = 3;
int k = 1;
Output:
3
Explanation:
By day 3, flowers at positions 0, 2, and 4 have bloomed, so 3 bouquets can be made.
Example 2:
Input:
int[] bloomDay = {1,10,3,10,2};
int m = 3;
int k = 2;
Output:
-1
Explanation:
There are only 5 flowers, but 3 bouquets require 6 flowers.
Example 3:
Input:
int[] bloomDay = {7,7,7,7,12,7,7};
int m = 2;
int k = 3;
Output:
12
Explanation:
By day 12, enough adjacent flowers have bloomed to make 2 bouquets.
--------------------------------------------------
*/
public class BS80_MinimumDaysToMakeMBouquets_1482 {
    public static  boolean possible(int[] nums, int day, int m, int k) {
        int count = 0;
        int bouquets = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    if (bouquets == m) {
                        return true;
                    }
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int low = bloomDay[0];
        int high = bloomDay[0];
        for (int day : bloomDay) {
            if (day < low) {
                low = day;
            }
            if (day > high) {
                high = day;
            }
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        int m = 3;
        int k = 1;
        int[] bloomDay1 = {1,10,3,10,2};
        int m1 = 3;
        int k1 = 2;
        System.out.println(minDays(bloomDay,m,k));
        System.out.println(minDays(bloomDay1,m1,k1));

    }
}
