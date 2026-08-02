package DSA.revision.day3;

import java.util.Arrays;

/*
Question:
Given two strings s1 and s2, return true if s2 contains
a permutation of s1.

Example 1:
Input:
String s1 = "ab";
String s2 = "eidbaooo";

Output:
true

Explanation:
"ba" is a permutation of "ab".

Example 2:
Input:
String s1 = "ab";
String s2 = "eidboaoo";

Output:
false
--------------------------------------------------
*/
public class Q4_PermutationInString_567 {
    public static  boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        int k=s1.length();
        for(int i=0;i<k;i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) return true;
        for(int i=k;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-k)-'a']--;
            if(Arrays.equals(freq2,freq1)) return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
        String s11 = "ab";
        String s21 = "eidboaoo";
        System.out.println(checkInclusion(s11,s21));

    }
}
