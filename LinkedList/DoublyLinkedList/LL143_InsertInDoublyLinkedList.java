package DSA.LinkedList.DoublyLinkedList;
import static DSA.LinkedList.DoublyLinkedList.LL141_CreateDoublyLinkedList.*;

/*
Question:
Given a Doubly Linked List, insert a new node at the beginning, at the end, and at a given position.
For every insertion, correctly update both next and prev pointers.
Input:
        int[] arr1 = {10, 20, 30, 40};
        int value1 = 5;
        int position1 = 1;
        int[] arr2 = {10, 20, 30, 40};
        int value2 = 50;
        int position2 = 5;
        int[] arr3 = {10, 20, 30, 40};
        int value3 = 25;
        int position3 = 3;
Example 1:
Output:
        5 10 20 30 40
Explanation:
        Insert 5 at the beginning and update the new head's prev and old head's prev/next connections.
Example 2:
Output:
        10 20 30 40 50
Explanation:
        Insert 50 at the end and update the previous tail's next and new tail's prev.
Example 3:
Output:
        10 20 25 30 40
Explanation:
        Insert 25 at position 3 and correctly update the next and prev links of the affected nodes.
--------------------------------------------------
*/
public class LL143_InsertInDoublyLinkedList {

    public static Node insertAtHead(Node head, int value) {
        Node temp = new Node(value);
        if (head == null) return temp;

        temp.next = head;
        head.back = temp;
        head = temp;

        return head;
    }

    public static Node insertAtEnd(Node head, int value) {
        Node temp = new Node(value);
        if (head == null) return temp;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = temp;
        temp.back = tail;

        return head;
    }

    public static Node insertAtPosition(Node head, int value, int k) {
        if (k <= 0) return head;

        Node temp = new Node(value);

        // Empty list
        if (head == null) {
            if (k == 1) return temp;
            return head;
        }

        // Insert at head
        if (k == 1) {
            temp.next = head;
            head.back = temp;
            return temp;
        }

        Node current = head;

        // Move to node at position k
        for (int i = 1; i < k && current != null; i++) {
            current = current.next;
        }

        // Position is greater than length + 1
        if (current == null) return head;

        // Insert at end
        if (current.next == null) {
            current.next = temp;
            temp.back = current;
            return head;
        }

        // Insert before current
        Node prev = current.back;

        prev.next = temp;
        temp.back = prev;
        temp.next = current;
        current.back = temp;

        return head;
    }

    public static void main(String[] args) {

        System.out.println("--- Insert at Head ---");

        int[] arr1 = {10, 20, 30, 40};
        int value1 = 5;

        Node head1 = createDoublyLinkedList(arr1);
        Node result1 = insertAtHead(head1, value1);

        displayForward(result1);
        displayBackward(result1);

        System.out.println("--- Insert at End ---");

        int[] arr2 = {10, 20, 30, 40};
        int value2 = 50;

        Node head2 = createDoublyLinkedList(arr2);
        Node result2 = insertAtEnd(head2, value2);

        displayForward(result2);
        displayBackward(result2);

        System.out.println("--- Insert at Position ---");

        int[] arr3 = {10, 20, 30, 40};
        int value3 = 25;
        int position3 = 3;

        Node head3 = createDoublyLinkedList(arr3);
        Node result3 = insertAtPosition(head3, value3, position3);

        displayForward(result3);
        displayBackward(result3);
    }
}

