package DSA.LinkedList.DoublyLinkedList;


import static DSA.LinkedList.DoublyLinkedList.LL141_CreateDoublyLinkedList.*;

/*
Question:
Given a Doubly Linked List, delete a node from the beginning, the end, and a given position.
For every deletion, correctly update both next and prev pointers.
Input:
       int[] arr1 = {10, 20, 30, 40, 50};
       int position1 = 1;
       int[] arr2 = {10, 20, 30, 40, 50};
       int position2 = 5;
       int[] arr3 = {10, 20, 30, 40, 50};
       int position3 = 3;
Example 1:
Output:
       20 30 40 50
Explanation:
       Delete the first node and make the second node the new head.
       The new head's prev must be null.
Example 2:
Output:
       10 20 30 40
Explanation:
       Delete the last node and make the previous node the new tail.
       The new tail's next must be null.
Example 3:
Output:
       10 20 40 50
Explanation:
       Delete the node at position 3 and correctly connect its previous and next nodes.
--------------------------------------------------
*/
public class LL144_DeleteFromDoublyLinkedList {
    public static Node  deleteAtHead(Node head){
        if(head==null || head.next==null ) return null;
        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;
        return head;
    }
    public static Node deleteAtEnd(Node head){
        if(head==null || head.next==null) return null;
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node prev=tail;
        tail=tail.back;
        tail.next=null;
        prev.back=null;
        return head;
    }

    public static Node deleteAtPosition(Node head,int k){
        if(head==null || k<=0 ) return head;
            Node current=head;
            for(int i=1;i<k && current!=null;i++){
                current=current.next;

            }
            if(current==null) return head;
            if(current.back==null) {
                return deleteAtHead(head);
            }
            if(current.next==null) {
                current.back.next=null;
                current.back=null;
                return head;
           }
//            Node prev=current.back;
//            Node front=current.next;
            current.back.next=current.next;
            current.next.back=current.back;
            current.next=null;
            current.back=null;

        return head;
    }
    public static void main(String[] args) {
        System.out.println("---- Delete At Head ----");

        int[] arr1 = {10, 20, 30, 40, 50};
        Node head = createDoublyLinkedList(arr1);
        Node deletedHead = deleteAtHead(head);
        displayForward(deletedHead);
        displayBackward(deletedHead);

        System.out.println("---- Delete At End ----");

        int[] arr = {10, 20, 30, 40, 50};
        Node head1 = createDoublyLinkedList(arr);
        Node deletedEnd = deleteAtEnd(head1);
        displayForward(deletedEnd);
        displayBackward(deletedEnd);

        System.out.println("---- Delete At Position ----");

        int[] arr2 = {10, 20, 30, 40, 50};
        int position = 3;
        Node head2 = createDoublyLinkedList(arr2);
        Node deletedNode = deleteAtPosition(head2, position);
        displayForward(deletedNode);
        displayBackward(deletedNode);
    }
}
