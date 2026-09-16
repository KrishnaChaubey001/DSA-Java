package DSA.LinkedList;
/*
Question:
Given the head of a linked list and an integer n, remove the nth node from the end of the linked list and return its head.
Input:
        1 -> 2 -> 3 -> 4 -> 5 -> null
        int n = 2;
        1 -> null
        int n1 = 1;
        1 -> 2 -> null
        int n2 = 1;
Example 1:
Output:
1 -> 2 -> 3 -> 5 -> null
Explanation:
The 2nd node from the end is 4, so it is removed.
Example 2:
Output:
null
Explanation:
The only node is removed.
Example 3:
Output:
1 -> null
Explanation:
The last node is removed.
--------------------------------------------------
*/
public class LL115_RemoveNthNodeFromEnd_19 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    int count(Node head){
        Node current= head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    Node head=null;
    Node deleteNthNodeFromEnd(int n){
        if(head.next==null){
            head=null;
            return head;
        }
        int m=count(head);
        if(m==n){
            head=head.next;
            return head;
        }
        Node current=head;
        for(int i=0;i<m-n-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
        return head;
    }

    void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL115_RemoveNthNodeFromEnd_19 ll=new LL115_RemoveNthNodeFromEnd_19();
        Node first=ll.new Node(10);
        Node second=ll.new Node(20);
        Node third=ll.new Node(30);
        Node fourth=ll.new Node(40);
        Node fifth=ll.new Node(50);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        ll.head=first;
        ll.display();
        ll.deleteNthNodeFromEnd(5);
        ll.display();
    }


}
