package DSA.Queue;
/*
Question:
Implement a Circular Queue using an array.
Support the following operations:
1. enqueue(x)
2. dequeue()
3. front()
4. rear()
5. isEmpty()
6. isFull()
Reuse the empty spaces created after dequeue operations by using circular indexing.
Input:
        Queue capacity = 5
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        dequeue();
        dequeue();
        enqueue(50);
        enqueue(60);
        front();
        rear();
Example 1:
Output:
        Dequeued: 10
        Dequeued: 20
        Front: 30
        Rear: 60
Explanation:
        After removing 10 and 20, their positions become available.
        The circular Queue reuses these positions for 50 and 60.
Example 2:
Input:
        Queue capacity = 3
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
Output:
        Queue is Full
Explanation:
        All three positions are occupied, so another element cannot be inserted.
Example 3:
Input:
        Queue capacity = 3
        dequeue();
Output:
        Queue is Empty
Explanation:
        No element can be removed from an empty Circular Queue.
--------------------------------------------------
*/
public class Q179_ImplementCircularQueueUsingArray {
    int arr[];
    int front;
    int rear;
    int size;
    Q179_ImplementCircularQueueUsingArray(int capacity){
        arr=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    boolean isfull(){
        return size== arr.length;
    }
    boolean isEmpty(){
        return size==0;
    }
    void enqueue(int val){
        if(isfull()){
            System.out.println("Queue Overflow");
            return;
        }
        rear=(rear+1)% arr.length;
        arr[rear]=val;
        size++;
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        int val=arr[front];
        front=(front+1)%arr.length;
        size--;
        System.out.println("Dequeue : ");
        return val;
    }
    int front(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    int rear(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[rear];
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[(front+i)% arr.length]+ " ");
        }
    }

    public static void main(String[] args) {
        Q179_ImplementCircularQueueUsingArray q=new Q179_ImplementCircularQueueUsingArray(6);
    }
}
