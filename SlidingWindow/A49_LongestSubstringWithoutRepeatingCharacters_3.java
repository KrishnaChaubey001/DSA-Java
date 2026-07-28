package DSA.SlidingWindow;

import java.util.HashSet;

/*
Sliding Window + HashSet
Question:
Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input:
String s = "abcabcbb";
Output:
3
Explanation:
"abc" is the longest substring.
Example 2:
Input:
String s = "bbbbb";
Output:
1
Explanation:
"b"
Example 3:
Input:
String s = "pwwkew";
Output:
3
Explanation:
"wke"
 */
public class A49_LongestSubstringWithoutRepeatingCharacters_3 {
    public static int longestSubstring(String s){
        HashSet<Character>set=new HashSet<>();
        if (s == null || s.length() == 0) {
            return 0;
        }
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
        System.out.println(longestSubstring(s1));

    }

}
