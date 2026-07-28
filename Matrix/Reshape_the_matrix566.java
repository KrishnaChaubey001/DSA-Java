package DSA.Matrix;

import java.util.Arrays;

public class Reshape_the_matrix566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;int cols=mat[0].length;
        if(rows*cols!=r*c){
            return mat;
        }
        int result[][]=new int[r][c];
        int k=0;
        for( int i=0;i<rows;i++){
            for( int j=0;j<cols;j++){
                result[k/c][k%c]=mat[i][j];
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int mat [][]={{1,2},{3,4}}; int r = 1; int c = 4;
        int mat1[][] = {{1,2},{3,4}}; int  r1 = 2; int c1 = 4;
        int result [][]=matrixReshape(mat,r,c);
        int result1[][]= matrixReshape(mat1,r1,c1);
        System.out.println(Arrays.deepToString(result));
        System.out.println(Arrays.deepToString(result1));


    }
}
