package DSA.BinarySearch;

import java.util.Arrays;

/*
Question:
Given an m x n matrix where no two adjacent cells are equal, find a peak element.
 A peak element is an element that is strictly greater than its adjacent cells.
  Return the position of any peak element.
Example 1:
Input:
int[][] matrix = {{1,4},{3,2}};
Output:
1 0
Explanation:
The element 3 at row 1, column 0 is greater than its adjacent elements.
Example 2:
Input:
int[][] matrix = {{10,20,15},{21,30,14},{7,16,32}};
Output:
1 1
Explanation:
The element 30 at row 1, column 1 is greater than all its adjacent elements.
Example 3:
Input:
int[][] matrix = {{5}};
Output:
0 0
Explanation:
The only element is a peak.
--------------------------------------------------
*/
public class BS75_PeakElementIn2DMatrix_1901 {
    public static  int[] findPeakGrid(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int low=0,high=cols-1;
        while(low<=high){
            int midcol=low+(high-low)/2;
            int maxrow=0;
            for(int i=1;i<rows;i++){
                if(mat[i][midcol]>mat[maxrow][midcol]){
                    maxrow=i;
                }
            }
            int current=mat[maxrow][midcol];
            int leftelement=(midcol==0)?-1:mat[maxrow][midcol-1];
            int rightelement=(midcol==cols-1)?-1:mat[maxrow][midcol+1];
            if(current>leftelement && current>rightelement) {
                return new int []{maxrow,midcol};
            }else if(rightelement>current)low=midcol+1;
            else high=midcol-1;
        }
        return new int []{-1,-1};
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4},{3,2}};
        System.out.println(Arrays.toString(findPeakGrid(matrix)));
        int[][] matrix1 = {{10,20,15},{21,30,14},{7,16,32}};
        System.out.println(Arrays.toString(findPeakGrid(matrix1)));
        int[][] matrix2 = {{5}};
        System.out.println(Arrays.toString(findPeakGrid(matrix2)));

    }
}

