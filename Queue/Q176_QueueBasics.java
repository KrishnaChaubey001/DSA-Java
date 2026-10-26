package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/*
Question:
Implement the basic operations of a Queue:
1. Enqueue an element.
2. Dequeue an element.
3. Get the front element.
4. Get the rear element.
5. Check whether the Queue is empty.
The Queue follows the FIFO (First In, First Out) principle.
Input:
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        front();
        rear();
Example 1:
Output:
        Dequeued: 10
        Front: 20
        Rear: 30
Explanation:
        10 was inserted first, so it is removed first.
        After removing 10, 20 becomes the front and 30 remains the rear.
Example 2:
Input:
        enqueue(5);
        enqueue(15);
        dequeue();
        dequeue();
        front();
Output:
        Dequeued: 5
        Dequeued: 15
        Queue is Empty
Explanation:
        Queue follows FIFO order.
Example 3:
Input:
        dequeue();
        front();
Output:
        Queue is Empty
Explanation:
        No element can be removed or viewed from an empty Queue.
--------------------------------------------------
*/
public class Q176_QueueBasics {
    Queue<Integer>q;

    public Q176_QueueBasics() {
        q = new ArrayDeque<>();
    }
    void enqueue(int val){
        q.offer(val);
    }
    void dequeue(){
        if(q.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int value=q.poll();
        System.out.println("Dequeue: "+value);
    }
    void peek(){
        if(q.isEmpty()){
            System.out.println("There is no element in queue");
            return;
        }
        int val=q.peek();
        System.out.println("Front: "+val);
    }
    void  isEmpty(){
        boolean result=q.isEmpty();
        System.out.println(result);
    }
    void display(){
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.poll();
        }
    }

    public static void main(String[] args) {
        Q176_QueueBasics q=new Q176_QueueBasics();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.peek();
        q.isEmpty();
        q.display();
    }
}
