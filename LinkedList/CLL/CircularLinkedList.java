package DSA.LinkedList.CLL;
/*
Question:
Create a Circular Linked List from the given array where the last node points back to the head.
Input:
        int[] arr = {10, 20, 30, 40, 50};
Example 1:
Output:
        10 20 30 40 50 → 10
Explanation:
        The last node (50) must point back to the first node (10), forming a circular structure.
Example 2:
Input:
        int[] arr = {5};
Output:
        5 → 5
Explanation:
        In a single-node Circular Linked List, the node points to itself.
Example 3:
Input:
        int[] arr = {};
Output:
        Empty
Explanation:
        An empty array represents an empty Circular Linked List.
--------------------------------------------------
*/
public class CircularLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node creationCLL(int arr[]){
        if(arr==null || arr.length==0) return null;
        Node head=new Node (arr[0]);
        Node tail=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node (arr[i]);
            tail.next=temp;
            tail=tail.next;

        }
        tail.next=head;
        return head;
    }
    static  void dispalyCLL(Node head){
        if(head==null){
            System.out.println("Empty");
            return ;
        }
        Node current=head;
        do{
            System.out.print(current.data+"->");
            current=current.next;
        }while(current!=head);
        System.out.println("["+current.data+"]");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head=creationCLL(arr);
        dispalyCLL(head);
    }

}
