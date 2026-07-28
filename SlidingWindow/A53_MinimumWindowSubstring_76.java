package DSA.SlidingWindow;

import java.util.HashMap;

/*
Question:
Given two strings s and t, return the minimum window substring of s such that every character in t is included in the window.
Example 1:
Input:
String s = "ADOBECODEBANC";
String t = "ABC";
Output:
BANC
Example 2:
Input:
String s = "a";
String t = "a";
Output:
a
Example 3:
Input:
String s = "a";
String t = "aa";
Output:
""
 */
public class A53_MinimumWindowSubstring_76 {
    public static String bruteForce(String s,String t){
        int minlen=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String window=s.substring(i,j+1);
                if (containsAll(window, t)) {

                    if(window.length()<minlen){
                        minlen=window.length();
                        ans=window;
                    }
                }
            }
        }
        return ans;
    }
    public static boolean containsAll(String s,String t){
        if(t.length()>s.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                continue;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0) map.remove(ch);
        }
        return map.isEmpty();
    }
    public static String optimalSolution(String s,String t){
        if(t.length()>s.length()) return " ";
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        int i=0,j=0,start=-1,count=map.size(),minlen=Integer.MAX_VALUE;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0) count--;
            }
            while(count==0){
                int windowlen=j-i+1;
                if(windowlen<minlen){
                    minlen=windowlen;
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
        return (minlen==Integer.MAX_VALUE)? " ":s.substring(start,start+minlen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(bruteForce(s,t));
        System.out.println(optimalSolution(s,t));
        String s1 = "a";
        String t1 = "a";
        System.out.println(bruteForce(s1,t1));
        System.out.println(optimalSolution(s1,t1));

        String s2 = "a";
        String t2 = "aa";
        System.out.println(bruteForce(s2,t2));
        System.out.println(optimalSolution(s2,t2));

    }
}
