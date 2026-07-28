package DSA.Arrays.Traversal;
/*
Question:
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
Return the wealth that the richest customer has.

Test Case 1
int[][] accounts = {{1,2,3},{3,2,1}};

Test Case 2
int[][] accounts = {{1,5},{7,3},{3,5}};

Test Case 3
int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};

Output:
6
10
17
 */
public class A12_RichestCustomerWealth_1672 {
    public static int  highestWealth(int nums[][]){
        int max=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j< nums[i].length;j++){
                sum+=nums[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }


        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int a1=highestWealth(accounts);
        System.out.println(a1);
        int[][] accounts1 = {{1,5},{7,3},{3,5}};
        int a2=highestWealth(accounts1);
        System.out.println(a2);
    }
}
