package DSA.Stack;

import java.util.ArrayList;
import java.util.Stack;

/*
Question:
Implement the basic operations of a Stack:
1. Push an element onto the stack.
2. Pop the top element.
3. Peek at the top element without removing it.
4. Check whether the stack is empty.
5. Display all elements of the stack.
The stack follows the LIFO (Last In, First Out) principle.
Input:
        push(10);
        push(20);
        push(30);
        pop();
        peek();
Example 1:
Output:
        Stack: 10 20
        Popped: 30
        Top: 20
Explanation:
        30 was inserted last, so it is removed first.
        After removing 30, 20 becomes the top element.
Example 2:
Input:
        push(5);
        push(15);
        peek();
        pop();
        peek();
Output:
        Top: 15
        Popped: 15
        Top: 5
Explanation:
        Stack follows LIFO order.
Example 3:
Input:
        Stack = {}
        pop();
        peek();
Output:
        Stack is Empty
Explanation:
        Pop and peek cannot return an element when the stack is empty.
--------------------------------------------------
*/
public class ST152_StackBasics {
    Stack<Integer>st=new Stack<>();

     void push(int value){
        st.push(value);
    }
    int pop(){
         if(st.isEmpty()){
             System.out.println("Stack is empty");
             return -1;
         }
         return st.pop();
    }
    int peek(){
         if(st.isEmpty()){
             System.out.println("Stack is Empty");
             return -1;
         }
         return st.peek();
    }
    boolean isEmpty(){
         return st.isEmpty();
    }
    void display(){
        if(st.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack:"+st);
        }
    }

    public static void main(String[] args) {
        ST152_StackBasics st=new ST152_StackBasics();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println("Popped: " + st.pop());
        System.out.println("Top: " + st.peek());

        st.display();

        System.out.println("Is Empty: " + st.isEmpty());
    }
}
