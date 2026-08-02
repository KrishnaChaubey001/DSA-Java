package DSA.revision.day2;

import java.util.HashMap;

/*
Question:
Given two strings s and t, return the minimum window substring
of s such that every character in t is included in the window.

If there is no such substring, return "".

Example 1:
Input:
String s = "ADOBECODEBANC";
String t = "ABC";

Output:
"BANC"

Example 2:
Input:
String s = "a";
String t = "a";

Output:
"a"

Example 3:
Input:
String s = "a";
String t = "aa";

Output:
""
*/
public class q8 {
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=map.size();
        int start=-1,len=Integer.MAX_VALUE; int i=0,j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0) count--;
            }
            while(count==0){
                if(j-i+1<len){
                    len=j-i+1;
                    start=i;
                }
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i))==1) count++;

                }
                i++;
            }
            j++;
        }
        return (len==Integer.MAX_VALUE)?"":s.substring(start,start+len);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
