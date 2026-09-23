package DSA.LinkedList.DoublyLinkedList;

import static DSA.LinkedList.DoublyLinkedList.LL141_CreateDoublyLinkedList.*;
/*
Question:
Given the head of a Doubly Linked List, traverse and print all elements in both forward and backward directions.
Input:
        int[] arr = {10, 20, 30, 40, 50};
Example 1:
Output:
        Forward: 10 20 30 40 50
        Backward: 50 40 30 20 10
Explanation:
        Traverse from head using next to print the list forward.
        Reach the tail, then traverse backward using prev.
Example 2:
Input:
        int[] arr = {7};
Output:
        Forward: 7
        Backward: 7
Explanation:
        With one node, both forward and backward traversal contain the same element.
Example 3:
Input:
        int[] arr = {};
Output:
        Forward: Empty
        Backward: Empty
Explanation:
        There are no nodes to traverse.
--------------------------------------------------
*/


public class LL142_TraverseDoublyLinkedList {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head=createDoublyLinkedList(arr);
        displayForward(head);
        displayBackward(head);
        int[] arr1 = {7};
        Node head1=createDoublyLinkedList(arr1);
        displayForward(head1);
        displayBackward(head1);
        int[] arr2 = {};
        Node head2=createDoublyLinkedList(arr2);
        displayForward(head2);
        displayBackward(head2);

    }

}
