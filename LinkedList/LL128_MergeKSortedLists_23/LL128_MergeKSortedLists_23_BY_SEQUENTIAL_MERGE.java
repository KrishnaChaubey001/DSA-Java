package DSA.LinkedList.LL128_MergeKSortedLists_23;

public class LL128_MergeKSortedLists_23_BY_SEQUENTIAL_MERGE {
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

    private static ListNode merge(ListNode firstHead, ListNode secondHead) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (firstHead != null && secondHead != null) {
            if (firstHead.val <= secondHead.val) {
                current.next = firstHead;
                firstHead = firstHead.next;
            } else {
                current.next = secondHead;
                secondHead = secondHead.next;
            }

            current = current.next;
        }

        if (firstHead != null) {
            current.next = firstHead;
        }

        if (secondHead != null) {
            current.next = secondHead;
        }

        return dummy.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode result = null;

        for (ListNode list : lists) {
            result = merge(result, list);
        }

        return result;
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