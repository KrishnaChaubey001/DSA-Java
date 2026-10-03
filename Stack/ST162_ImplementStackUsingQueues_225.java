package DSA.Stack;

import java.util.*;

/*
Question:
Implement a Stack using one or more Queues.

The Stack must support:
1. push(int x)
2. pop()
3. top()
4. empty()

The Stack follows LIFO, while a Queue normally follows FIFO.
Your implementation must make the Queue(s) behave like a Stack.

Input:
        push(10);
        push(20);
        push(30);
        top();
        pop();
        top();

Example 1:
Output:
        Top: 30
        Popped: 30
        Top: 20
Explanation:
        Although a Queue follows FIFO, the implementation must make the most
        recently inserted element available first.

Example 2:
Input:
        push(5);
        push(10);
        pop();
        empty();

Output:
        Popped: 10
        Empty: false
Explanation:
        10 was inserted last, so it must be removed first.

Example 3:
Input:
        pop();
        top();

Output:
        Stack is Empty
Explanation:
        No element can be removed or viewed from an empty Stack.
--------------------------------------------------
*/
public class ST162_ImplementStackUsingQueues_225 {
    class MyStack {
        private Queue<Integer> queue;

        public MyStack() {
            queue = new ArrayDeque<>();
        }

        public void push(int x) {
            int size = queue.size();
            queue.offer(x);
            for (int i = 0; i < size; i++) {
                queue.offer(queue.poll());
            }

        }

        public int pop() {
            return queue.poll();

        }

        public int top() {
            return queue.peek();

        }

        public boolean empty() {
            return queue.isEmpty();

        }
    }

    public static void main(String[] args) {
        ST162_ImplementStackUsingQueues_225 t = new ST162_ImplementStackUsingQueues_225();
        MyStack obj = t.new MyStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());
    }
}
