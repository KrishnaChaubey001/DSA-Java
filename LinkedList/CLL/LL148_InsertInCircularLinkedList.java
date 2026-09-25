package DSA.LinkedList.CLL;

import static DSA.LinkedList.CLL.CircularLinkedList.*;

public class LL148_InsertInCircularLinkedList {

    public Node insertAtHead(Node head, int val) {
        Node temp = new Node(val);

        if (head == null) {
            temp.next = temp;
            return temp;
        }

        Node tail = head;

        while (tail.next != head) {
            tail = tail.next;
        }

        temp.next = head;
        head = temp;
        tail.next = head;

        return head;
    }

    public Node insertAtEnd(Node head, int value) {
        Node temp = new Node(value);

        if (head == null) {
            temp.next = temp;
            return temp;
        }

        Node tail = head;

        while (tail.next != head) {
            tail = tail.next;
        }

        tail.next = temp;
        temp.next = head;

        return head;
    }

    public Node insertAtPosition(Node head, int val, int k) {
        if(k <= 0) return head;

        Node temp = new Node(val);

        if(head == null) {
            if(k == 1) {
                temp.next = temp;
                return temp;
            }
            return head;
        }

        if(k == 1) {
            Node tail = head;
            while(tail.next != head) {
                tail = tail.next;
            }
            temp.next = head;
            head = temp;
            tail.next = head;
            return head;
        }

        Node current = head;

        for(int i = 1; i < k - 1; i++) {
            current = current.next;

            if(current == head) return head;
        }

        // If k is beyond length + 1
        if(current.next == head && k != 2) {
            return head;
        }

        temp.next = current.next;
        current.next = temp;

        return head;
    }

    public static void main(String[] args) {

        LL148_InsertInCircularLinkedList ll =
                new LL148_InsertInCircularLinkedList();

        System.out.println("...Insert At Head...");

        int[] arr = {10, 20, 30, 40};
        int value = 5;

        Node head = creationCLL(arr);
        Node result = ll.insertAtHead(head, value);

        dispalyCLL(result);


        System.out.println("...Insert At End...");

        int[] arr1 = {10, 20, 30, 40};
        int value1 = 50;

        Node head1 = creationCLL(arr1);
        Node result1 = ll.insertAtEnd(head1, value1);

        dispalyCLL(result1);


        System.out.println("...Insert At Position 1...");

        int[] arr2 = {10, 20, 30, 40};
        int value2 = 5;
        int position2 = 1;

        Node head2 = creationCLL(arr2);
        Node result2 = ll.insertAtPosition(head2, value2, position2);

        dispalyCLL(result2);


        System.out.println("...Insert At Position 5...");

        int[] arr3 = {10, 20, 30, 40};
        int value3 = 50;
        int position3 = 5;

        Node head3 = creationCLL(arr3);
        Node result3 = ll.insertAtPosition(head3, value3, position3);

        dispalyCLL(result3);


        System.out.println("...Insert At Position 3...");

        int[] arr4 = {10, 20, 30, 40};
        int value4 = 25;
        int position4 = 3;

        Node head4 = creationCLL(arr4);
        Node result4 = ll.insertAtPosition(head4, value4, position4);

        dispalyCLL(result4);
    }
}