package DSA.LinkedList;

/*
Question:
Given the head of a singly linked list, reorder the list in the following pattern:
L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 -> ...

Input:
1 -> 2 -> 3 -> 4 -> null
1 -> 2 -> 3 -> 4 -> 5 -> null
1 -> 2 -> null

Example 1:
Output:
1 -> 4 -> 2 -> 3 -> null

Example 2:
Output:
1 -> 5 -> 2 -> 4 -> 3 -> null

Example 3:
Output:
1 -> 2 -> null
*/
public class LL126_ReorderList_143 {
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

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode prev = null;
        ListNode current = slow.next;

        while (current != null) {
            ListNode front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }

        // Separate two halves
        slow.next = null;

        // Merge two halves
        ListNode p1 = head;
        ListNode p2 = prev;

        while (p2 != null) {
            ListNode front = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = front;
        }
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        reorderList(head);
        display(head);
    }
}