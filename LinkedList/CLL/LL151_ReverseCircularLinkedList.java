package DSA.LinkedList.CLL;
import static DSA.LinkedList.CLL.CircularLinkedList.*;

/*
Question:
Given a Circular Linked List, reverse the list while maintaining its circular structure.
After reversal, the original head should become the tail, and the original tail should become the new head.
Input:
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {10};
Example 1:
Output:
        50 40 30 20 10
Explanation:
        Reverse all links and make the original tail the new head.
        The last node must still point back to the new head.
Example 2:
Output:
        3 2 1
Explanation:
        The circular structure is maintained after reversing all links.
Example 3:
Output:
        10
Explanation:
        A single-node circular linked list remains unchanged because the node points to itself.
--------------------------------------------------
*/
public class LL151_ReverseCircularLinkedList {
    Node reverse(Node head){
        if(head==null || head.next==head){
            return head;
        }
        Node current=head;
        Node prev=null;
        do {
            Node front =current.next;
            current.next=prev;
            prev=current;
            current=front;
        }while (current!=head);
        head.next=prev;
        return prev;
    }

    public static void main(String[] args) {
        LL151_ReverseCircularLinkedList ll=new LL151_ReverseCircularLinkedList();
        int[] arr1 = {10, 20, 30, 40, 50};
        Node head1=creationCLL(arr1);
        Node result1=ll.reverse(head1);
        dispalyCLL(result1);
    }
}
