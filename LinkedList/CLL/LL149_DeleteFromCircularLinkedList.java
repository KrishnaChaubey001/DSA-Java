package DSA.LinkedList.CLL;
import static DSA.LinkedList.CLL.CircularLinkedList.*;

/*
Question:
Given a Circular Linked List, delete a node from the beginning, the end, and a given position.
Maintain the circular connection after every deletion.
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
        Delete the first node and make the last node point to the new head.
Example 2:
Output:
        10 20 30 40
Explanation:
        Delete the last node and make the new last node point back to the head.
Example 3:
Output:
        10 20 40 50
Explanation:
        Delete the node at position 3 and connect its previous node to its next node.
--------------------------------------------------
*/
public class LL149_DeleteFromCircularLinkedList {
    Node deleteAtHead(Node head){
        if(head==null || head.next==head) return null;
        Node tail=head;
        while(tail.next!=head){
            tail=tail.next;
        }
        tail.next=head.next;
        head=head.next;
        return head;
    }
    Node deleteAtEnd(Node head){
        if(head==null || head.next==head){
            return null;
        }
        Node tail=head;
        while(tail.next.next!=head){
            tail=tail.next;
        }
        tail.next=tail.next.next;
        return head;
    }
    Node deleteAtPosition(Node head,int k){
        if(k<=0){
            System.out.println("Invalid Position");
            return head;
        }
        if(head==null|| (head.next==head && k==1)){
            return null;
        }
        if(k==1){
            Node tail=head;
            while(tail.next!=head){
                tail=tail.next;
            }
            tail.next=head.next;
            head=head.next;
            return head;
        }
        Node current=head;
        for(int i=1;i<k-1;i++){
            current=current.next;
            if(current.next==head){
                System.out.println("invalid Position");
                return head;
            }
        }
        current.next=current.next.next;
        return head;

    }
    public static void main(String[] args) {
        LL149_DeleteFromCircularLinkedList ll=new LL149_DeleteFromCircularLinkedList();
        System.out.println("...Delete At Begining...");
        int[] arr1 = {10, 20, 30, 40, 50};
        Node head1=creationCLL(arr1);
        Node result1=ll.deleteAtHead(head1);
        dispalyCLL(result1);
        System.out.println("...Delete At End...");
        int[] arr2 = {10, 20, 30, 40, 50};
        Node head2=creationCLL(arr2);
        Node result2=ll.deleteAtEnd(head2);
        dispalyCLL(result2);
        System.out.println("...Delete At Given Position...");
        int[] arr3 = {10, 20, 30, 40, 50};
        int p=3;
        Node head3=creationCLL(arr3);
        Node result3=ll.deleteAtPosition(head3,p);
        dispalyCLL(result3);

    }
}
