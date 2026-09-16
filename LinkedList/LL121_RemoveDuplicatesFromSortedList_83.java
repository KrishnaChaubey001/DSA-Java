package DSA.LinkedList;
/*
Question:
Given the head of a sorted linked list, delete all duplicates
such that each element appears only once.

Example 1:
Input:
1 -> 1 -> 2 -> null
Output:
1 -> 2 -> null

Example 2:
Input:
1 -> 1 -> 2 -> 3 -> 3 -> null
Output:
1 -> 2 -> 3 -> null
--------------------------------------------------
*/
public class LL121_RemoveDuplicatesFromSortedList_83 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
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
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);

        display(deleteDuplicates(head1));

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(3);

        display(deleteDuplicates(head2));

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(1);
        head3.next.next = new ListNode(1);
        head3.next.next.next = new ListNode(1);

        display(deleteDuplicates(head3));

        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        head4.next.next = new ListNode(3);

        display(deleteDuplicates(head4));

        ListNode head5 = new ListNode(5);

        display(deleteDuplicates(head5));
        ListNode head6 = null;
        display(deleteDuplicates(head6));
    }
}