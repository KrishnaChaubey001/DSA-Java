package DSA.Queue;
/*
Question:
Implement a Queue using a Singly Linked List.
Support the following operations:
1. enqueue(x)
2. dequeue()
3. front()
4. rear()
5. isEmpty()
The Queue must follow FIFO (First In, First Out).
Input:
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        enqueue(40);
        front();
        rear();
Example 1:
Output:
        Dequeued: 10
        Front: 20
        Rear: 40
Explanation:
        10 is removed first because it was inserted first.
        The front points to 20 and the rear points to 40.
Example 2:
Input:
        enqueue(5);
        enqueue(15);
        enqueue(25);
        dequeue();
        dequeue();
Output:
        Dequeued: 5
        Dequeued: 15
        Front: 25
Explanation:
        Queue follows FIFO order.
Example 3:
Input:
        dequeue();
        front();
Output:
        Queue is Empty
Explanation:
        No element can be removed or viewed when the Queue is empty.
--------------------------------------------------
*/
public class Q178_ImplementQueueUsingLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    boolean isEmpty(){
        return head==null;
    }
    void enqueue(int data){
        Node temp=new Node(data);
        if(isEmpty()){
            head=temp;
            tail=temp;
            return;
        }
        tail.next=temp;
        tail=tail.next;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }

        int val=head.data;
        if(head.next==null){
            tail=null;
        }
        head=head.next;
        System.out.println("Dequeue : ");
        return val;
    }
    int front(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        System.out.println("Peek Element is : ");
        return head.data;
    }
    int rear(){
        if(isEmpty()){
            System.out.println("There is no data");
            return -1;
        }
        System.out.println("Last element is : ");

        return tail.data;
    }
    void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Q178_ImplementQueueUsingLinkedList q=new Q178_ImplementQueueUsingLinkedList();
        System.out.println(q.isEmpty());
        q.enqueue(1);
        System.out.println(q.dequeue());
        System.out.println(q.rear());
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        System.out.println(q.dequeue());
        q.enqueue(4);
        System.out.println(q.isEmpty());
        q.display();
        System.out.println(q.front());
        System.out.println(q.rear());
    }
}
