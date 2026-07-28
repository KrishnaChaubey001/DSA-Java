package DSA.Basic_maths;

public class Check_if_a_Number_is_Palindrome_or_Not {
    public static boolean CheckPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return (rev == temp);
    }

    public static void main(String[] args) {
        int n = 121;
        int n1 = 125211;
        int n2 = -101;
        boolean result = CheckPalindrome(n);
        boolean result1 = CheckPalindrome(n1);
        boolean result2 = CheckPalindrome(n2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
