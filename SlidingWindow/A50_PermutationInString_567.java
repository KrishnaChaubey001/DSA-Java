package DSA.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

/*
Question:
Given two strings s1 and s2, return true if s2 contains a permutation of s1.
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
 */
public class A50_PermutationInString_567 {
    public static  boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            char ch= s2.charAt(i);
            if(!map.containsKey(ch)) return false;
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0) map.remove(ch);

        }
        return map.isEmpty();
    }
    public static boolean BruteForcePermutation(String s1,String s2) {
        int k = s1.length();
        for (int i = 0; i <= s2.length() - k; i++) {
            String window = s2.substring(i, i + k);
            if (anagram(window, s1)) return true;
        }
        return false;
    }
    public static boolean HashSolutionIsPermutation(String s1,String s2){
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0,j=0,count=map.size();
        while(j<s2.length()){
            char ch=s2.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0) count--;
            }
            if(j-i+1<s1.length()) j++;
            else if(j-i+1==s1.length()){
                if(count==0) return true;
                char left=s2.charAt(i);
                if(map.containsKey(left)){
                    map.put(left,map.get(left)+1);
                    if(map.get(left)==1) count++;
                }
                i++;
                j++;
            }
        }
        return false;


    }
    public static boolean freqIsPermutation(String s1,String s2){
        if(s1.length()>s2.length()) return false;
        int k=s1.length();
        int freq1[]=new int[26];
        int freq2[]=new int[26];

        for(int i=0; i<k;i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) return true;
        for(int i=k;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-k)-'a']--;
            if(Arrays.equals(freq1,freq2)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(BruteForcePermutation(s1,s2));
        System.out.println(freqIsPermutation(s1,s2));
        System.out.println(HashSolutionIsPermutation(s1,s2));
        String s11 = "ab";
        String s21 = "eidboaoo";
        System.out.println(BruteForcePermutation(s11,s21));
        System.out.println(freqIsPermutation(s11,s21));
        System.out.println(HashSolutionIsPermutation(s11,s21));


    }

}
