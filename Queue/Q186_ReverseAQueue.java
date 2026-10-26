package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/*
Question:
Given a Queue, reverse all of its elements.
You may use an auxiliary Stack to reverse the Queue.
Input:
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {7};
Example 1:
Output:
        [5, 4, 3, 2, 1]
Explanation:
        All elements of the Queue are reversed.
Example 2:
Output:
        [30, 20, 10]
Explanation:
        The original front element becomes the rear after reversal.
Example 3:
Output:
        [7]
Explanation:
        A Queue containing one element remains unchanged.
--------------------------------------------------
*/
public class Q186_ReverseAQueue {
    public static void reverseQueue(Queue<Integer> q) {
        Deque<Integer> st=new ArrayDeque<>();
        // code here
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        reverseQueue(q1);
        System.out.println((q1));

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(10);
        q2.add(20);
        q2.add(30);
        q2.add(40);
        q2.add(50);
        reverseQueue(q2);
        System.out.println((q2));

        Queue<Integer> q3 = new ArrayDeque<>();
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);
        reverseQueue(q3);
        System.out.println((q3));
    }
}
