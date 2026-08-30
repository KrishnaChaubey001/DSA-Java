package DSA.LinkedList;
/*
Question:
Given the head of a singly linked list and an integer value, insert a new node at the end of the linked list.
Input:
        1 -> 2 -> 3 -> null
        int value = 4;
        10 -> 20 -> null
        int value1 = 30;
        5 -> null
        int value2 = 6;
Example 1:
Output:
1 -> 2 -> 3 -> 4 -> null
Explanation:
Traverse to the last node and connect it to the new node.
Example 2:
Output:
10 -> 20 -> 30 -> null
Explanation:
The new node is added after the current last node.
Example 3:
Output:
5 -> 6 -> null
Explanation:
The new node is added after the only existing node.
--------------------------------------------------
*/
public class LL108_InsertAtEnd {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node insertAtEnd(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=temp;
        }
        return head;
    }
    void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL108_InsertAtEnd ll=new LL108_InsertAtEnd();
        Node first=ll.new Node(5);
        ll.head=first;
        ll.insertAtEnd(10);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.display();
        System.out.println(ll.head.data);
    }
}
