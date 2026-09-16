package DSA.LinkedList;

import java.util.HashSet;

/*
Question:
Given the head of a linked list, determine whether the linked list contains a cycle.
A cycle exists if a node can be reached again by continuously following the next pointer.
Input:
        3 -> 2 -> 0 -> -4
             ^         |
             |_________|
        1 -> 2 -> null
        1 -> null
Example 1:
Output:
true
Explanation:
The last node connects back to the node with value 2, creating a cycle.
Example 2:
Output:
false
Explanation:
The linked list ends at null, so there is no cycle.
Example 3:
Output:
false
Explanation:
A single node without a self-loop does not form a cycle.
--------------------------------------------------
*/
public class LL114_LinkedListCycle_141 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // by hashing
    public static  boolean Hashing_hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode current=head;
        while(current!=null){
            if(set.contains(current)){
                return true;
            }
            set.add(current);
            current=current.next;
        }
        return false;
    }
//  by slow and fast pointer....Tortoise nad hare algorithm...
public static boolean slowAndFastpointer_hasCycle(ListNode head) {
    ListNode slow=head;
    ListNode fast =head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)return true;
    }
    return false;
}
    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(0);
        head.next.next.next=head.next;
        System.out.println(Hashing_hasCycle(head));
        System.out.println(slowAndFastpointer_hasCycle(head));
    }

}
