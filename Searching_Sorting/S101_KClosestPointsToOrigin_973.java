package DSA.Searching_Sorting;
/*
Question:
Given an array of points where points[i] = [xi, yi], return the k closest points to the origin (0,0).
Input:
        int[][] points = {{1,3},{-2,2}};
        int k = 1;
        int[][] points1 = {{3,3},{5,-1},{-2,4}};
        int k1 = 2;
        int[][] points2 = {{1,1},{2,2},{3,3}};
        int k2 = 2;
Example 1:
Output:
[-2,2]
Explanation:
The distance of [-2,2] from the origin is smaller than the distance of [1,3].
Example 2:
Output:
[3,3] [-2,4]
Explanation:
These two points are closest to the origin.
Example 3:
Output:
[1,1] [2,2]
Explanation:
These are the two closest points to the origin.
--------------------------------------------------
*/

import java.util.Arrays;

public class S101_KClosestPointsToOrigin_973 {
    public static  int[][] kClosest(int[][] points, int k) {

        Arrays.sort(points, (a, b) -> {
            int distanceA = a[0] * a[0] + a[1] * a[1];
            int distanceB = b[0] * b[0] + b[1] * b[1];

            return Integer.compare(distanceA, distanceB);
        });

        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            result[i] = points[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;
        int[][] points1 = {{3,3},{5,-1},{-2,4}};
        int k1 = 2;
        int[][] points2 = {{1,1},{2,2},{3,3}};
        int k2 = 2;
        System.out.println(Arrays.deepToString(kClosest(points, k)));

    }
}
