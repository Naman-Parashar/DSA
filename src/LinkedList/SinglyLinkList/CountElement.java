package LinkedList;
class Node{
    private static Node head;
    private int data;
    private Node next;
    Node(int data){
        this.data=data;
    }
    public static void create(){
        head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        head.next=n2;
        n2.next=n3;
        n3.next=n4;
    }
    public static void count() {
        int c = 0;
        Node temp = head;
        if (head == null) {
            System.out.println("No Element");
        } else {
            while (temp != null) {
                c++;
                temp = temp.next;
            }
            System.out.println(c);
        }
    }
}
public class CountElement {
    public static void main(String[] args) {
       Node.create();
       Node.count();
    }
}
