package DSA.TwoPointers;
/*
Question:
Given a string s, return true if it is a palindrome after converting uppercase letters into lowercase and removing all non-alphanumeric characters.

Test Case 1
String s = "A man, a plan, a canal: Panama";

Test Case 2
String s = "race a car";

Test Case 3
String s = "madam";

Output:
true
false
true
--------------------------------------------------
 */
public class A20_ValidPalindrome_125 {
    public static boolean validPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(validPalindrome(s));
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s1));
        String s0 = "race a car";
        System.out.println(validPalindrome(s0));
        String s2=" ";
        System.out.println(validPalindrome(s2));
    }

}
