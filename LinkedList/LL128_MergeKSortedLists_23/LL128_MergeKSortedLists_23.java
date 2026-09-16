package DSA.LinkedList.LL128_MergeKSortedLists_23;

import java.util.ArrayList;
import java.util.Collections;

/*
Question:
Given the head of k sorted linked lists, merge all the linked lists into one sorted linked list.

Example:
L1 = 1 -> 4 -> 5
L2 = 1 -> 3 -> 4
L3 = 2 -> 6

Output:
1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6
*/
public class LL128_MergeKSortedLists_23 {
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

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ArrayList<Integer> values = new ArrayList<>();

        // Put all values into ArrayList
        for (ListNode head : lists) {
            ListNode current = head;

            while (current != null) {
                values.add(current.val);
                current = current.next;
            }
        }

        // Sort all values
        Collections.sort(values);

        // Convert ArrayList back to Linked List
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
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
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = {list1, list2, list3};

        ListNode result = mergeKLists(lists);
        display(result);
    }
}