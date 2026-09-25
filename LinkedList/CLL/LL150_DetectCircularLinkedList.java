package DSA.LinkedList.CLL;

import static DSA.LinkedList.CLL.CircularLinkedList.*;

public class LL150_DetectCircularLinkedList {

    boolean detectCircularLL(Node head) {
        if(head == null) return false;

        Node current = head.next;

        while(current != null && current != head) {
            current = current.next;
        }

        return current == head;
    }

    public static void main(String[] args) {

        LL150_DetectCircularLinkedList ll =
                new LL150_DetectCircularLinkedList();

        // Test 1: Circular Linked List
        Node head1 = creationCLL(new int[]{10, 20, 30, 40});

        System.out.println("List 1: Circular Linked List");
        System.out.println(ll.detectCircularLL(head1));


        // Test 2: Normal Linked List
        Node head2 = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        head2.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        System.out.println("List 2: Normal Linked List");
        System.out.println(ll.detectCircularLL(head2));


        // Test 3: Single Node Circular Linked List
        Node head3 = new Node(10);
        head3.next = head3;

        System.out.println("List 3: Single Node Circular Linked List");
        System.out.println(ll.detectCircularLL(head3));
    }
}