package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Question:
Given an encoded string, decode it according to the following rule:
k[encoded_string]
means that the encoded_string inside the brackets is repeated k times.

The input is always valid.
Input:
        String str1 = "3[a]2[bc]";
        String str2 = "3[a2[c]]";
        String str3 = "2[abc]3[cd]ef";
Example 1:
Output:
        "aaabcbc"
Explanation:
        3[a] = aaa
        2[bc] = bcbc
        Result = aaabcbc
Example 2:
Output:
        "accaccacc"
Explanation:
        2[c] = cc
        a2[c] = acc
        3[acc] = accaccacc
Example 3:
Output:
        "abcabccdcdcdef"
Explanation:
        2[abc] gives abcabc.
        3[cd] gives cdcdcd.
        Adding ef gives the final result.
--------------------------------------------------
*/
public class ST174_DecodeString_394 {
    public static String decodeString(String s) {
        Deque<Integer> num=new ArrayDeque<>();
        Deque<String> st=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                count=count*10+ch-'0';
            }
            else if(ch=='['){
                num.push(count);
                st.push(sb.toString());
                count=0;
                sb.setLength(0);
            }
            else if(ch==']'){
                int repeat=num.poll();
                String prev=st.pop();
                StringBuilder temp=new StringBuilder(prev);
                for(int i=0;i<repeat;i++){
                    temp.append(sb);
                }
                sb=temp;

            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "3[a]2[bc]";
        String str2 = "3[a2[c]]";
        String str3 = "2[abc]3[cd]ef";
        System.out.println(decodeString(str1));
        System.out.println(decodeString(str2));
        System.out.println(decodeString(str3));

    }
}
