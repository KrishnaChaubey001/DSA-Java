package DSA.Matrix;

public class Toeplitz_Matrix766 {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int mat[][]= {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int mat1[][]= {{1,2},{2,2}};
        boolean result= isToeplitzMatrix(mat);
        boolean result1= isToeplitzMatrix(mat1);
        System.out.println(result);
        System.out.println(result1);

    }
}
