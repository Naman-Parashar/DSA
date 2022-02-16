package LinkedList;
class Node3 {
    private static Node3 head;
    private int data;
    private Node3 next;

    Node3(int data) {
        this.data = data;
    }
    public static void create() {
        head = new Node3(10);
        Node3 n2 = new Node3(20);
        Node3 n3 = new Node3(30);
        Node3 n4 = new Node3(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
    public static void add(int n){
        Node3 n1= new Node3(n);
        if (head == null)
            head = n1;
        else {
            Node3 te= head;
            while (te.next != null)
            {
                te = te.next;
            }
            te.next =n1;
        }

    }
    public static void display(){
        if (head==null){
            System.out.println("NO Element");
        }
        else {
            Node3 temp = head;
            while (temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }
}
public class AddingElementAtEnd {
    public static void main(String[] args) {
        Node3.create();
        Node3.add(55);
        Node3.display();
    }
}
