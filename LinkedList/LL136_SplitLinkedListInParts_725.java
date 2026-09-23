package DSA.LinkedList;

import DSA.LinkedList.LinkedListUtils.ListNode;
import static DSA.LinkedList.LinkedListUtils.createList;
import static DSA.LinkedList.LinkedListUtils.display;

public class LL136_SplitLinkedListInParts_725 {

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] list = new ListNode[k];

        int length = 0;
        ListNode current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        int base = length / k;
        int extra = length % k;

        current = head;

        for (int i = 0; i < k; i++) {
            list[i] = current;

            int size = base;
            if (i < extra) size++;

            for (int j = 1; j < size; j++) {
                current = current.next;
            }

            if (current != null) {
                ListNode front = current.next;
                current.next = null;
                current = front;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        LL136_SplitLinkedListInParts_725 ll =
                new LL136_SplitLinkedListInParts_725();

        ListNode head = createList();

        System.out.println("Original List:");
        display(head);

        int k = 3;

        ListNode[] result = ll.splitListToParts(head, k);

        System.out.println("\nSplit List:");

        for (int i = 0; i < result.length; i++) {
            System.out.print("Part " + (i + 1) + ": ");
            display(result[i]);
        }
    }
}