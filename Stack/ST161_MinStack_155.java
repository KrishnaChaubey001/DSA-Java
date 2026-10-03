package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Question:
Design a Stack that supports the following operations in O(1) time:
1. push(int val)
2. pop()
3. top()
4. getMin()

getMin() should return the minimum element currently present in the Stack.

Input:
        push(5);
        push(3);
        push(7);
        push(2);
        getMin();
        pop();
        getMin();
        top();

Example 1:
Output:
        Minimum: 2
        Minimum after pop: 3
        Top: 7
Explanation:
        2 is the smallest element.
        After removing 2, 3 becomes the minimum.

Example 2:
Input:
        push(-2);
        push(0);
        push(-3);
        getMin();
        pop();
        getMin();

Output:
        Minimum: -3
        Minimum after pop: -2
Explanation:
        The minimum value changes after the current minimum is removed.

Example 3:
Input:
        push(10);
        getMin();
        top();

Output:
        Minimum: 10
        Top: 10
Explanation:
        When only one element exists, it is both the minimum and the top.
--------------------------------------------------
*/
public class ST161_MinStack_155 {
    class MinStack {
        private Deque<Integer> mainStack ;
        private Deque<Integer> minStack;

        public MinStack() {
            mainStack=new ArrayDeque<>();
            minStack=new ArrayDeque<>();

        }

        public void push(int value) {
            mainStack.push(value);
            if(minStack.isEmpty() || value<=minStack.peek()){
                minStack.push(value);
            }

        }

        public void pop() {
            if(mainStack.isEmpty()) return;
            int value=mainStack.pop();
            if(value==minStack.peek()){
                minStack.pop();
            }

        }

        public int top() {
            return mainStack.peek();

        }

        public int getMin() {
            return minStack.peek();

        }
    }

    public static void main(String[] args) {
        ST161_MinStack_155 obj = new ST161_MinStack_155();

        MinStack stack = obj.new MinStack();

        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(2);

        System.out.println("Minimum: " + stack.getMin());

        stack.pop();

        System.out.println("Minimum after pop: " + stack.getMin());
        System.out.println("Top: " + stack.top());

        System.out.println();

        // Example 2
        MinStack stack2 = obj.new MinStack();

        stack2.push(-2);
        stack2.push(0);
        stack2.push(-3);

        System.out.println("Minimum: " + stack2.getMin());

        stack2.pop();

        System.out.println("Minimum after pop: " + stack2.getMin());

        System.out.println();

        // Example 3
        MinStack stack3 = obj.new MinStack();

        stack3.push(10);

        System.out.println("Minimum: " + stack3.getMin());
        System.out.println("Top: " + stack3.top());

    }
}
