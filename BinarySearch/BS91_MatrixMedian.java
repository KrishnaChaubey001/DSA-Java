package DSA.BinarySearch;
/*
Question:
Given a row-wise sorted matrix where the number of rows and columns is odd, find the median of the matrix.
Example 1:
Input:
int[][] matrix = {{1,3,5},{2,6,9},{3,6,9}};
Output:
5
Explanation:
The elements in sorted order are {1,2,3,3,5,6,6,9,9}. The median is 5.
Example 2:
Input:
int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
Output:
5
Explanation:
The middle element of the sorted matrix is 5.
Example 3:
Input:
int[][] matrix = {{1,2,3},{3,4,5},{5,6,7}};
Output:
4
Explanation:
The elements in sorted order are {1,2,3,3,4,5,5,6,7}. The median is 4.
--------------------------------------------------
*/
public class BS91_MatrixMedian {

    public static int findMedian(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols - 1]);
        }

        int required = (rows * cols) / 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int count = 0;

            for (int i = 0; i < rows; i++) {
                count += upperBound(matrix[i], mid);
            }

            if (count <= required) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static int upperBound(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] matrix1 = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        System.out.println(findMedian(matrix1)); // 5

        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(findMedian(matrix2)); // 5
    }
}