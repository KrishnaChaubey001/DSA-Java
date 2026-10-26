package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
Question:
Given a Queue and an integer K, reverse the first K elements of the Queue
while keeping the remaining elements in their original order.
Input:
        int[] arr1 = {1, 2, 3, 4, 5};
        int k1 = 3;
        int[] arr2 = {10, 20, 30, 40, 50};
        int k2 = 2;
        int[] arr3 = {1, 2, 3, 4};
        int k3 = 4;
Example 1:
Output:
        [3, 2, 1, 4, 5]
Explanation:
        The first 3 elements [1, 2, 3] are reversed.
        The remaining elements [4, 5] stay in their original order.
Example 2:
Output:
        [20, 10, 30, 40, 50]
Explanation:
        Only the first 2 elements are reversed.
Example 3:
Output:
        [4, 3, 2, 1]
Explanation:
        Since K equals the size of the Queue, all elements are reversed.
--------------------------------------------------
*/
public class Q185_ReverseFirstKElementsOfQueue {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if(k<=0 || k>q.size()) return q;
        // code here
        Queue<Integer>result=new ArrayDeque<>();
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty() && k>0){
            st.push(q.poll());
            k--;
        }
        while(!st.isEmpty()){
            result.offer(st.pop());
        }
        while (!q.isEmpty()){
            result.offer(q.poll());
        }
        return result;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        System.out.println(reverseFirstK(q1, 3));

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(10);
        q2.add(20);
        q2.add(30);
        q2.add(40);
        q2.add(50);
        System.out.println(reverseFirstK(q2, 2));

        Queue<Integer> q3 = new ArrayDeque<>();
        q3.add(1);
        q3.add(2);
        q3.add(3);
        q3.add(4);
        System.out.println(reverseFirstK(q3, 4));
    }

}
