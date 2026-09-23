package DSA.LinkedList;
import DSA.LinkedList.LinkedListUtils.ListNode;
import static DSA.LinkedList.LinkedListUtils.createList;
import static DSA.LinkedList.LinkedListUtils.display;

/*
Question:
Given the head of a linked list and an integer val, remove all nodes with value equal to val and return the new head.
Input:
        1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6 -> null
        int val = 6;
        7 -> 7 -> 7 -> null
        int val1 = 7;
        1 -> 2 -> 3 -> null
        int val2 = 5;
Example 1:
Output:
1 -> 2 -> 3 -> 4 -> 5 -> null
Explanation:
All nodes with value 6 are removed.
Example 2:
Output:
null
Explanation:
Every node contains the value 7, so all nodes are removed.
Example 3:
Output:
1 -> 2 -> 3 -> null
Explanation:
No node contains the value 5.
--------------------------------------------------
*/
public class LL133_RemoveLinkedListElements_203 {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode current=head;
        while(current!=null && current.next!=null){
            while(current.next!=null && current.next.val==val){
                ListNode front=current.next.next;
                current.next=front;

            }
            current=current.next;
        }
        return head;

    }
// we imported the LinkedList class filee so we changeb in data according to our requirement in currents question
    public static void main(String[] args) {
        LL133_RemoveLinkedListElements_203 ll=new LL133_RemoveLinkedListElements_203();
        ListNode head=createList();
        ListNode result=ll.removeElements(head,3);
        display(result);
    }
}
