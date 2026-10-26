package DSA.Queue;

import java.util.Arrays;

/*
Question:
Implement a Queue using an array.
Support the following operations:
1. enqueue(x)
2. dequeue()
3. front()
4. top()
5. isEmpty()
6. isFull()
Handle both overflow and underflow conditions.
The Queue must follow FIFO (First In, First Out).
Input:
        Queue capacity = 5
        enqueue(10);
        enqueue(20);
        enqueue(30);
        dequeue();
        enqueue(40);
        front();
        top();
Example 1:
Output:
        Dequeued: 10
        Front: 20
        top: 40
Explanation:
        10 was inserted first, so it is removed first.
        After inserting 40, it becomes the top element.
Example 2:
Input:
        Queue capacity = 3
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
Output:
        Queue Overflow
Explanation:
        The Queue has reached its maximum capacity of 3.
Example 3:
Input:
        Queue capacity = 3
        dequeue();
Output:
        Queue Underflow
Explanation:
        The Queue is empty, so no element can be removed.
--------------------------------------------------
*/
public class Q177_ImplementQueueUsingArray {
    private int [] arr;
    
    int top;
    
    Q177_ImplementQueueUsingArray(int size){
        arr=new int[size];
        top=-1;
    }
    boolean isfull(){
        return top == arr.length-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void enqueue(int val){

        if(isfull()){
            System.out.println("Queue Overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    int  dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow ");
            return -1;
        }
        int val=arr[0];
        for(int i=0;i<top;i++){
            arr[i]=arr[i+1];
        }
        top--;
        System.out.println();
        System.out.print("Dequeue: ");
        return val;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        System.out.println();
        System.out.print("Peek: ");
        return arr[0];
    }
     int top(){
         System.out.println("Last Element");
        return arr[top];
     }
    void display(){
        int i=0;
        while(i<top+1){
            System.out.print(arr[i]+" ");
            i++;

        }
    }

    public static void main(String[] args) {
        Q177_ImplementQueueUsingArray q=new Q177_ImplementQueueUsingArray(6);
        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.display();
        System.out.println(q.top());
        System.out.println(q.dequeue());
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println(q.isfull());
        q.display();
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        q.enqueue(6);
        System.out.println(q.peek());
        q.display();
    }

}
