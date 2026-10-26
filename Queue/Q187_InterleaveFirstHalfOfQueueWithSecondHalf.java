package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
Question:
Given a Queue containing an even number of elements, interleave the first half
of the Queue with the second half.

Input:
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {10, 20, 30, 40};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8};
Example 1:
Output:
        [1, 4, 2, 5, 3, 6]
Explanation:
        First half = [1, 2, 3]
        Second half = [4, 5, 6]
        Interleaving them gives [1, 4, 2, 5, 3, 6].
Example 2:
Output:
        [10, 30, 20, 40]
Explanation:
        First half = [10, 20]
        Second half = [30, 40]
        The elements are taken alternately from both halves.
Example 3:
Output:
        [1, 5, 2, 6, 3, 7, 4, 8]
Explanation:
        The first half and second half are interleaved one element at a time.
--------------------------------------------------
*/
public class Q187_InterleaveFirstHalfOfQueueWithSecondHalf {
    public static void rearrangeQueue(Queue<Integer> q) {
        int n = q.size();
        int half = n / 2;
        Queue<Integer>first=new ArrayDeque<>();
        for(int i=0;i<half;i++){
            first.offer(q.poll());
        }
        while(!first.isEmpty()){
            q.offer(first.poll());
            q.offer(q.poll());
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        rearrangeQueue(q1);
        System.out.println((q1));

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(10);
        q2.add(20);
        q2.add(30);
        q2.add(40);

        rearrangeQueue(q2);
        System.out.println((q2));

        Queue<Integer> q3 = new ArrayDeque<>();
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);
        rearrangeQueue(q3);
        System.out.println((q3));

    }
}
