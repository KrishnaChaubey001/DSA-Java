package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Question:
Given a string, reverse it using a Stack.
Push each character of the string into the Stack and then remove characters one by one to construct the reversed string.
Input:
        String str1 = "hello";
        String str2 = "Java";
        String str3 = "abcd";
Example 1:
Output:
        olleh
Explanation:
        Characters are pushed into the Stack in the order h, e, l, l, o.
        Since Stack follows LIFO, they are removed in reverse order.
Example 2:
Output:
        avaJ
Explanation:
        The characters are removed from the Stack from the last character to the first.
Example 3:
Output:
        dcba
Explanation:
        The Stack reverses the order of all characters.
--------------------------------------------------
*/
public class ST156_ReverseStringUsingStack {
    StringBuilder reverse(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(Character ch:s.toCharArray()){
            stack.push(ch);
        }
        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result;

    }

    public static void main(String[] args) {
        ST156_ReverseStringUsingStack st=new ST156_ReverseStringUsingStack();
        StringBuilder result=st.reverse("Hello");
        System.out.println(result);
    }

}
