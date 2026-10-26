package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Question:
Implement a Queue using two Stacks.
The Queue must support:
1. push(int x)
2. pop()
3. peek()
4. empty()
The Queue follows FIFO (First In, First Out), while a Stack follows LIFO
(Last In, First Out).

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
        Two Stacks are used to reverse the order when required.
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
        The Queue follows FIFO order even though the implementation uses Stacks.
Example 3:
Input:
        pop();
        peek();
Output:
        Queue is Empty
Explanation:
        No element can be removed or viewed from an empty Queue.
--------------------------------------------------
*/
public class Q181_ImplementQueueUsingStacks_232 {
     class MyQueue {
        Deque<Integer> st;
        Deque<Integer> q;

        public MyQueue() {
            st = new ArrayDeque<>();
            q = new ArrayDeque<>();
        }

        public  void push(int x) {
            st.push(x);

        }

        public int pop() {
            if (q.isEmpty()) {
                while (!st.isEmpty()) {
                    q.push(st.pop());
                }
            }
            int val=q.pop();
            return val;
        }

        public int peek() {
            if (q.isEmpty()) {
                while (!st.isEmpty()) {
                    q.push(st.pop());
                }
            }
            return q.peek();

        }

        public boolean isEmpty() {
            return (st.isEmpty() && q.isEmpty() );

        }
    }

    public static void main(String[] args) {
        Q181_ImplementQueueUsingStacks_232 q=new Q181_ImplementQueueUsingStacks_232();
        MyQueue t=q.new MyQueue();
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
