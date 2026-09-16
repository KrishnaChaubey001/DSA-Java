package DSA.LinkedList;
/*
Question:
Given the head of a singly linked list, return true if the linked list is a palindrome, otherwise return false.
Input:
        1 -> 2 -> 2 -> 1 -> null
        1 -> 2 -> null
        1 -> 2 -> 3 -> 2 -> 1 -> null
Example 1:
Output:
true
Explanation:
The linked list reads the same from left to right and right to left.
Example 2:
Output:
false
Explanation:
The values are different when read from opposite directions.
Example 3:
Output:
true
Explanation:
The linked list is symmetrical.
--------------------------------------------------
*/
public class LL116_PalindromeLinkedList_234 {
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode front=current.next;
            current.next=prev;
            prev=current;
            current=front;
        }
        return prev;


    }
    static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&& fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null){
            if(first.val!=second.val){
               slow.next=reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;

        }
        slow.next=reverse(newHead);

        return true;

    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(2);
        head.next.next.next.next=new ListNode(1);
        System.out.println(isPalindrome(head));

        head.next.next.next.next.next=new ListNode(1);
        System.out.println(isPalindrome(head));
        ListNode head1=new ListNode(1);
        ListNode head2=new ListNode();
        System.out.println(isPalindrome(head1));
        System.out.println(isPalindrome(head2));
    }
}
