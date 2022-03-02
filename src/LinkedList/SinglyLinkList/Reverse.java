package LinkedList.SinglyLinkList;

import java.lang.reflect.Type;

class Node8 {
    private static Node8 head;
    private int data;
    private Node8 next;

    Node8(int data) {
        this.data = data;
    }

    public static void create() {
        head = new Node8(10);
        Node8 n2 = new Node8(20);
        Node8 n3 = new Node8(30);
        Node8 n4 = new Node8(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
    }

    public static void rev(){
        if (head == null)
            System.out.println("No Element");
        else {
            Node8 current = head;
            Node8 pre = null;
            Node8 next = null;
            while (current != null){
                next = current.next;
                current.next = pre;
                pre =current;
                current=next;
            }
            head = pre;
        }
    }

    public static void display(){
        if (head==null){
            System.out.println("NO Element");
        }
        else {
            Node8 temp = head;
            while (temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }


}
public class Reverse {
    public static void main(String[] args) {
        Node8.create();
        Node8.rev();
        Node8.display();
    }
}
