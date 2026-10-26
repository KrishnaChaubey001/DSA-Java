package DSA.Queue;
/*
Question:
Implement a Deque using an array.

The Deque must support:
1. insertFront(x)
2. insertRear(x)
3. deleteFront()
4. deleteRear()
5. getFront()
6. getRear()
7. isEmpty()
8. isFull()

Use circular indexing so that empty spaces created by deletion can be reused.

Input:
        Deque capacity = 5
        insertRear(10);
        insertRear(20);
        insertFront(5);
        deleteRear();
        insertFront(1);
        getFront();
        getRear();

Example 1:
Output:
        Deleted from Rear: 20
        Front: 1
        Rear: 10
Explanation:
        The Deque supports insertion and deletion from both ends.

Example 2:
Input:
        Deque capacity = 3
        insertRear(10);
        insertRear(20);
        insertFront(5);
        insertRear(30);

Output:
        Deque is Full
Explanation:
        The Deque has reached its maximum capacity.

Example 3:
Input:
        Deque capacity = 3
        deleteFront();
        deleteRear();

Output:
        Deque is Empty
Explanation:
        No element can be deleted from an empty Deque.
--------------------------------------------------
*/
public class Q190_ImplementDequeUsingArray {
}
