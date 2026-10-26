package DSA.Queue;
/*
Question:
Design a Circular Queue with a fixed size k.

Implement the following operations:
1. enQueue(value) — Insert an element into the Circular Queue.
2. deQueue() — Delete an element from the Circular Queue.
3. Front() — Get the front item.
4. Rear() — Get the last item.
5. isEmpty() — Check whether the Queue is empty.
6. isFull() — Check whether the Queue is full.

Input:
        k = 3
        enQueue(1);
        enQueue(2);
        enQueue(3);
        enQueue(4);
        Rear();
        isFull();
        deQueue();
        enQueue(4);
        Rear();

Example 1:
Output:
        false
        true
        4
Explanation:
        The Queue initially contains [1, 2, 3].
        4 cannot be inserted because the Queue is full.
        After removing 1, the circular Queue reuses its position to insert 4.

Example 2:
Input:
        k = 3
        enQueue(10);
        enQueue(20);
        deQueue();
        Front();
        Rear();

Output:
        20
        20
Explanation:
        10 is removed, leaving 20 as both the front and rear element.

Example 3:
Input:
        k = 2
        deQueue();
        Front();
        Rear();

Output:
        -1
        -1
Explanation:
        The Queue is empty, so Front and Rear return -1.
--------------------------------------------------
*/
public class Q180_DesignCircularQueue_622 {
    static class MyCircularQueue {
        private int arr[];
        private int front;
        private int rear;
        private int size;

        public MyCircularQueue(int k) {
            arr = new int[k];
            front = 0;
            rear = -1;
            size = 0;

        }

        public boolean enQueue(int value) {
            if(isFull()){
                return false;
            }
            rear=(rear+1)%arr.length;
            arr[rear]=value;
            size++;
            return true;

        }

        public boolean deQueue() {
            if(isEmpty()){
                return false;
            }
            front =(front+1)%arr.length;
            size--;
            return true;

        }

        public int Front() {
            if(isEmpty()){
                return -1;
            }
            return arr[front];

        }

        public int Rear() {
            if(isEmpty()){
                return -1;
            }
            return arr[rear];

        }

        public boolean isEmpty() {
            return size==0;


        }

        public boolean isFull() {
            return size==arr.length;

        }
    }

    public static void main(String[] args) {

    }
}
