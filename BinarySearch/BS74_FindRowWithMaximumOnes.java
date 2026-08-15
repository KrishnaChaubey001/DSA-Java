package DSA.BinarySearch;
/*
Question:
Given a binary matrix where each row is sorted in non-decreasing order,
find the index of the row that contains the maximum number of 1s. Return -1 if the matrix contains no 1.
Example 1:
Input:
int[][] matrix = {{0,0,0,1},{0,1,1,1},{0,0,1,1}};
Output:
1
Explanation:
Row 1 contains three 1s, which is the maximum.
Example 2:
Input:
int[][] matrix = {{0,0},{0,0}};
Output:
-1
Explanation:
There are no 1s in the matrix.
Example 3:
Input:
int[][] matrix = {{1,1,1},{0,0,1},{0,1,1}};
Output:
0
Explanation:
Row 0 contains three 1s, which is the maximum.
--------------------------------------------------
*/
public class BS74_FindRowWithMaximumOnes {
    public static int count1(int nums[]){
        int low=0,high=nums.length-1,fl=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==1){
                fl=mid;
                high=mid-1;
            }else low=mid+1;
        }
        return (fl==-1)? 0:nums.length-fl;
    }
    public static int maximumOnes(int nums[][]){
        int max=0,row=-1;
        for(int i=0;i<nums.length;i++){
            if(max<count1(nums[i])){
                max=count1(nums[i]);
                row=i;
            }
        }
        return (row==-1)? -1: row;
    }

    public static int maxone(int nums[][]){
        int row=0,col= nums[0].length-1,max=-1,ans=-1;
        while(row< nums.length && col>=0){
            if(nums[row][col]==1){
                    ans=row;
                    col--;
            }
            else row++;

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,0,0,1},{0,1,1,1},{0,0,1,1}};
        System.out.println(maximumOnes(matrix));
        int[][] matrix1 = {{0,0},{0,0}};
        System.out.println(maximumOnes(matrix1));
        int[][] matrix2 = {{1,1,1},{0,0,1},{0,1,1}};
        System.out.println(maximumOnes(matrix2));

        System.out.println("optimal solution");
        System.out.println(maxone(matrix));

    }
}
