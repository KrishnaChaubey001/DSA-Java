package DSA.LinkedList;

import java.util.Stack;

/*
Question:
Given the head of a singly linked list, reverse the linked list and return the new head.

Input:
        1 -> 2 -> 3 -> 4 -> 5 -> null
        1 -> 2 -> null
        1 -> null

Example 1:
Output:
5 -> 4 -> 3 -> 2 -> 1 -> null

Example 2:
Output:
2 -> 1 -> null

Example 3:
Output:
1 -> null
--------------------------------------------------
*/

public class LL112_ReverseLinkedList_206 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // 1. Iterative / Pointer Solution
    static ListNode pointerReverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }

        return prev;
    }

    // 2. Recursive Solution
    static ListNode recursionReverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = recursionReverse(head.next);

        ListNode front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    // 3. Stack Solution
    static ListNode stackReverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        Stack<ListNode> stack = new Stack<>();

        ListNode current = head;

        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        ListNode newHead = stack.pop();
        current = newHead;

        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }

        current.next = null;

        return newHead;
    }

    // Display Linked List
    static void display(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // ==============================
        // Example 1
        // 1 -> 2 -> 3 -> 4 -> 5
        // ==============================

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.print("Original list: ");
        display(head1);

        ListNode pointerResult = pointerReverse(head1);

        System.out.print("Pointer: ");
        display(pointerResult);


        // Create a new list for recursion
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        ListNode recursionResult = recursionReverse(head2);

        System.out.print("Recursion: ");
        display(recursionResult);


        // Create a new list for stack
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(4);
        head3.next.next.next.next = new ListNode(5);

        ListNode stackResult = stackReverse(head3);

        System.out.print("Stack: ");
        display(stackResult);


        // ==============================
        // Example 2
        // 1 -> 2
        // ==============================

        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);

        System.out.print("\nExample 2 Original: ");
        display(head4);

        ListNode result4 = pointerReverse(head4);

        System.out.print("Example 2 Reversed: ");
        display(result4);


        // ==============================
        // Example 3
        // 1
        // ==============================

        ListNode head5 = new ListNode(1);

        System.out.print("\nExample 3 Original: ");
        display(head5);

        ListNode result5 = pointerReverse(head5);

        System.out.print("Example 3 Reversed: ");
        display(result5);
    }
}