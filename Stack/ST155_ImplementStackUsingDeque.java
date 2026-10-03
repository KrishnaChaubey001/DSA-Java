package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
Question:
Implement a Stack using Java's Deque interface.
Use the Deque operations to perform:
1. push(x)
2. pop()
3. peek()
4. isEmpty()
The implementation must follow the LIFO (Last In, First Out) principle.
Input:
        push(10);
        push(20);
        push(30);
        peek();
        pop();
        peek();
Example 1:
Output:
        Top: 30
        Popped: 30
        Top: 20
Explanation:
        The most recently inserted element is always at the top.
Example 2:
Input:
        push(5);
        push(10);
        push(15);
        pop();
        pop();
Output:
        Remaining Stack: 5
Explanation:
        15 and 10 are removed first because Stack follows LIFO.
Example 3:
Input:
        pop();
        peek();
Output:
        Stack is Empty
Explanation:
        The stack contains no elements, so pop and peek cannot return an element.
--------------------------------------------------
*/
public class ST155_ImplementStackUsingDeque {
    Deque<Integer> stack=new ArrayDeque<>();
    void push(int val){
        stack.push(val);
    }
    int pop(){
        if(stack.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.pop();
    }
    int peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;

        }
        return stack.peek();
    }
    boolean isEmpty(){
        return stack.isEmpty();
    }
    void display(){
        System.out.print("Stack : ");
        System.out.println(Arrays.toString(stack.toArray()));
    }

    public static void main(String[] args) {
        ST155_ImplementStackUsingDeque st= new ST155_ImplementStackUsingDeque();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        System.out.println("Popped: " + st.pop());
        System.out.println("Top: " + st.peek());

        st.display();

        System.out.println("Is Empty: " + st.isEmpty());

    }
}
