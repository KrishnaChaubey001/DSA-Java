package DSA.LinkedList;
/*
Question:
Given the head of a singly linked list, traverse the linked list and print all values from the head to the last node.
Input:
        1 -> 2 -> 3 -> 4 -> null
        10 -> 20 -> 30 -> null
        5 -> null
Example 1:
Output:
1 2 3 4
Explanation:
Start from the head and move to the next node until null is reached.
Example 2:
Output:
10 20 30
Explanation:
Traverse each node from the head to the last node.
Example 3:
Output:
5
Explanation:
The linked list contains only one node.
--------------------------------------------------
*/
public class LL106_LinkedListTraversal {
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void traverse(Node head){
        Node current =head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node second1 = new Node(2);
        Node third1 = new Node(3);
        Node fourth1 = new Node(4);

        head1.next = second1;
        second1.next = third1;
        third1.next = fourth1;
        traverse(head1);
    }
}
