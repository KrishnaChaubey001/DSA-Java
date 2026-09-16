package DSA.LinkedList;

/*
Question:
Given the head of a singly linked list and two integers left and right, reverse the nodes from position left to position right.
Input:
        1 -> 2 -> 3 -> 4 -> 5 -> null
        int left = 2;
        int right = 4;
        5 -> null
        int left1 = 1;
        int right1 = 1;
        1 -> 2 -> 3 -> null
        int left2 = 1;
        int right2 = 3;
Example 1:
Output:
1 -> 4 -> 3 -> 2 -> 5 -> null
Explanation:
Only the nodes from positions 2 to 4 are reversed.
Example 2:
Output:
5 -> null
Explanation:
Reversing one node does not change the linked list.
Example 3:
Output:
3 -> 2 -> 1 -> null
Explanation:
The entire linked list is reversed.
--------------------------------------------------
*/
public class LL124_ReverseLinkedListII_92 {
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
    public static ListNode reverseLinkedList(ListNode head,int left,int right){
      if(head==null || head.next==null || left==right){
        return head;
      }
      ListNode dummy=new ListNode(-1);
      dummy.next=head;
      ListNode start=dummy;

      for(int i=1;i<left;i++){
        start=start.next;
      }
      ListNode startPoint=start.next;
      ListNode current=startPoint;
      ListNode prev=null;
      for(int i=0;i<=right-left;i++){
        ListNode front=current.next;
        current.next=prev;
        prev=current;
        current=front;
      }
      startPoint.next=current;
      start.next=prev;
      return dummy.next;
    }
    static void display(ListNode head){
      ListNode current=head;
      while(current!=null){
        System.out.print(current.val+"->");
        current=current.next;
      }

    }

  public static void main(String[] args) {
    // 1 -> 2 -> 3 -> 4 -> 5 -> null
    ListNode head=new ListNode(1);
    head.next=new ListNode(2);
    head.next.next=new ListNode(3);
    head.next.next.next=new ListNode(4);
    head.next.next.next.next=new ListNode(5);
    head.next.next.next.next.next=new ListNode(6);
    int left=2;
    int right=4;
    ListNode result=reverseLinkedList(head,left,right);
    display(result);
  }

}
