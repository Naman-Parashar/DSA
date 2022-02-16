package LinkedList;

public class PrintData {
    static Node head;
    static class Node {
        private int data;  //generic type
        private Node next;

        Node(int data) {
            this.data = data;
            next = null;  // optional
        }
    }

    public static void display(){
        if (head==null){
            System.out.println("NO Element");
        }
        else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }

//    public void display(){
//        if (head==null){
//            System.out.println("NO Element");
//        }
//        else {
//            Node temp = head;
//            while (temp != null){     //while (temp.next != null) if we write this then it will print one less element.
//                System.out.println(temp.data);
//                temp=temp.next;
//            }
//        }
//    }
//

    public static void main(String[] args) {
        PrintData pd = new PrintData();
        head = new Node(10);    // head is pointing to first node
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        // Now we will connect them together to form a chain
        head.next=n2; //10-->20
        n2.next=n3; // 10--> 20 --> 30
        n3.next=n4; // 10--> 20 --> 30 --> 40 --> null

       display();

    }
}
