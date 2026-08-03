package DSA.BinarySearch;

/*
Question:
Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
Do not use any built-in exponent function or operator.
Example 1:
Input:
int x = 4;
Output:
2
Explanation:
√4 = 2.
Example 2:
Input:
int x = 8;
Output:
2
Explanation:
√8 = 2.828..., so return only the integer part.
Example 3:
Input:
int x = 1;
Output:
1
Explanation:
√1 = 1.
--------------------------------------------------
*/
public class BS62_SquareRootOfANumber_69 {

    public static int bruteForce(int x) {
        if (x == 0 || x == 1)
            return x;
        int ans = 0;
        for (int i = 1; (long) i * i <= x; i++) {
            ans = i;
        }
        return ans;
    }

    //Optimal solution
    public static int mySqrt(int x) {
        if(x==0||x==1) return x;
        int ans=-1,low=1,high=x/2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long)mid*mid<=x){
                ans=mid;
                low=mid+1;
            }else high=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {

        System.out.println(bruteForce(4));   // 2
        System.out.println(bruteForce(8));   // 2
        System.out.println(bruteForce(1));   // 1
        System.out.println(bruteForce(0));   // 0
        System.out.println(bruteForce(15));  // 3
        System.out.println(bruteForce(16));  // 4
        System.out.println("Optimal solution");
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(1));
        System.out.println(mySqrt(0));
        System.out.println(mySqrt(15));
        System.out.println(mySqrt(16));

    }
}