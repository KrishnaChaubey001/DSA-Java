package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Question:
Evaluate the value of an arithmetic expression written in Reverse Polish Notation (RPN).

Valid operators are '+', '-', '*', and '/'.
Each operand can be an integer or another expression.
Division between two integers should truncate toward zero.

Input:
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

Example 1:
Output:
        9
Explanation:
        (2 + 1) * 3 = 9

Example 2:
Output:
        6
Explanation:
        13 / 5 = 2
        4 + 2 = 6

Example 3:
Output:
        22
Explanation:
        The expression is evaluated from left to right using a Stack.
        Each operator uses the top two operands from the Stack.
--------------------------------------------------
*/
public class ST160_EvaluateReversePolishNotation_150 {
    public static int reversePolishNotation(String[] tokens){
        Deque<Integer> st=new ArrayDeque<>();
        for(String s:tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b=st.pop();
                int a=st.pop();
                switch (s){
                    case ("+")->st.push(a+b);
                    case ("-")->st.push(a-b);
                    case("*")-> st.push(a*b);
                    case("/")->st.push(a/b);
                }
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        System.out.println(reversePolishNotation(tokens1));
        System.out.println(reversePolishNotation(tokens2));
        System.out.println(reversePolishNotation(tokens3));
    }
}
