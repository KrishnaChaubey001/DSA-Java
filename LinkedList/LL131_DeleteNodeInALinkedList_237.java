package DSA.LinkedList;
/*
Question:
Given a node in a singly linked list that is not the last node, delete that node without access to
 the head of the linked list.
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
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head=null;
    void deleteNode(Node node){
        node.data=node.next.data;
        node.next=node.next.next;
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
        LL131_DeleteNodeInALinkedList_237 ll=new LL131_DeleteNodeInALinkedList_237();
        Node first=ll.new Node(10);
        Node second=ll.new Node(20);
        Node third=ll.new Node(30);
        Node fourth=ll.new Node(40);
        Node fifth=ll.new Node(50);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        ll.head=first;
        ll.display();
        ll.deleteNode(fourth);
        ll.display();
    }


}
