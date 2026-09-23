package DSA.LinkedList.DoublyLinkedList;


/*
Question:
Create a Doubly Linked List where each node contains three parts: data, next, and prev.
Build the list from the given array and correctly connect both next and prev pointers.
Input:
        int[] arr = {10, 20, 30, 40, 50};
Example 1:
Output:
        Forward: 10 20 30 40 50
        Backward: 50 40 30 20 10
Explanation:
        Each node should point to the next node using next and to the previous node using prev.
        The first node's prev must be null and the last node's next must be null.
Example 2:
Input:
        int[] arr = {5};
Output:
        Forward: 5
        Backward: 5
Explanation:
        A single-node DLL has both prev and next as null.
Example 3:
Input:
        int[] arr = {};
Output:
        Forward: Empty
        Backward: Empty
Explanation:
        An empty array represents an empty Doubly Linked List.
--------------------------------------------------
*/
public class LL141_CreateDoublyLinkedList {
    static class Node{
        int data;
        Node next;
        Node back;
        Node(int data,Node next,Node back){
            this.data=data;
            this.next=next;
            this.back=back;
        }
        Node(int data){
            this.data=data;
            this.next=null;
            this.back=null;
        }
    }
    public static Node createDoublyLinkedList(int arr[]) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            temp.back = prev;
            prev = prev.next;
        }
        return head;
    }

    static void displayForward(Node head) {
        if(head==null) {
            System.out.println("Forward: Empty");
            return;
        }
        Node current = head;

        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    static void displayBackward(Node head) {
        if(head==null) {
            System.out.println("Backward: Empty");
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        System.out.print("Backward: ");
        while (tail != null) {
            System.out.print(tail.data + "->");
            tail = tail.back;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Node head=createDoublyLinkedList(arr);
        displayForward(head);
        displayBackward(head);
        int[] arr1 = {5};
        Node head1=createDoublyLinkedList(arr1);
        displayForward(head1);
        displayBackward(head1);
        int[] arr2 = {};
        Node head2=createDoublyLinkedList(arr2);
        displayForward(head2);
        displayBackward(head2);

    }
}
