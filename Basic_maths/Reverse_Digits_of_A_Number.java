package DSA.Basic_maths;
// Optimal Solution with timecomplexity O(log10N)...

public class Reverse_Digits_of_A_Number {
    public static int RevrseNumber(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n=10400;
        int n1=55671;
        int n2=780;
        int result=RevrseNumber(n);
        int result1=RevrseNumber(n1);
        int result2 =RevrseNumber(n2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
