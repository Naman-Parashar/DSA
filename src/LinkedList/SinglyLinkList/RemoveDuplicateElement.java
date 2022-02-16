package LinkedList.SinglyLinkList;

class Node9 {
    private static Node9 head;
    private int data;
    private Node9 next;

    Node9(int data) {
        this.data = data;
    }

    public static void create() {
        head = new Node9(20);
        Node9 n2 = new Node9(20);
        Node9 n3 = new Node9(20);
        Node9 n4 = new Node9(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
    }

    public static void removeD(){
        if (head == null)
            System.out.println("No Element");
        else {
            Node9 current = head;
           while (current != null && current.next != null){
               if (current.data == current.next.data){
                   current.next = current.next.next;
               }
               else {
                   current = current.next;
               }
           }
        }
    }

    public static void display(){
        if (head==null){
            System.out.println("NO Element");
        }
        else {
            Node9 temp = head;
            while (temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }

}
public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Node9.create();
        Node9.removeD();
        Node9.display();
    }
}
