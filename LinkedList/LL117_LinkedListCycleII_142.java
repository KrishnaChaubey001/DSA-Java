package DSA.LinkedList;
/*
Question:
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
Input:
        3 -> 2 -> 0 -> -4
             ^         |
             |_________|
        1 -> 2 -> null
        1 -> 2 -> 3 -> 4 -> null
Example 1:
Output:
Node with value 2
Explanation:
The last node connects back to the node with value 2, so the cycle begins there.
Example 2:
Output:
null
Explanation:
The linked list does not contain a cycle.
Example 3:
Output:
null
Explanation:
The linked list ends at null.
--------------------------------------------------
*/

public class LL117_LinkedListCycleII_142 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode slowAndFastpointer_hasCycle(ListNode head) {

        ListNode slow=head;

        ListNode fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    static void display(ListNode head){
        if (head!=null){
            System.out.println(head.val);
        }else{
            System.out.println("null");

        }
    }


        public static void main(String[] args) {
            ListNode head=new ListNode(3);
            head.next=new ListNode(2);
            head.next.next=new ListNode(0);
            head.next.next.next=head.next;
            ListNode result =slowAndFastpointer_hasCycle(head);
            display(result);
            ListNode result1=slowAndFastpointer_hasCycle(head);
            display(result1);

        }

    }



