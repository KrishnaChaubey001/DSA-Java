package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
Question:
Given a Queue, reverse all its elements using recursion.
Do not use an auxiliary Stack or another Queue.
Input:
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30};
        int[] arr3 = {7};
Example 1:
Output:
        [5, 4, 3, 2, 1]
Explanation:
        Remove the front element recursively, reverse the remaining Queue,
        and then insert the removed element at the rear.
Example 2:
Output:
        [30, 20, 10]
Explanation:
        Recursion reverses the Queue by placing each removed element at the rear
        while returning from the recursive calls.
Example 3:
Output:
        [7]
Explanation:
        A Queue with one element remains unchanged.
--------------------------------------------------
*/
public class Q188_ReverseQueueUsingRecursion {
    public static void reverseQueue(Queue<Integer> q){
        if(q.isEmpty())return;
        int val=q.poll();
        reverseQueue(q);
        q.offer(val);

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
