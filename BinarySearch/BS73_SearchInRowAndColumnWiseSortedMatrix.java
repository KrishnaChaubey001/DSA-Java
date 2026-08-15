package DSA.BinarySearch;
/*
Question:
Given an n x m matrix where each row is sorted from left to right and each column is sorted
 from top to bottom, return true if the target exists in the matrix. Otherwise, return false.
Example 1:
Input:
int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
int target = 29;
Output:
true
Explanation:
29 is present at row 2, column 1.
Example 2:
Input:
int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
int target = 100;
Output:
false
Explanation:
100 is not present in the matrix.
Example 3:
Input:
int[][] matrix = {{5}};
int target = 10;
Output:
false
Explanation:
The only element is not equal to the target.
--------------------------------------------------
*/
public class BS73_SearchInRowAndColumnWiseSortedMatrix {
    public static boolean searchMatrix(int matrix[][],int target){
        int  row=0,col=matrix[0].length-1;
        while(row< matrix.length&&col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if (matrix[row][col]>target){
                col--;
            }
            else row++;
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int target = 100;
        System.out.println(searchMatrix(matrix,target));
        int[][] matrix1 = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int target1 = 29;
        System.out.println(searchMatrix(matrix1,target1));
    }
}
