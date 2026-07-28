package DSA.SlidingWindow;

import java.util.HashMap;

/*
Given two strings txt and pat, count the occurrences of anagrams of pat in txt.
Example 1:
Input:
String txt = "forxxorfxdofr";
String pat = "for";
Output:
3
Explanation:
Anagrams:
for
orf
ofr
Example 2:
Input:
String txt = "aabaabaa";
String pat = "aaba";
Output:
4
---
 */
public class A46_CountOccurrencesOfAnagrams {
    public static boolean isAnagram(String s,String t){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0) map.remove(ch);
        }
        return map.isEmpty();
    }

    public static int countOccurenceBruteForce(String txt,String pat){
        int k=pat.length();
        int count=0;
        for(int i=0;i<=txt.length()-k;i++){
            String win=txt.substring(i,i+k);
            if(isAnagram(win,pat)) count++;
        }
        return count;
    }

    // Optimal Solution

    public static int countOccurence(String txt,String pat){
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch: pat.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);
        int count=map.size();
        int i=0,j=0,ans=0,k=pat.length();
        while(j<txt.length()){
            char ch=txt.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);

                if(map.get(ch)==0) count--;

            }
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                if(count==0) ans++;
                char left=txt.charAt(i);
                if(map.containsKey(left)) {
                    map.put(left, map.get(left)+1);
                    if(map.get(left)==1){
                        count++;
                    }
                }
                i++;j++;

            }
        }
        return ans;
    }

    public static void main(String[] args) {

        String txt = "forxxorfxdofr";
        String pat = "for";

        System.out.println(countOccurenceBruteForce(txt,pat));
        System.out.println(countOccurence(txt,pat));
        String txt1 = "aabaabaa";
        String pat1 = "aaba";
        System.out.println(countOccurenceBruteForce(txt1,pat1));
        System.out.println(countOccurence(txt1,pat1));

    }

}
