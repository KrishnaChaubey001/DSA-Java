package DSA.LinkedList;

public class LinkedListUtils {// Remember this file can be changed in value according to need of the question ...
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int data) {
            val = data;
            next=null;
        }
    }

    public static ListNode createList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        return head;
    }

    public static void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}