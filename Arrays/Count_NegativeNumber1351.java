package DSA.Arrays.Traversal;
import java.util.Scanner;
public class Count_NegativeNumber1351 {
    public static void main(String[] args) {
        int arr[][]={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},{-1,-1,-2,-3}

        };
        int result=CountNegative(arr);
        System.out.println(result);
    }
    public static int  CountNegative(int arr [][]){
        int count=0;
        int i=0;
        int j=arr[i].length-1;

        while(i<arr.length&& j>=0){
            if(arr[i][j]<0){
                count+= arr.length- i;
                j--;
            }
            else{
                i++;
            }

        }
        return count;
    }


}
