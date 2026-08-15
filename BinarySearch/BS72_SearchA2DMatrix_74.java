package DSA.BinarySearch;
/*
Question:
You are given an m x n matrix with the following properties:
Each row is sorted in ascending order.
The first integer of each row is greater than the last integer of the previous row.
Return true if the target exists in the matrix, otherwise return false.
Example 1:
Input:
int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
int target = 3;
Output:
true
Explanation:
3 exists in the matrix.
Example 2:
Input:
int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
int target = 13;
Output:
false
Explanation:
13 does not exist in the matrix.
Example 3:
Input:
int[][] matrix = {{1}};
int target = 1;
Output:
true
Explanation:
The only element matches the target.
--------------------------------------------------
*/
public class BS72_SearchA2DMatrix_74 {
    // 3 Ways to solve this question
    // 1.Brute force
    //2.take evry row and apply binary search
    //3.consider 2d array as a 1d array
    // 2 approach below->
    public static boolean arrsearch(int [] mat,int target){
        int low=0,high=mat.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mat[mid]==target) return true;
            else if(mat[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    public static boolean searchMatrix2(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(arrsearch(matrix[i],target)) return true;
        }
        return false;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int low=0,high=(matrix.length*matrix[0].length) -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int num=matrix[mid/matrix[0].length][mid%matrix[0].length];
            if(num==target) return true;
            else if (num<target) low=mid+1;
            else high=mid-1;
        }
        return false;

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));

        int[][] matrix1 = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target1 = 13;
        System.out.println(searchMatrix(matrix1,target1));
    }
}
