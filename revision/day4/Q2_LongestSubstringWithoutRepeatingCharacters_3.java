package DSA.revision.day4;

import java.util.HashSet;

/*
Question:
Given a string s, find the length of the longest substring
without repeating characters.
Example 1:
Input:
String s = "abcabcbb";
Output:
3

Example 2:
Input:
String s = "bbbbb";
Output:
1

Example 3:
Input:
String s = "pwwkew";
Output:
3
--------------------------------------------------
*/
public class Q2_LongestSubstringWithoutRepeatingCharacters_3 {
    public static int longestSubstring(String s){
        HashSet<Character>set=new HashSet<>();
        int i=0,j=0,max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubstring(s));
        String s1 = "bbbbb";
        System.out.println(s1);

    }

}
