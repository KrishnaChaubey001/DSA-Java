package DSA.LinkedList;

/*
Question:
You are given a linked list where each node contains a next pointer and a random pointer.
Create a deep copy of the linked list and return the head of the copied list.

Input:
7 -> 13 -> 11 -> 10 -> 1 -> null
random pointers may point to another node or null

Example:
Output:
A deep copy of the linked list with the same next and random pointer connections.
*/
public class LL129_CopyListWithRandomPointer_138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    private void insertNode(Node head) {
        Node current = head;

        while (current != null) {
            Node temp = new Node(current.val);
            temp.next = current.next;
            current.next = temp;
            current = current.next.next;
        }
    }

    private void assignRandomPointer(Node head) {
        Node current = head;

        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node dummyNode = new Node(-1);
        Node current = head;
        Node temp = dummyNode;

        insertNode(head);
        assignRandomPointer(head);

        while (current != null) {
            Node copy = current.next;

            // Restore original list
            current.next = copy.next;

            // Build copied list
            temp.next = copy;
            temp = copy;

            current = current.next;
        }

        return dummyNode.next;
    }

    static void display(Node head) {
        Node current = head;

        while (current != null) {
            if (current.random != null) {
                System.out.println("Node: " + current.val +
                        ", Random: " + current.random.val);
            } else {
                System.out.println("Node: " + current.val +
                        ", Random: null");
            }

            current = current.next;
        }
    }

    public static void main(String[] args) {
        LL129_CopyListWithRandomPointer_138 obj =
                new LL129_CopyListWithRandomPointer_138();

        Node node1 = obj.new Node(7);
        Node node2 = obj.new Node(13);
        Node node3 = obj.new Node(11);
        Node node4 = obj.new Node(10);
        Node node5 = obj.new Node(1);

        // Next pointers
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Random pointers
        node1.random = null;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        System.out.println("Original List:");
        display(node1);

        Node copiedHead = obj.copyRandomList(node1);

        System.out.println("\nCopied List:");
        display(copiedHead);

        System.out.println("\nOriginal List After Copy:");
        display(node1);
    }
}