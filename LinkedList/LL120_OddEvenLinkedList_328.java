package DSA.LinkedList;

/*
Question:
Given the head of a singly linked list, group all nodes with odd indices
together followed by nodes with even indices.
The first node is considered odd-indexed.
Example 1:
Input:
1 -> 2 -> 3 -> 4 -> 5 -> null
Output:
1 -> 3 -> 5 -> 2 -> 4 -> null

Example 2:
Input:
2 -> 1 -> 3 -> 5 -> 6 -> 4 -> 7 -> null

Output:
2 -> 3 -> 6 -> 7 -> 1 -> 5 -> 4 -> null

Example 3:
Input:
1 -> null

Output:
1 -> null
--------------------------------------------------
*/

public class LL120_OddEvenLinkedList_328 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Solution 1: Using two dummy nodes and a counter
    public static ListNode oddEvenList1(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummyNode1 = new ListNode(-1);
        ListNode dummyNode2 = new ListNode(-1);

        ListNode temp = dummyNode1;
        ListNode temp1 = dummyNode2;
        ListNode current = head;

        int count = 0;

        while (current != null) {

            ListNode front = current.next;
            count++;

            if (count % 2 != 0) {
                temp.next = current;
                temp = temp.next;
                temp.next = null;
            } else {
                temp1.next = current;
                temp1 = temp1.next;
                temp1.next = null;
            }

            current = front;
        }

        temp.next = dummyNode2.next;

        return dummyNode1.next;
    }


    // Solution 2: Two-pointer approach (Optimal)
    public static ListNode oddEvenList2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {

            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }


    // Display linked list
    public static void display(ListNode head) {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {

        // -----------------------------
        // Solution 1
        // -----------------------------

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.println("Solution 1:");
        ListNode result1 = oddEvenList1(head1);
        display(result1);


        // -----------------------------
        // Solution 2
        // -----------------------------

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        System.out.println("Solution 2:");
        ListNode result2 = oddEvenList2(head2);
        display(result2);


        // -----------------------------
        // Example 2
        // -----------------------------

        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(1);
        head3.next.next = new ListNode(3);
        head3.next.next.next = new ListNode(5);
        head3.next.next.next.next = new ListNode(6);
        head3.next.next.next.next.next = new ListNode(4);
        head3.next.next.next.next.next.next = new ListNode(7);

        System.out.println("Example 2:");
        display(oddEvenList2(head3));


        // -----------------------------
        // Example 3
        // -----------------------------

        ListNode head4 = new ListNode(1);

        System.out.println("Example 3:");
        display(oddEvenList2(head4));
    }
}