package DSA.LinkedList;

/*
Question:
Given the head of a linked list, sort the linked list in ascending order.

Input:
4 -> 2 -> 1 -> 3 -> null
-1 -> 5 -> 3 -> 4 -> 0 -> null
1 -> null

Example 1:
Output:
1 -> 2 -> 3 -> 4 -> null

Example 2:
Output:
-1 -> 0 -> 3 -> 4 -> 5 -> null

Example 3:
Output:
1 -> null
*/
public class LL127_SortList_148 {
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

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode merge(ListNode firstHead, ListNode secondHead) {
        ListNode newHead = new ListNode(-1);
        ListNode c1 = firstHead;
        ListNode c2 = secondHead;
        ListNode current = newHead;

        while (c1 != null && c2 != null) {
            if (c1.val <= c2.val) {
                current.next = c1;
                current = c1;
                c1 = c1.next;
            } else {
                current.next = c2;
                current = c2;
                c2 = c2.next;
            }
        }

        while (c1 != null) {
            current.next = c1;
            current = c1;
            c1 = c1.next;
        }

        while (c2 != null) {
            current.next = c2;
            current = c2;
            c2 = c2.next;
        }

        return newHead.next;
    }

    public  ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode middle = findMiddle(head);

        ListNode firstHead = head;
        ListNode secondHead = middle.next;

        middle.next = null;

        firstHead = sortList(firstHead);
        secondHead = sortList(secondHead);

        return merge(firstHead, secondHead);
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
        LL127_SortList_148 obj = new LL127_SortList_148();

        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        ListNode result = obj.sortList(head);
        display(result);
    }
}