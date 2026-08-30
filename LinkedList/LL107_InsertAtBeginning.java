package DSA.LinkedList;
/*
Question:
Given the head of a singly linked list and an integer value, insert a new node at the beginning of the linked list
 and return the new head.
Input:
        1 -> 2 -> 3 -> null
        int value = 0;
        10 -> 20 -> null
        int value1 = 5;
        null
        int value2 = 7;
Example 1:
Output:
0 -> 1 -> 2 -> 3 -> null
Explanation:
The new node is connected to the current head and becomes the new head.
Example 2:
Output:
5 -> 10 -> 20 -> null
Explanation:
The value 5 is inserted at the beginning.
Example 3:
Output:
7 -> null
Explanation:
A new node becomes the first node of an empty linked list.
--------------------------------------------------
*/
public class LL107_InsertAtBeginning {
    class Node{
        int data;
        Node next;

        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    Node insertAtHead(int data){
        Node current =new Node(data);
        if(head==null){
            tail=current;
        }else{
            current.next=head;
        }
        head=current;
        return head;
    }
    void display(){
        Node current =head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        LL107_InsertAtBeginning ll = new LL107_InsertAtBeginning();
        Node first=ll.new Node(10);

        ll.head=first;
        ll.tail=first;
        ll.insertAtHead(3);
        ll.insertAtHead(2);
        ll.insertAtHead(1);

        ll.display();
        ll.insertAtHead(0);
        ll.display();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
    }
}
