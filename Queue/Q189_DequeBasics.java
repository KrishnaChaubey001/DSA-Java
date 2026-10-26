package DSA.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Question:
Implement the basic operations of a Deque (Double-Ended Queue).

A Deque allows insertion and deletion from both the front and the rear.

Implement the following operations:
1. addFront(x)
2. addRear(x)
3. removeFront()
4. removeRear()
5. getFront()
6. getRear()
7. isEmpty()

Input:
        addRear(10);
        addRear(20);
        addFront(5);
        removeRear();
        getFront();
        getRear();

Example 1:
Output:
        Removed from Rear: 20
        Front: 5
        Rear: 10
Explanation:
        5 was inserted at the front, while 10 was inserted at the rear.
        20 was then removed from the rear.

Example 2:
Input:
        addFront(10);
        addFront(20);
        addRear(30);
        removeFront();
        getFront();

Output:
        Removed from Front: 20
        Front: 10
Explanation:
        Elements can be inserted and removed from both ends of a Deque.

Example 3:
Input:
        removeFront();
        removeRear();

Output:
        Deque is Empty
Explanation:
        No element can be removed from an empty Deque.
--------------------------------------------------
*/
public class Q189_DequeBasics {
    Deque<Integer>dq=new ArrayDeque<>();
    boolean isEmpty(){
        return dq.isEmpty();
    }
    void addFront(int x){
        dq.offerFirst(x);
    }
    void addRear(int x){
        dq.offerLast(x);
    }
    void removeFront(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return ;
        }
        System.out.println("Remove from front : "+dq.peekFirst());
        dq.pollFirst();
    }
    void removeRear(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return ;
        }
        System.out.println("Remove from Last : "+dq.peekLast());
        dq.pollLast();

    }
    void getFront(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return ;
        }
        System.out.println("Front : "+dq.peekFirst());
    }
    void getRear(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return ;
        }
        System.out.println("Front : "+dq.peekLast());
    }

    public static void main(String[] args) {
        Q189_DequeBasics q=new Q189_DequeBasics();
        q.addRear(10);
        q.addRear(20);
        q.addFront(5);
        q.removeRear();
        q.getFront();
        q.getRear();

        Q189_DequeBasics p=new Q189_DequeBasics();

        p.addFront(10);
        p.addFront(20);
       p. addRear(30);
        p.removeFront();
        p.getFront();


    }

}
