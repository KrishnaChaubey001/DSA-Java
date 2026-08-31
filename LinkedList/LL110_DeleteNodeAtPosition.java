package DSA.LinkedList;
/*
Question:
Given the head of a singly linked list and a 0-based position, delete the node at that position and return the updated head.
Input:
        1 -> 2 -> 3 -> 4 -> null
        int position = 2;
        10 -> 20 -> 30 -> null
        int position1 = 0;
        5 -> 6 -> 7 -> null
        int position2 = 2;
Example 1:
Output:
1 -> 2 -> 4 -> null
Explanation:
The node with value 3 at index 2 is deleted.
Example 2:
Output:
20 -> 30 -> null
Explanation:
The first node is deleted, so the head changes.
Example 3:
Output:
5 -> 6 -> null
Explanation:
The last node is deleted.
--------------------------------------------------
*/
public class LL110_DeleteNodeAtPosition {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node deleteAtPosition(int idx){
        if(idx<0|| head==null){
            System.out.println("Invalid Index1");
            return head;
        }
        if(idx==0){
            head=head.next;
            return head;
        }
        Node current=head;
        for(int i=0;i<idx-1 ;i++){
            if(current.next==null){
                System.out.println("Invalid index2");
                return head;
            }
            current=current.next;
        }
        if(current.next==null){
            System.out.println("Invalid index3");
            return head;
        }

        current.next=current.next.next;
        return head;
    }

    public static void main(String[] args) {
        LL110_DeleteNodeAtPosition ll=new LL110_DeleteNodeAtPosition();
        Node first=ll.new Node(1);
        Node second=ll.new Node(2);
        first.next=second;
        ll.head=first;
        ll.deleteAtPosition(0);
        System.out.println(ll.head.data);
    }
}
