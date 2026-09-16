package DSA.LinkedList;
/*
Question:
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order. Add the two numbers and return the sum as a linked list.
Input:
        2 -> 4 -> 3 -> null
        5 -> 6 -> 4 -> null
        0 -> null
        0 -> null
        9 -> 9 -> 9 -> null
        1 -> null
Example 1:
Output:
7 -> 0 -> 8 -> null
Explanation:
342 + 465 = 807, so the result is stored as 7 -> 0 -> 8.
Example 2:
Output:
0 -> null
Explanation:
0 + 0 = 0.
Example 3:
Output:
0 -> 0 -> 0 -> 1 -> null
Explanation:
999 + 1 = 1000, and the digits are stored in reverse order.
--------------------------------------------------
*/
public class LL119_AddTwoNumbers_2 {
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        int carry = 0;
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode current = dummyNode;
        while (c1 != null || c2 != null) {
            int sum = carry;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }

            ListNode newNode = new ListNode(sum % 10);
            current.next = newNode;
            current = newNode;
            carry = sum / 10;
        }
        if (carry != 0) {
            current.next = new ListNode(carry);
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        // Example 1: 342 + 465 = 807
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result1 = addTwoNumbers(l1, l2);

        while (result1 != null) {
            System.out.print(result1.val + " -> ");
            result1 = result1.next;
        }
        System.out.println("null");


        // Example 2: 0 + 0 = 0
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(0);

        ListNode result2 = addTwoNumbers(l3, l4);

        while (result2 != null) {
            System.out.print(result2.val + " -> ");
            result2 = result2.next;
        }
        System.out.println("null");


        // Example 3: 999 + 1 = 1000
        ListNode l5 = new ListNode(9);
        l5.next = new ListNode(9);
        l5.next.next = new ListNode(9);

        ListNode l6 = new ListNode(1);

        ListNode result3 = addTwoNumbers(l5, l6);

        while (result3 != null) {
            System.out.print(result3.val + " -> ");
            result3 = result3.next;
        }
        System.out.println("null");
    }

}
