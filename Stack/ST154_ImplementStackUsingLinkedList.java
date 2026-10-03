package DSA.Stack;
/*
Question:
Implement a Stack using a Singly Linked List.
Support the following operations:
1. push(x)
2. pop()
3. peek()
4. isEmpty()
Display the stack after performing the given operations.
Input:
        push(10);
        push(20);
        push(30);
        pop();
        push(40);
        peek();
Example 1:
Output:
        Stack: 40 20 10
        Popped: 30
        Top: 40
Explanation:
        The top of the stack is maintained at the head of the Linked List.
        Therefore, push and pop can be performed efficiently.
Example 2:
Input:
        push(5);
        push(15);
        push(25);
        pop();
        pop();
Output:
        Stack: 5
Explanation:
        25 and 15 are removed first because Stack follows LIFO.
Example 3:
Input:
        pop();
        peek();
Output:
        Stack is Empty
Explanation:
        No element can be removed or viewed when the stack is empty.
--------------------------------------------------
*/
public class ST154_ImplementStackUsingLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    boolean isEmpty(){
        return head==null;
    }
    void push(int val){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int value=head.data;
        head=head.next;
        return value;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        return head.data;
    }
    void display(){
        Node current=head;
        System.out.print("Stack : ");
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        ST154_ImplementStackUsingLinkedList st=new ST154_ImplementStackUsingLinkedList();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        System.out.println("Popped: " + st.pop());
        System.out.println("Top: " + st.peek());

        st.display();

        System.out.println("Is Empty: " + st.isEmpty());

    }
}
