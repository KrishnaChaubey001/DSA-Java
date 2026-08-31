package DSA.LinkedList;
/*
Question:
Given a node in a singly linked list that is not the last node, delete that node without access to the head of the linked list.
Input:
        4 -> 5 -> 1 -> 9 -> null
        node = 5;
        4 -> 5 -> 1 -> 9 -> null
        node1 = 1;
        1 -> 2 -> 3 -> 4 -> null
        node2 = 3;
Example 1:
Output:
4 -> 1 -> 9 -> null
Explanation:
Copy the value of the next node into the given node and remove the next node.
Example 2:
Output:
4 -> 5 -> 9 -> null
Explanation:
The node with value 1 is deleted without using the head.
Example 3:
Output:
1 -> 2 -> 4 -> null
Explanation:
The value from the next node is copied and the next node is skipped.
--------------------------------------------------
*/
public class LL131_DeleteNodeInALinkedList_237 {
}
