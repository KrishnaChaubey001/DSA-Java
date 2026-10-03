package DSA.Stack;
/*
Question:
Implement a Stack using an array.
Support the following operations:
1. push(x)
2. pop()
3. peek()
4. isEmpty()
5. isFull()
The stack must follow the LIFO (Last In, First Out) principle.
Handle both overflow and underflow conditions.
Input:
        Stack capacity = 5
        push(10);
        push(20);
        push(30);
        pop();
        push(40);
        peek();
Example 1:
Output:
        Popped: 30
        Top: 40
Explanation:
        30 was the top element and was removed.
        40 was then pushed and became the new top.
Example 2:
Input:
        Stack capacity = 3
        push(10);
        push(20);
        push(30);
        push(40);
Output:
        Stack Overflow
Explanation:
        The stack has reached its maximum capacity of 3.
Example 3:
Input:
        Stack capacity = 3
        pop();
Output:
        Stack Underflow
Explanation:
        The stack is empty, so no element can be removed.
--------------------------------------------------
*/
public class ST153_ImplementStackUsingArray {
    int stack[];
    int top;
    ST153_ImplementStackUsingArray(int size){
        stack=new int[size];
        top=-1;
    }
    boolean isFull(){
        return (top == stack.length-1);
    }
    boolean isEmpty(){
        return (top==-1);
    }
    void push(int value){
        if(isFull()){
            System.out.println("Stack OverFlow");
            return ;
        }
        stack[++top]=value;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is UnderFlow");
            return -1;
        }
        return stack[top--];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack : ");
        for (int i =0;i<= top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ST153_ImplementStackUsingArray st=new ST153_ImplementStackUsingArray(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(45);
        st.push(50);
        st.display();
        System.out.println("Popped: " + st.pop());
        System.out.println("Top: " + st.peek());

        st.display();

        System.out.println("Is Empty: " + st.isEmpty());

    }

}
