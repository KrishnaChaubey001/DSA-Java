package DSA.Matrix;

public class Matrix_Diagonal_Sum1572 {
    public static int DiagonalSum(int mat[][]){
        int n= mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
        }
        if(n%2==1){
            sum-=mat[n/2][n/2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int mat1[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int result=DiagonalSum(mat);
        int result1=DiagonalSum(mat1);
        System.out.println(result);
        System.out.println(result1);


    }
}
