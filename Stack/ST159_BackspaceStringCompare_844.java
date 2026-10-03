package DSA.Stack;
/*
Question:
Given two strings containing lowercase English letters and the '#' character,
where '#' represents a backspace, determine whether the two strings are equal
after applying all backspaces.

Input:
        String str1 = "ab#c";
        String str2 = "ad#c";
        String str3 = "ab##";
        String str4 = "c#d#";
        String str5 = "a##c";
Example 1:
Output:
        true
Explanation:
        "ab#c" becomes "ac" and "ad#c" also becomes "ac".
Example 2:
Output:
        true
Explanation:
        "ab##" becomes an empty string and "c#d#" also becomes an empty string.
Example 3:
Output:
        false
Explanation:
        "a##c" becomes "c", while "ab#c" becomes "ac".
        Therefore, the resulting strings are different.
--------------------------------------------------
*/
public class ST159_BackspaceStringCompare_844 {
    private static  String createString(String s){
    StringBuilder sb=new StringBuilder();
    for(char ch:s.toCharArray()){
        if(sb.length()>0 && ch=='#'){
            sb.deleteCharAt(sb.length()-1);
        }
        if(ch!='#'){
            sb.append(ch);
        }
    }
    return sb.toString();
}
    public static boolean backspaceCompare(String s, String t) {
        String str1=createString(s);
        String str2=createString(t);
        return str1.equals(str2);


    }

    public static void main(String[] args) {
        ST159_BackspaceStringCompare_844 t=new ST159_BackspaceStringCompare_844();
        String str1 = "ab#c";
        String str2 = "ad#c";
        System.out.println(backspaceCompare(str1,str2));

    }
}
