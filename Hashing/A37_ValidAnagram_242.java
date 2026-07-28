package DSA.Hashing;

import java.util.HashMap;

/*
Question:
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input:
String s = "anagram";
String t = "nagaram";
Output:
true
Example 2:
Input:
String s = "rat";
String t = "car";
Output:
false
Example 3:
Input:
String s = "listen";
String t = "silent";
Output:
true
 */
public class A37_ValidAnagram_242 {
    public static boolean validAnagram(String s,String t){
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)) return false;
            if(map.get(ch)>0){
                map.put(ch,map.get(ch)-1);
            }
            if(map.get(ch)==0){
                map.remove(ch);
            }

        }
        return map.isEmpty();

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram(s,t));
        String s1 = "rat";
        String t1 = "car";
        System.out.println(validAnagram(s1,t1));
        String s2 = "aa";
        String t2 = "a";
        System.out.println(validAnagram(s2,t2));

    }
}
