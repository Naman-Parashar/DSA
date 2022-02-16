package LinkedList.SinglyLinkList;

import java.util.Scanner;

class Node4 {
    private static Node4 head;
    private int data;
    private Node4 next;

    Node4(int data) {
        this.data = data;
    }

    public static void create() {
        head = new Node4(10);
        Node4 n2 = new Node4(20);
        Node4 n3 = new Node4(30);
        Node4 n4 = new Node4(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
    }

    public static void addend(int n){
        Node4 n1= new Node4(n);
        if (head == null)
            head = n1;
        else {
            Node4 te= head;
            while (te.next != null)
            {
                te = te.next;
            }
            te.next =n1;
        }

    }

    public static void addbeg(int n){
        Node4 n1= new Node4(n);
        n1.next=head;
        head = n1;
    }

    public static void addAtPos(int pos,Node4 n){
        Node4 temp= head;
        for (int i = 1; i <pos-1 ; i++) {
            temp = temp.next;
        }
        n.next=temp.next;
        temp.next = n;
    }

    public static int count() {
        int c = 0;
        Node4 temp = head;
        if (head == null) {
            return 0;
        } else {
            while (temp != null) {
                c++;
                temp = temp.next;
            }
           return c;
        }
    }

    public static void display(){
        if (head==null){
            System.out.println("NO Element");
        }
        else {
            Node4 temp = head;
            while (temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }

}
public class AddingElementAtSpecificPosition {
    public static void main(String[] args) {
        Node4.create();
        int c = Node4.count();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Position :: ");
        int pos = sc.nextInt();

        System.out.println("Enter the Node data");
        int dat = sc.nextInt();

        Node4 nn = new Node4(dat);

        if (pos <= 1){
            Node4.addbeg(dat);
            System.out.println("Data is added at beginning");
            Node4.display();
        }
        else if (pos >= c){
            Node4.addend(dat);
            System.out.println("Data added at end");
            Node4.display();
        }
        else {
            Node4.addAtPos(pos,nn);
            System.out.println("Data added at position");
            Node4.display();
        }

    }
}
