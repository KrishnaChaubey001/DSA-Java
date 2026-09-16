package DSA.LinkedList;
/*
Question:
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
Input:
        1 -> 2 -> 3 -> 4 -> 5 -> null
        1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        1 -> null
Example 1:
Output:
3 -> 4 -> 5 -> null
Explanation:
The middle node is 3.
Example 2:
Output:
4 -> 5 -> 6 -> null
Explanation:
There are two middle nodes, so return the second middle node 4.
Example 3:
Output:
1 -> null
Explanation:
The linked list contains only one node.
--------------------------------------------------
*/
public class LL111_MiddleOfTheLinkedList_876 {
    class ListNode {
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
    public static  int count(ListNode head){
        ListNode c=head;
        int count =0;
        while(c!=null){
            count++;
            c=c.next;
        }
        return count;
    }
    public static  ListNode ByCountingMiddleNode(ListNode head) {
        ListNode current=head;
        int m=count(head);
        for(int i=0;i<m/2;i++){
            current=current.next;
        }
        return current;

    }
    public static ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            if(fast.next==null) return slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LL111_MiddleOfTheLinkedList_876 ll = new LL111_MiddleOfTheLinkedList_876();

        ListNode head = ll.new ListNode(1);
        head.next = ll.new ListNode(2);
        head.next.next = ll.new ListNode(3);
        head.next.next.next = ll.new ListNode(4);
        head.next.next.next.next = ll.new ListNode(5);

        ListNode middle = ByCountingMiddleNode(head);

        System.out.println("Middle node: " + middle.val);

        ListNode result=middleNode(head);
        System.out.println("Middle node by slow and fast pointer: " + result.val);

        ListNode head2 = ll.new ListNode(1);
        head2.next = ll.new ListNode(2);
        head2.next.next = ll.new ListNode(3);
        head2.next.next.next = ll.new ListNode(4);
        head2.next.next.next.next = ll.new ListNode(5);
        head2.next.next.next.next.next = ll.new ListNode(6);

        ListNode middle2 = ByCountingMiddleNode(head2);

        System.out.println("Even list middle: " + middle2.val);

        ListNode result1=middleNode(head2);
        System.out.println("Middle node by slow and fast pointer: " + result1.val);

    }

}
