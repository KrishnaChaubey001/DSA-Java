package DSA.LinkedList;
/*
Question:
Given the head of a singly linked list, an integer value, and a position, insert a new node at the given 0-based position.
Input:
        1 -> 2 -> 4 -> null
        int value = 3;
        int position = 2;
        10 -> 30 -> null
        int value1 = 20;
        int position1 = 1;
        1 -> 2 -> null
        int value2 = 0;
        int position2 = 0;
Example 1:
Output:
1 -> 2 -> 3 -> 4 -> null
Explanation:
The value 3 is inserted at index 2.
Example 2:
Output:
10 -> 20 -> 30 -> null
Explanation:
The value 20 is inserted between 10 and 30.
Example 3:
Output:
0 -> 1 -> 2 -> null
Explanation:
Position 0 means inserting the new node at the beginning.
--------------------------------------------------
*/
public class LL109_InsertAtPosition {
     class Node {
         int data;
         Node next;
         Node(int data){
             this.data=data;
             this.next=null;
         }
     }
     Node head=null;
     Node insertAtEnd(int idx,int data){
         Node temp=new Node(data);
         if(idx<0 ){
             System.out.println("Invalid Index");
             return head;
         }
         if(idx==0){
             temp.next=head;
             head=temp;
             return head;
         }
         Node current=head;
         for(int i=0;i<idx-1  ;i++){
             if(current==null){
                 System.out.println("Invalid index");
                 return head;
             }
             current=current.next;
         }
         if (current == null) {
             System.out.println("Invalid Index");
             return head;
         }
         temp.next=current.next;
         current.next=temp;
         return head;
     }
     void  display(){
         Node current = head;
         while(current!=null){
             System.out.print(current.data+" ");
             current=current.next;
         }
         System.out.println();
     }

    public static void main(String[] args) {
        LL109_InsertAtPosition ll=new LL109_InsertAtPosition();
        ll.insertAtEnd(0,10);
        ll.insertAtEnd(0,11);
        ll.insertAtEnd(0,12);
        ll.insertAtEnd(3,13);
        ll.insertAtEnd(04,14);
        ll.insertAtEnd(5,15);
        ll.insertAtEnd(6,16);
        ll.insertAtEnd(7,18);


        ll.display();

    }
}
