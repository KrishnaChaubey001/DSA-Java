package DSA.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/*
Question:
Given a string, repeatedly remove adjacent duplicate characters.
Continue removing adjacent duplicates until no such pair remains.
Input:
        String str1 = "abbaca";
        String str2 = "azxxzy";
        String str3 = "aabbcc";
Example 1:
Output:
        ca
Explanation:
        "abbaca" → "aaca" → "ca"
        The adjacent "bb" is removed first, then "aa".
Example 2:
Output:
        ay
Explanation:
        "azxxzy" → "azzy" → "ay"
        The adjacent "xx" and then "zz" are removed.
Example 3:
Output:
        ""
Explanation:
        "aabbcc" → "bbcc" → "cc" → ""
        All characters are eventually removed.
--------------------------------------------------
*/
public class ST158_RemoveAdjacentDuplicates_1047 {
    public String removeDuplicates(String s) {
        StringBuilder st= new StringBuilder();
        for(char ch:s.toCharArray()){
          if(!st.isEmpty() && ch==st.charAt(st.length()-1)){
                st.deleteCharAt(st.length()-1);
            }else{
                st.append(ch);
            }
        }
        return st.toString();



    }

    public static void main(String[] args) {
        ST158_RemoveAdjacentDuplicates_1047 t=new ST158_RemoveAdjacentDuplicates_1047();

        String str1 = "abbaca";
        String s= t.removeDuplicates(str1);
        System.out.println(s);
        String str2 = "azxxzy";
        System.out.println(t.removeDuplicates(str2));
        String str3 = "aabbcc";

        String s1= t.removeDuplicates(str3);
        System.out.println(s1);


    }
}
