package DSA.BinarySearch;
/*
Question:
Given a positive integer num, return true if num is a perfect square. Otherwise, return false.
Do not use any built-in square root function.
Example 1:
Input:
int num = 16;
Output:
true
Explanation:
16 = 4 × 4.
Example 2:
Input:
int num = 14;
Output:
false
Explanation:
14 is not a perfect square.
Example 3:
Input:
int num = 1;
Output:
true
Explanation:
1 = 1 × 1.
--------------------------------------------------
*/
public class BS63_ValidPerfectSquare_367 {
    public static boolean isPerfectSquare(int num) {
        if(num==0|| num==1) return true;
        int low=1,high=num/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)mid*mid==num) {
                return true;

            }else if((long)mid*mid<num){
                low=mid+1;
            }else high=mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));
        System.out.println(isPerfectSquare(1));
        System.out.println(isPerfectSquare(37));
        System.out.println(isPerfectSquare(625));

    }
}
