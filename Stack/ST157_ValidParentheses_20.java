package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Question:
Given a string containing only the characters '(', ')', '{', '}', '[' and ']',
determine whether the input string contains valid parentheses.

A string is valid if:
1. Every opening bracket has a corresponding closing bracket.
2. Brackets are closed in the correct order.
3. Every closing bracket has a matching opening bracket.

Input:
        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "([)]";
Example 1:
Output:
        true
Explanation:
        Each opening bracket has the correct corresponding closing bracket.
Example 2:
Output:
        true
Explanation:
        All three types of brackets are correctly matched and nested.
Example 3:
Output:
        false
Explanation:
        The brackets are not closed in the correct order.
--------------------------------------------------
*/
public class ST157_ValidParentheses_20 {
    public static boolean isValid(String s) {
        Deque<Character>st=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'|| ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                char top=st.peek();
                if(ch==')'&&top!='(') return false;
                if(ch==']'&&top!='[') return false;
                if(ch=='}'&&top!='{') return false;
                st.pop();

            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        ST157_ValidParentheses_20 t=new ST157_ValidParentheses_20();

        String str1 = "()";
        System.out.println(isValid(str1));
        String str2 = "()[]{}";
        System.out.println(isValid(str2));

        String str3 = "([)]";
        System.out.println(isValid(str3));

    }

}
