package DSA.Arrays.Traversal;
import java.util.Scanner;
public class Richest_Costumer_wealth1672 {
    public static void main(String[] args) {
        // Example
        int arr[][]={
                {1,2,3},
                {3,2,1}
        };
        int result=MaxWealth(arr);
        System.out.println(result);
    }
    public static int MaxWealth(int arr [][]){
        if(arr==null || arr.length==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            max=Math.max(sum,max);
        }
        return max;
    }


}
