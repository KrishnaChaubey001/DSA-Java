package DSA.BinarySearch;
/*
Question:
Given a strictly increasing array of positive integers arr and an integer k, return the kth positive integer that is missing from the array.
Example 1:
Input:
int[] arr = {2,3,4,7,11};
int k = 5;
Output:
9
Explanation:
The missing positive integers are 1,5,6,8,9,10,...
The 5th missing positive integer is 9.
Example 2:
Input:
int[] arr = {1,2,3,4};
int k = 2;
Output:
6
Explanation:
The missing positive integers are 5,6,7,...
The 2nd missing positive integer is 6.
Example 3:
Input:
int[] arr = {5,6,7,8};
int k = 3;
Output:
3
Explanation:
The missing positive integers are 1,2,3,...
The 3rd missing positive integer is 3.
--------------------------------------------------
*/
public class BS78_KthMissingPositiveNumber_1539 {
    public static int findKthPositive(int[] arr, int k) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k) low=mid+1;
            else high=mid-1;
        }
        return low+k;

    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
        int[] arr1 = {5,6,7,8};
        int k1 = 3;
        System.out.println(findKthPositive(arr1,k1));
    }
}
