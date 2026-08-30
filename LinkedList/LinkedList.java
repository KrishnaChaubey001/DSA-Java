package DSA.LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public  class LinkedList {
    Node head=null;
    Node tail=null;
    // printing the linked list...
    void display(){
        Node current= head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }
    // returning the size of array...
    int size(){
        Node current= head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    // Inserting an element at end...
    Node insertAtEnd(int data){
        Node current=new Node(data);
        if(head==null){
            head=current;
        }else{
            tail.next=current;
        }
        tail=current;
        return head;
    }
    // Insert at  beginning...
    Node insertAtStart(int data){
        Node current=new Node(data);
        if(head==null){
            insertAtEnd(data);
        }
        else{
            current.next=head;
            head=current;
        }
        return head;
    }
    // INsert at any index ...
    Node insertAt(int idx,int data){
        if (idx < 0 || idx > size()) {
            System.out.println("Invalid index");
            return head;
        }
        Node temp = new Node(data);
        Node current=head;
        if(idx==0){
           return  insertAtStart(data);
        }else if(idx==size()){
           return  insertAtEnd(data);
        }else {
            for(int i=0;i<idx-1;i++){
                current=current.next;
            }
            temp.next=current.next;
            current.next=temp;
        }
        return head;

    }
    // Delete the first node ...
    Node deleteHead(){
        if(head==null){
            return null;
        }else if(head.next==null){
            head=null;
            tail=null;
        }else{
            head=head.next;
        }
        return head;
    }
    // delete the LAst node...
    Node deleteLastNode(){
        if(tail==null){
            return null;
        }
        if(head.next==null){
            head=null;
            tail=null;
            return head;
        }
            Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
            tail = current;
            tail.next = null;

        return head;
    }

    // Delete node at specific index...
    Node deleteAtIndex(int idx){
        if (idx < 0 || idx >= size()) {
            System.out.println("Invalid index");
            return head;
        }

        if (idx == 0) {
            return deleteHead();
        }

        if (idx == size() - 1) {
            return deleteLastNode();
        }
        Node current=head;
        for(int i=0;i<idx-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
        return head;
    }


    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(11);
        ll.insertAtEnd(12);
        ll.insertAtEnd(13);
        ll.insertAtEnd(14);

        ll.display();
        System.out.println(ll.size());
        ll.insertAtEnd(15);
        ll.display();
        System.out.println(ll.size());
        ll.insertAtStart(5);
        ll.display();
        ll.insertAt(3,30);
        ll.display();
        ll.insertAt(10,1);
        ll.display();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        ll.deleteHead();
        ll.display();
        System.out.println(ll.head.data);
        ll.deleteLastNode();
        ll.display();
        System.out.println(ll.tail.data);

        ll.deleteAtIndex(3);
        ll.display();

    }

}
