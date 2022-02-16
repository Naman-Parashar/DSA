package LinkedList;//    ************   CREATING A SINGLY LINK LIST  ********************

public class LinkedList2 {
     static Node head;
    static class Node {
        private int data;  //generic type
        private Node next;
        Node(int data) {
            this.data = data;
            next = null;  // optional
        }
    }

    public static void main(String[] args) {
        LinkedList2 n1 = new LinkedList2();
        head = new Node(10);    // head is pointing to first node
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        // Now we will connect them together to form a chain
        head=n2; //10-->20
        n2.next=n3; // 10--> 20 --> 30
        n3.next=n4; // 10--> 20 --> 30 --> 40 --> null

    }
}






