package LinkedList;
class Node2 {
    private static Node2 head;
    private int data;
    private Node2 next;

    Node2(int data) {
        this.data = data;
    }
    public static void create() {
        head = new Node2(10);
        Node2 n2 = new Node2(20);
        Node2 n3 = new Node2(30);
        Node2 n4 = new Node2(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
    public static void delete(){
        if(head == null)
            System.out.println("No Element");
        else {
           Node2 t = head;
            System.out.println("Node Deleted = "+ t.data);
           head = head.next;
           t=null;
        }
    }
    public static void display(){
        if (head==null){
            System.out.println("NO Element");
        }
        else {
            Node2 temp = head;
            while (temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }
}
public class DeleteFirstElement {
    public static void main(String[] args) {
        Node2.create();
        Node2.delete();
        Node2.display();
    }

}
