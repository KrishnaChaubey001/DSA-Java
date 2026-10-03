package DSA.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

/*
Question:
Implement a Queue using two Stacks.

The Queue must support:
1. push(int x)
2. pop()
3. peek()
4. empty()

The Queue follows FIFO, while a Stack normally follows LIFO.
Use two Stacks to make them behave like a Queue.

Input:
        push(10);
        push(20);
        push(30);
        peek();
        pop();
        peek();

Example 1:
Output:
        Front: 10
        Popped: 10
        Front: 20
Explanation:
        10 was inserted first, so it must be removed first.

Example 2:
Input:
        push(5);
        push(10);
        push(15);
        pop();
        pop();

Output:
        Popped: 5
        Popped: 10
Explanation:
        The Queue follows FIFO order.

Example 3:
Input:
        pop();
        peek();

Output:
        Queue is Empty
Explanation:
        No element can be removed or viewed when the Queue is empty.
--------------------------------------------------
*/
public class ST163_ImplementQueueUsingStacks_232 {
    private Stack<Integer> in;
    private Stack<Integer> out;

    ST163_ImplementQueueUsingStacks_232() {
        in = new Stack<>();
        out = new Stack<>();
    }

    void push(int val) {
        in.push(val);
    }

    int pop() {
        if (in.isEmpty() && out.isEmpty()) {
            return -1;
        }
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }

        }
        int value = out.pop();
        return value;
    }

    boolean isEmpty() {
        return (in.isEmpty() && out.isEmpty());
    }

    int peek() {
        if (in.isEmpty() && out.isEmpty()) {
            return -1;
        }
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.peek();
    }


    public static void main(String[] args) {
        ST163_ImplementQueueUsingStacks_232 t= new ST163_ImplementQueueUsingStacks_232();
        t.push(5);
        t.push(10);
        t.push(15);
        t.pop();
        t.pop();
        t.push(20);
        t.push(25);
        t.push(30);
        System.out.println(t.pop());
        System.out.println(t.peek());
        System.out.println(t.isEmpty());

    }
}

