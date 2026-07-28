package DSA.Hashing;

import java.util.HashSet;

/*
Question:
Write an algorithm to determine if a number n is happy.
A happy number eventually reaches 1 after replacing the number by the sum of the squares of its digits repeatedly.
Example 1:
Input:
int n = 19;
Output:
true
Explanation:
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1
Example 2:
Input:
int n = 2;
Output:
false
 */
public class A39_HappyNumber_202 {
        public static boolean isHappy(int n) {
            HashSet<Integer> set=new HashSet<>();
            while(true){
                int sum=0;
                while(n>0){
                    sum+=(n%10)*(n%10);
                    n=n/10;
                }
                if(sum==1){
                    return true;
                }
                else{
                    if(set.contains(sum)) return false;
                    set.add(sum);
                }
                n=sum;

            }
        }

    public static void main(String[] args) {
        int n = 19;
        int n1 = 2;
        System.out.println(isHappy(n));
        System.out.println(isHappy(n1));

    }

}
