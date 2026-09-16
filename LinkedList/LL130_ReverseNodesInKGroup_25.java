package DSA.LinkedList;
/*
Question:
Given the head of a linked list and an integer k, reverse the nodes of the list k nodes at a time.
If fewer than k nodes remain at the end, leave them unchanged.
Input:
        1 -> 2 -> 3 -> 4 -> 5 -> null
        int k = 2;
        1 -> 2 -> 3 -> 4 -> 5 -> null
        int k1 = 3;
        1 -> 2 -> null
        int k2 = 3;
Example 1:
Output:
2 -> 1 -> 4 -> 3 -> 5 -> null
Explanation:
Each complete group of 2 nodes is reversed.
Example 2:
Output:
3 -> 2 -> 1 -> 4 -> 5 -> null
Explanation:
The first group of 3 nodes is reversed. The remaining 2 nodes are left unchanged.
Example 3:
Output:
1 -> 2 -> null
Explanation:
There are fewer than 3 nodes, so the list remains unchanged.
--------------------------------------------------
*/
public class LL130_ReverseNodesInKGroup_25 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node reverseKGroup(Node head,int k){
        Node curr=head;
        int count=0;
        while(curr!=null && count<k){
            curr=curr.next;
            count++;
        }
        if(count<k) return head;
        curr=head;
        Node prev=null;
        count=0;
        while(count<k){
            Node front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
            count++;
        }
        head.next=reverseKGroup(curr,k);
        return prev;

    }
    static void display(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL130_ReverseNodesInKGroup_25 ll=new LL130_ReverseNodesInKGroup_25();
        Node head=ll.new Node(1);
        head.next=ll.new Node(2);
        head.next.next=ll.new Node(3);
        head.next.next.next=ll.new Node(4);
        head.next.next.next.next=ll.new Node(5);
        head.next.next.next.next.next=ll.new Node(6);
        head.next.next.next.next.next.next=ll.new Node(7);
        head.next.next.next.next.next.next.next=ll.new Node(8);
        int k=3;
        Node result=ll.reverseKGroup(head,k);
        display(result);
    }
}
