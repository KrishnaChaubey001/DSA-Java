package DSA.LinkedList.CLL;
import static DSA.LinkedList.CLL.CircularLinkedList.*;
/*
Question:
Given the head of a Circular Linked List, traverse and print all nodes exactly once.
Do not use null as the stopping condition because the last node points back to the head.
Input:
        int[] arr = {10, 20, 30, 40, 50};
Example 1:
Output:
        10 20 30 40 50
Explanation:
        Start from the head and keep moving through next until you reach the head again.
Example 2:
Input:
        int[] arr = {7};
Output:
        7
Explanation:
        The only node points back to itself, so it should be printed exactly once.
Example 3:
Input:
        int[] arr = {};
Output:
        Empty
Explanation:
        There are no nodes to traverse.
--------------------------------------------------
*/
public class LL147_TraverseCircularLinkedList {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head=creationCLL(arr);
        dispalyCLL(head);
        int[] arr1 = {7};
        Node head1=creationCLL(arr1);
        dispalyCLL(head1);
        int[] arr2 = {};

        Node head2=creationCLL(arr2);
        dispalyCLL(head2);


    }
}
