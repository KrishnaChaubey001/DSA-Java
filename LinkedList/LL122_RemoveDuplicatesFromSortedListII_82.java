package DSA.LinkedList;
/*
Question:
Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
leaving only distinct numbers from the original list.

Example 1:
Input:
1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5 -> null
Output:
1 -> 2 -> 5 -> null

Example 2:
Input:
1 -> 1 -> 1 -> 2 -> 3 -> null
Output:
2 -> 3 -> null
--------------------------------------------------
*/
public class LL122_RemoveDuplicatesFromSortedListII_82 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        ListNode current = head;
        while (current != null) {
            if (current.next != null && current.val == current.next.val) {
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
                prev.next = current.next;
                current = current.next;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return dummyNode.next;
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
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next.next = new ListNode(5);
        display(deleteDuplicates(head1));
        // Example 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(2);
        head2.next.next.next.next = new ListNode(3);
        display(deleteDuplicates(head2));
        // Example 3
        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(3);
        display(deleteDuplicates(head3));
        // Example 4
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(1);
        display(deleteDuplicates(head4));
        // Example 5
        ListNode head5 = null;
        display(deleteDuplicates(head5));
    }
}