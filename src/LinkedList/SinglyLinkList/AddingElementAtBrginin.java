package LinkedList;
class Node1 {
    private static Node1 head;
    private int data;
    private Node1 next;

    Node1(int data) {
        this.data = data;
    }
    public static void create() {
        head = new Node1(10);
        Node1 n2 = new Node1(20);
        Node1 n3 = new Node1(30);
        Node1 n4 = new Node1(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
    public static void add(int n){
          Node1 n1= new Node1(n);
          n1.next=head;
          head = n1;

    }
    public static void display(){
        if (head==null){
            System.out.println("NO Element");
        }
        else {
            Node1 temp = head;
            while (temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }
}
public class AddingElementAtBrginin {
    public static void main(String[] args) {
        Node1.create();
        Node1.add(25);
        Node1.display();
    }
}
