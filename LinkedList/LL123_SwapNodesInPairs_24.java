package DSA.LinkedList;
/*
Question:
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the nodes.

Example 1:
Input:
1 -> 2 -> 3 -> 4 -> null
Output:
2 -> 1 -> 4 -> 3 -> null

Example 2:
Input:
1 -> 2 -> 3 -> null
Output:
2 -> 1 -> 3 -> null

Example 3:
Input:
1 -> null
Output:
1 -> null
--------------------------------------------------
*/
public class LL123_SwapNodesInPairs_24 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null && current.next.next != null) {
            ListNode s1 = current.next;
            ListNode s2 = current.next.next;
            s1.next = s2.next;
            s2.next = s1;
            current.next = s2;
            current = s1;
        }
        return dummy.next;
    }
    static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        display(swapPairs(head1));
        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        display(swapPairs(head2));
        // Example 3
        ListNode head3 = new ListNode(1);
        display(swapPairs(head3));
        // Example 4: Empty list
        ListNode head4 = null;
        display(swapPairs(head4));
    }
}