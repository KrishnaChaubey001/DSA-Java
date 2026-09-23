package DSA.LinkedList;
import DSA.LinkedList.LinkedListUtils.ListNode;

import java.util.List;

import static DSA.LinkedList.LinkedListUtils.createList;
import static DSA.LinkedList.LinkedListUtils.display;
/*
Question:
Given the head of a linked list and an integer k, reverse the first k nodes, skip the next k nodes,
 then continue this pattern until the end of the list.
Input:
        1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> null
        int k = 2;
        1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        int k1 = 3;
        1 -> 2 -> 3 -> null
        int k2 = 1;
Example 1:
Output:
2 -> 1 -> 3 -> 4 -> 6 -> 5 -> 7 -> 8 -> null
Explanation:
Reverse two nodes, skip two nodes, and repeat.
Example 2:
Output:
3 -> 2 -> 1 -> 4 -> 5 -> 6 -> null
Explanation:
Reverse the first three nodes and skip the next three nodes.
Example 3:
Output:
1 -> 2 -> 3 -> null
Explanation:
Reversing groups of one node does not change the list.
--------------------------------------------------
*/
public class LL137_ReverseAlternateKNodes {
    public static ListNode reverseAlternateNodes(ListNode head,int k){
        if(head==null || head.next==null || k<=1 ) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode grp=dummy;
        boolean reverse=true;
        while(grp.next!=null){
            if(reverse){
                ListNode start=grp.next;
                ListNode current=start;
                ListNode prev=null;
                int c=k;
                while(current!=null && c>0 ){
                    ListNode front=current.next;
                    current.next=prev;
                    prev=current;
                    current=front;
                    c--;
                }
                start.next=current;
                grp.next=prev;
                grp=start;
            }
            else{
                int count = 0;

                while (grp.next != null && count < k) {
                    grp = grp.next;
                    count++;
                }

            }
            reverse=!reverse;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode head=createList();
        int k=2;
        ListNode result=reverseAlternateNodes(head,k);
        display(result);
    }
}
