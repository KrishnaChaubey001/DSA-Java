package DSA.BinarySearch;
/*
Question:
Given an array of positions of existing gas stations and an integer k, add k new gas stations so that
 the maximum distance between adjacent gas stations is minimized. Return the minimum possible maximum distance.
Example 1:
Input:
int[] stations = {1,2,3,4,5};
int k = 4;
Output:
0.5
Explanation:
By adding four stations between the existing stations, the maximum distance can be reduced to 0.5.
Example 2:
Input:
int[] stations = {1,10};
int k = 1;
Output:
4.5
Explanation:
Adding one station at position 5.5 creates two gaps of 4.5.
Example 3:
Input:
int[] stations = {1,10};
int k = 2;
Output:
3.0
Explanation:
Adding two stations divides the distance of 9 into three equal gaps of 3.
--------------------------------------------------
*/
public class BS88_MinimizeMaxDistanceToGasStation {

    public static double minimizeMaxDistance(int[] stations, int k) {
        int n = stations.length;

        double low = 0;
        double high = 0;

        // Find the maximum existing gap
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, stations[i + 1] - stations[i]);
        }

        // Binary Search on the answer
        double precision = 1e-6;

        while (high - low > precision) {
            double mid = low + (high - low) / 2;

            if (canPlaceStations(stations, k, mid)) {
                high = mid; // Try to minimize the maximum distance
            } else {
                low = mid;
            }
        }

        return high;
    }

    public static boolean canPlaceStations(int[] stations, int k, double maxDistance) {
        int requiredStations = 0;

        for (int i = 0; i < stations.length - 1; i++) {
            double gap = stations[i + 1] - stations[i];

            // Number of stations required in this gap
            requiredStations += (int) Math.ceil(gap / maxDistance) - 1;

            if (requiredStations > k) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] stations1 = {1, 2, 3, 4, 5};
        int k1 = 4;
        System.out.println(minimizeMaxDistance(stations1, k1));

        int[] stations2 = {1, 10};
        int k2 = 1;
        System.out.println(minimizeMaxDistance(stations2, k2));

        int[] stations3 = {1, 10};
        int k3 = 2;
        System.out.println(minimizeMaxDistance(stations3, k3));
    }
}
