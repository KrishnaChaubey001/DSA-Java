package DSA.BinarySearch;

import java.util.Arrays;

/*
Question:
Given an array of stall positions and an integer cows, place the cows in different
stalls such that the minimum distance between any two cows is maximized. Return the maximum possible
 minimum distance.
Example 1:
Input:
int[] stalls = {1,2,4,8,9};
int cows = 3;
Output:
3
Explanation:
The cows can be placed at positions 1,4,8. The minimum distance is 3.
Example 2:
Input:
int[] stalls = {10,1,2,7,5};
int cows = 3;
Output:
4
Explanation:
After sorting, stalls are {1,2,5,7,10}. The cows can be placed at 1,5,10, giving a minimum distance of 4.
Example 3:
Input:
int[] stalls = {1,3,7,9,10};
int cows = 3;
Output:
4
Explanation:
The cows can be placed at 1,7,10. The minimum distance is 4.
--------------------------------------------------
*/
public class BS85_AggressiveCows {
    public static int minimmumDistance(int arr[],int cows){
        Arrays.sort(arr);
        int low=1,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>max){
                max=n;
            }
            if(n<min) min=n;
        }
        int high=max-min;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(canWePlace(arr,mid,cows)) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
    public static boolean canWePlace(int arr[],int dis,int cows){

        int count=1,last=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]-last>=dis){
                count++;
                last=arr[i];
            }
        }
        return (count>=cows) ;
    }

    public static void main(String[] args) {

        int[] stalls = {1,2,4,8,9};
        int cows = 3;
        System.out.println(minimmumDistance(stalls,cows));
        int[] stalls1 = {10,1,2,7,5};
        int cows1 = 3;
        System.out.println(minimmumDistance(stalls1,cows1));

    }
}
