package DSA.Matrix;

public class Special_Positions_in_BinaryMatrix_1582 {
    public static int numSpecial(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
        int rowscount[]=new int[rows];
        int colscount[]=new int[cols];
        for( int i=0;i<mat.length;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==1){
                    rowscount[i]++;
                    colscount[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==1 && rowscount[i]==1 && colscount[j]==1){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [][] mat = {{1,0,0},{0,0,1},{1,0,0}};
        int [][] mat1 = {{1,0,0},{0,1,0},{0,0,1}};
        int result = numSpecial(mat);
        int result1 = numSpecial(mat1);

        System.out.println(result);
        System.out.println(result1);
    }
}
