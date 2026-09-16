package DSA.LinkedList;
/*
/Question:
Given the head of a linked list, rotate the list to the right by k places.
Input:
        1 -> 2 -> 3 -> 4 -> 5 -> null
        int k = 2;
        0 -> 1 -> 2 -> null
        int k1 = 4;
        1 -> 2 -> null
        int k2 = 0;
Example 1:
Output:
4 -> 5 -> 1 -> 2 -> 3 -> null
Explanation:
The last two nodes are moved to the beginning.
Example 2:
Output:
2 -> 0 -> 1 -> null
Explanation:
The list is rotated four times, which is equivalent to rotating once because of its length.
Example 3:
Output:
1 -> 2 -> null
Explanation:
A rotation of zero leaves the list unchanged.
--------------------------------------------------
*/
public class LL125_RotateList_61 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    static Node rotateList(Node head,int k){
        if(head==null || k==0)return head;
        Node tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0)return head;
        k=k%len;
        Node newTail=head;
        for(int i=1;i<len-k;i++){
            newTail=newTail.next;
        }
        tail.next=head;
        head=newTail.next;
        newTail.next=null;
        return head;
    }
    static void display(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int k=2;
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        display(rotateList(head,k));
    }

}
