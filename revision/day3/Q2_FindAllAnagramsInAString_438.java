package DSA.revision.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Question:
Given two strings s and p, return all starting indices of p's anagrams in s.

Example 1:
Input:
String s = "cbaebabacd";
String p = "abc";

Output:
[0,6]

Explanation:
The substrings "cba" and "bac" are anagrams of "abc".

Example 2:
Input:
String s = "abab";
String p = "ab";

Output:
[0,1,2]
--------------------------------------------------
*/
public class Q2_FindAllAnagramsInAString_438 {
    public static List<Integer> allAnagrams(String s,String p){
        List<Integer> list=new ArrayList<>();
        if(p.length()>s.length()) return list;

        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;

        }
        if(Arrays.equals( freq1,freq2)) list.add(0);
        for(int i=p.length();i<s.length();i++){
            freq2[s.charAt(i)-'a']++;
            freq2[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(freq2,freq1)) list.add(i-p.length()+1);

        }
        return list;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(allAnagrams(s,p));

        String s1 = "abab";
        String p1 = "ab";
        System.out.println(allAnagrams(s1,p1));

    }

}
