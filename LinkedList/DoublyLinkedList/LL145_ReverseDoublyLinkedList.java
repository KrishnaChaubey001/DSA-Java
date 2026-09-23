package DSA.LinkedList.DoublyLinkedList;

import static DSA.LinkedList.DoublyLinkedList.LL141_CreateDoublyLinkedList.*;
/*
Question:
Given a Doubly Linked List, reverse the list by correctly swapping the next and prev pointers of every node.
Input:
        int[] arr1 = {10, 20, 30, 40, 50};
Example 1:
Output:
        50 40 30 20 10
Explanation:
        Reverse the Doubly Linked List by swapping the next and prev pointers of each node.
        The last node becomes the new head.
Example 2:
Input:
        int[] arr2 = {1, 2, 3};
Output:
        3 2 1
Explanation:
        After reversal, the original tail becomes the head and all links are reversed.
Example 3:
Input:
        int[] arr3 = {10};
Output:
        10
Explanation:
        A single-node Doubly Linked List remains unchanged after reversal.
--------------------------------------------------
*/
public class LL145_ReverseDoublyLinkedList {
    public static Node reverse(Node head){
        Node current=head;
        Node prev=null;
        while(current!=null){
            Node front=current.next;
            current.next=prev;
            current.back=front;
            prev=current;
            current=front;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head = createDoublyLinkedList(arr);
        Node result = reverse(head);
        displayForward(result);
        displayBackward(result);
    }
}
