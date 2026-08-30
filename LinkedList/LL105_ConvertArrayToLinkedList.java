package DSA.LinkedList;
/*
Question:
Given an integer array nums, create a singly linked list containing all elements of the array in the same order and return the head of the linked list.
Input:
        int[] nums = {1,2,3,4};
        int[] nums1 = {10,20,30};
        int[] nums2 = {5};
Example 1:
Output:
1 -> 2 -> 3 -> 4 -> null
Explanation:
Each element of the array becomes a node, and every node is connected to the next node.
Example 2:
Output:
10 -> 20 -> 30 -> null
Explanation:
The elements are converted into nodes in the same order.
Example 3:
Output:
5 -> null
Explanation:
A single array element becomes a single linked list node.
--------------------------------------------------
*/
public class LL105_ConvertArrayToLinkedList {
     static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node convertArr2LL(int arr[]){
        Node head=new Node(arr[0]);
        Node current=head;
        for(int i=1;i<arr.length;i++){
             Node temp= new Node(arr[i]);
             current.next=temp;
             current=temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Node head = convertArr2LL(arr);

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

}
