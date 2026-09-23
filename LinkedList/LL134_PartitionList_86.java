package DSA.LinkedList;
import DSA.LinkedList.LinkedListUtils.ListNode;
import static DSA.LinkedList.LinkedListUtils.createList;
import static DSA.LinkedList.LinkedListUtils.display;
/*
Question:
Given the head of a linked list and an integer x, partition the list so that all nodes with values less than x come before nodes with values greater than or equal to x.
The original relative order of nodes in each partition should be preserved.
Input:
        1 -> 4 -> 3 -> 2 -> 5 -> 2 -> null
        int x = 3;
        2 -> 1 -> null
        int x1 = 2;
        3 -> 1 -> 2 -> null
        int x2 = 4;
Example 1:
Output:
1 -> 2 -> 2 -> 4 -> 3 -> 5 -> null
Explanation:
Nodes smaller than 3 come first while preserving their original order.
Example 2:
Output:
1 -> 2 -> null
Explanation:
The node with value 1 comes before the node with value 2.
Example 3:
Output:
3 -> 1 -> 2 -> null
Explanation:
All nodes are smaller than 4, so the list remains unchanged.
--------------------------------------------------
*/
public class LL134_PartitionList_86 {
    public ListNode partition(ListNode head, int x) {
        ListNode lessDummy=new ListNode (-1);
        ListNode greaterDummy=new ListNode (-1);
        ListNode less=lessDummy;
        ListNode greater=greaterDummy;
        while(head!=null){
            ListNode front=head.next;
            if(head.val<x){
                less.next=head;
                less=less.next;
            }
            else{
                greater.next=head;
                greater=greater.next;
            }
            head=front;
        }
        greater.next=null;
        less.next=greaterDummy.next;
        return lessDummy.next;

    }
    public ListNode partitionByCreatingNewNode(ListNode head, int x) {
        ListNode dummyNode=new ListNode(-1);
        ListNode res=dummyNode;
        while(head!=null && head.val<x){
            ListNode temp=new ListNode(head.val);
            res.next=temp;
            res=temp;
            head=head.next;
        }
        ListNode current=head;
        while(current!=null && current.next!=null){
            while(current.next!=null && current.next.val<x){
                ListNode front=current.next.next;
                ListNode temp=new ListNode(current.next.val);
                res.next=temp;
                res=temp;
                current.next=front;
            }
            current=current.next;
        }
        res.next=head;
        return dummyNode.next;
    }

    public static void main(String[] args) {
        LL134_PartitionList_86 ll=new LL134_PartitionList_86();
        ListNode head=createList();
        ListNode result=ll.partition(head,3);
        display(result);
        System.out.println("------------ by creating new Node ");
        ListNode result1=ll.partitionByCreatingNewNode(head,3);
        display(result);

    }
}
