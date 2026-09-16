package DSA.LinkedList;

import java.util.HashSet;

/*
Question:
Given the heads of two singly linked lists, return the node at which the two linked lists intersect. If they do not intersect, return null.
Input:
        List A: 4 -> 1 -> 8 -> 4 -> 5 -> null
        List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5 -> null
        List A1: 1 -> 2 -> 3 -> null
        List B1: 4 -> 5 -> 6 -> null
        List A2: 1 -> 2 -> 3 -> null
        List B2: 9 -> 3 -> null
Example 1:
Output:
Node with value 8
Explanation:
Both linked lists share the same node with value 8 and continue from there.
Example 2:
Output:
null
Explanation:
The two linked lists do not share any node.
Example 3:
Output:
Node with value 3
Explanation:
Both lists intersect at the same node with value 3.
--------------------------------------------------
*/
public class LL118_IntersectionOfTwoLinkedLists_160 {
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode hashingSolutionGetIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        HashSet<ListNode> set = new HashSet();
        ListNode current = headA;
        while (current != null) {
            set.add(current);
            current = current.next;
        }
        ListNode currentB = headB;
        while (currentB != null) {
            if (set.contains(currentB)) {
                return currentB;
            }
            currentB = currentB.next;
        }
        return null;

    }

    // Two pointer Solution that is optimal Solution
    public static ListNode TwoPointerGetIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode currentA=headA;
        ListNode currentB=headB;
        while(currentA!=currentB){
            currentA=currentA.next;
            currentB=currentB.next;
            if(currentA==currentB){
                return currentA;
            }
            if(currentA==null) currentA=headB;
            if(currentB==null) currentB=headA;
        }
        return currentA;

    }

    public static void main(String[] args) {
        LL118_IntersectionOfTwoLinkedLists_160 ll = new LL118_IntersectionOfTwoLinkedLists_160();
        ListNode common1 = ll.new ListNode(8);
        ListNode common2 = ll.new ListNode(4);
        ListNode common3 = ll.new ListNode(5);

        common1.next = common2;
        common2.next = common3;

        ListNode headA = ll.new ListNode(4);
        headA.next = ll.new ListNode(1);
        headA.next.next = common1;

        ListNode headB = ll.new ListNode(5);
        headB.next = ll.new ListNode(6);
        headB.next.next = common1;

        ListNode result = hashingSolutionGetIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println(result.data);

        } else {
            System.out.println("Null");
        }

        ListNode headA2 = ll.new ListNode(1);
        headA2.next = ll.new ListNode(2);
        headA2.next.next = ll.new ListNode(3);

        ListNode headB2 = ll.new ListNode(4);
        headB2.next = ll.new ListNode(5);
        headB2.next.next = ll.new ListNode(6);
        ListNode result1 = hashingSolutionGetIntersectionNode(headA2, headB2);
        if (result1 != null) {
            System.out.println(result1.data);

        } else {
            System.out.println("Null");
        }
        ListNode result2=TwoPointerGetIntersectionNode(headA,headB);
        if (result2 != null) {
            System.out.println("Two Pointer: Node with value " + result2.data);
        } else {
            System.out.println("Two Pointer: null");
        }
    }
}
