package DSA.LinkedList;
import DSA.LinkedList.LinkedListUtils.ListNode;
import static DSA.LinkedList.LinkedListUtils.createList;
import static DSA.LinkedList.LinkedListUtils.display;

/*
Question:
Given the head of a singly linked list, delete the middle node and return the head of the modified linked list.
For a list with n nodes, the middle node is the node at index n / 2 using 0-based indexing.
Input:
        1 -> 3 -> 4 -> 7 -> 1 -> 2 -> 6 -> null
        1 -> 2 -> 3 -> 4 -> null
        2 -> 1 -> null
Example 1:
Output:
1 -> 3 -> 4 -> 1 -> 2 -> 6 -> null
Explanation:
The middle node is 7, so it is removed.
Example 2:
Output:
1 -> 2 -> 4 -> null
Explanation:
The node at index 2 is removed.
Example 3:
Output:
2 -> null
Explanation:
The second node is the middle node and is removed.
--------------------------------------------------
*/
public class LL132_DeleteTheMiddleNodeOfALinkedList_2095 {

    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode front=slow.next.next;
        slow.next=front;
        return head;
    }

    public static void main(String[] args) {
        LL132_DeleteTheMiddleNodeOfALinkedList_2095 ll=new LL132_DeleteTheMiddleNodeOfALinkedList_2095();
        ListNode head = createList();
        ListNode result= ll.deleteMiddle(head);
        display(result);

    }
}
