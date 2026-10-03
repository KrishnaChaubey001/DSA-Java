package DSA.Stack;

/*
Question:
Given a string num representing a non-negative integer and an integer k,
remove exactly k digits from the number so that the resulting number is
the smallest possible number.
The resulting number should not contain leading zeros unless the result is 0.
Input:
        String num1 = "1432219";
        int k1 = 3;
        String num2 = "10200";
        int k2 = 1;
        String num3 = "10";
        int k3 = 2;
Example 1:
Output:
        "1219"
Explanation:
        Removing 4, 3, and 2 gives the smallest possible number 1219.
Example 2:
Output:
        "200"
Explanation:
        Removing 1 gives 0200, which becomes 200 after removing the leading zero.
Example 3:
Output:
        "0"
Explanation:
        Removing both digits leaves an empty number, which is represented as 0.
--------------------------------------------------
*/
public class ST175_RemoveKDigits_402 {
    public static String removeKdigits(String num, int k) {
        if(k==num.length()) return "0";
        StringBuilder sb = new StringBuilder();
        for (char ch : num.toCharArray()) {
            while (!sb.isEmpty() && k > 0 && sb.charAt(sb.length() - 1) > ch) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(ch);
        }
        while ( k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }
        int i=0;
        while (i<sb.length() && sb.charAt(i) == '0') {
            i++;
        }
        if(i==sb.length()) return "0";
        return sb.substring(i);
    }

    public static void main(String[] args) {
        String num1 = "1432219";
        int k1 = 3;
        String num2 = "10200";
        int k2 = 1;
        String num3 = "10";
        int k3 = 2;
        System.out.println(removeKdigits(num1,k1));
        System.out.println(removeKdigits(num2,k2));
        System.out.println(removeKdigits(num2,k3));

    }
}
