package DSA.LinkedList;

/*
Question:
Given the heads of two sorted linked lists list1 and list2, merge them into one sorted linked list
and return the head of the merged list.

Input:
        1 -> 2 -> 4 -> null
        1 -> 3 -> 4 -> null

        1 -> 3 -> 5 -> null
        2 -> 4 -> 6 -> null

        null
        0 -> null

Example 1:
Output:
1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null

Example 2:
Output:
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

Example 3:
Output:
0 -> null
--------------------------------------------------
*/

public class LL113_MergeTwoSortedLists_21 {

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

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c1 = list1;
        ListNode c2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (c1 != null && c2 != null) {
            if (c1.val <= c2.val) {
                current.next = c1;
                c1 = c1.next;
            } else {
                current.next = c2;
                c2 = c2.next;
            }

            current = current.next;
        }

        if (c1 != null) {
            current.next = c1;
        } else {
            current.next = c2;
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
        // List 1: 1 -> 2 -> 4
        // List 2: 1 -> 3 -> 4

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.print("List 1: ");
        display(list1);

        System.out.print("List 2: ");
        display(list2);

        ListNode result1 = mergeTwoLists(list1, list2);

        System.out.print("Merged list: ");
        display(result1);


        // Example 2
        // List 1: 1 -> 3 -> 5
        // List 2: 2 -> 4 -> 6

        ListNode list3 = new ListNode(1);
        list3.next = new ListNode(3);
        list3.next.next = new ListNode(5);

        ListNode list4 = new ListNode(2);
        list4.next = new ListNode(4);
        list4.next.next = new ListNode(6);

        System.out.print("\nList 3: ");
        display(list3);

        System.out.print("List 4: ");
        display(list4);

        ListNode result2 = mergeTwoLists(list3, list4);

        System.out.print("Merged list: ");
        display(result2);


        // Example 3
        // List 1: null
        // List 2: 0

        ListNode list5 = null;
        ListNode list6 = new ListNode(0);

        System.out.print("\nList 5: ");
        display(list5);

        System.out.print("List 6: ");
        display(list6);

        ListNode result3 = mergeTwoLists(list5, list6);

        System.out.print("Merged list: ");
        display(result3);
    }
}