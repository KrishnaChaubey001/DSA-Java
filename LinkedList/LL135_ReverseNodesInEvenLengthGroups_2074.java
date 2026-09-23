package DSA.LinkedList;

import DSA.LinkedList.LinkedListUtils.ListNode;
import static DSA.LinkedList.LinkedListUtils.createList;
import static DSA.LinkedList.LinkedListUtils.display;
/*
Question:
Given the head of a linked list, divide the nodes into groups of lengths 1, 2, 3, 4, and so on.
Reverse every group that contains an even number of nodes.
Input:
        5 -> 2 -> 6 -> 3 -> 9 -> 1 -> 7 -> 3 -> 8 -> 4 -> null
        1 -> 1 -> 0 -> 6 -> null
        1 -> 2 -> 3 -> 4 -> 5 -> null
Example 1:
Output:
5 -> 6 -> 2 -> 3 -> 9 -> 1 -> 4 -> 8 -> 3 -> 7 -> null
Explanation:
Groups with an even number of nodes are reversed.
Example 2:
Output:
1 -> 0 -> 1 -> 6 -> null
Explanation:
The second group has an even number of nodes and is reversed.
Example 3:
Output:
1 -> 3 -> 2 -> 4 -> 5 -> null
Explanation:
Only groups with an even number of nodes are reversed.
--------------------------------------------------
*/
public class LL135_ReverseNodesInEvenLengthGroups_2074 {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head==null && head.next==null) return head;
        ListNode grPrev=head;
        int size=2;
        while(grPrev.next!=null){
            ListNode start=grPrev.next;
            ListNode current=start;
            int count=0;
            while(current!=null && count<size){
                current=current.next;
                count++;
            }
            if(count%2==0){
                ListNode prev=current;
                current=start;
                for(int i=0;i<count;i++){
                    ListNode front =current.next;
                    current.next=prev;
                    prev=current;
                    current=front;
                }
                grPrev.next=prev;
                grPrev=start;
            }else{
                for(int i=0;i<count;i++){
                    grPrev=grPrev.next;
                }
            }
            size++;
        }
        return head;

    }

    public static void main(String[] args) {
        LL135_ReverseNodesInEvenLengthGroups_2074 ll=new LL135_ReverseNodesInEvenLengthGroups_2074();
        ListNode head=createList();
        ListNode result=ll.reverseEvenLengthGroups(head);
        display(result);

    }
}
