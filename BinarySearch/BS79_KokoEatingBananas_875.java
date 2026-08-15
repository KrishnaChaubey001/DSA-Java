package DSA.BinarySearch;
/*
Question:
Koko loves to eat bananas. There are n piles of bananas, and Koko can eat k bananas per hour. Return the minimum integer k such that Koko can eat all the bananas within h hours.
Example 1:
Input:
int[] piles = {3,6,7,11};
int h = 8;
Output:
4
Explanation:
At speed 4 bananas per hour, Koko can finish all piles within 8 hours.
Example 2:
Input:
int[] piles = {30,11,23,4,20};
int h = 5;
Output:
30
Explanation:
Koko must eat at a speed of 30 bananas per hour to finish within 5 hours.
Example 3:
Input:
int[] piles = {30,11,23,4,20};
int h = 6;
Output:
23
Explanation:
A speed of 23 bananas per hour is the minimum speed that allows Koko to finish within 6 hours.
--------------------------------------------------
*/
public class BS79_KokoEatingBananas_875 {
    public static int max(int nums[]) {
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return nums[max];
    }

    public static long totalhours(int nums[], int k) {
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += ((long) nums[i] + k - 1) / k;
        }
        return total;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = max(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (totalhours(piles, mid) > h)
                low=mid+1;
            else
                high= mid -1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
}
