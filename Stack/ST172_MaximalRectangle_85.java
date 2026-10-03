package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
Question:
Given a binary matrix containing only '0' and '1',
find the largest rectangle containing only 1s.
Input:
        char[][] matrix1 = {
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        char[][] matrix2 = {
            {'0','1'},
            {'1','0'}
        };
        char[][] matrix3 = {
            {'1','1'},
            {'1','1'}
        };
Example 1:
Output:
        6
Explanation:
        The largest rectangle of 1s has 3 rows and 2 columns,
        giving an area of 6.
Example 2:
Output:
        1
Explanation:
        The largest rectangle containing only 1s has area 1.
Example 3:
Output:
        4
Explanation:
        The entire 2 × 2 matrix contains 1s, so the area is 4.
--------------------------------------------------
*/
public class ST172_MaximalRectangle_85 {
    public static int maximalRectangle(char[][] matrix) {
        int maxArea=0;
        int row=matrix.length;
        int col=matrix[0].length;
        int sumP[][]=new int[row][col];
        for(int j=0;j<col;j++){
            int sum=0;
            for(int i=0;i<row;i++){
                sum+=matrix[i][j]-'0';
                if(matrix[i][j]=='0') sum=0;
                sumP[i][j]=sum;
            }
        }
        for(int i=0;i<row;i++){
            maxArea=Math.max(maxArea,largestArea(sumP[i]));
        }
        return maxArea;
    }
    private static int largestArea(int nums[]){
        Deque<Integer>st=new ArrayDeque<>();
        int max=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                int el=st.peek();
                st.pop();
                int nsc=i;
                int psc=(st.isEmpty())? -1:st.peek();
                max=Math.max(max,nums[el]*(nsc-psc-1));
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int el=st.peek();
            st.pop();
            int nsc=n;
            int psc=(st.isEmpty())? -1:st.peek();
            max=Math.max(max,nums[el]*(nsc-psc-1));
        }
        return max;
    }

    public static void main(String[] args) {
        char[][] matrix1 = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        char[][] matrix2 = {
                {'0','1'},
                {'1','0'}
        };
        char[][] matrix3 = {
                {'1','1'},
                {'1','1'}
        };
        System.out.println((maximalRectangle(matrix1)));
        System.out.println((maximalRectangle(matrix2)));
        System.out.println((maximalRectangle(matrix3)));
    }
}
