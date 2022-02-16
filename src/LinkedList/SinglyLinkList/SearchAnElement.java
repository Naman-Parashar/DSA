package LinkedList;
import java.util.Scanner;

class Node7 {
    private static Node7 head;
    private int data;
    private Node7 next;

    Node7(int data) {
        this.data = data;
    }
    public static void create() {
        head = new Node7(10);
        Node7 n2 = new Node7(20);
        Node7 n3 = new Node7(30);
        Node7 n4 = new Node7(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
    public static void search(int ele){
        if(head == null)
            System.out.println("No Element");
        else {
            Node7 t = head;
            int c =1;
            while (t != null) {
                if (t.data == ele) {
                    System.out.println("Element found at " + c + " position");
                    break;
                }
                t=t.next;
                c++;
            }
        }
    }
}

public class SearchAnElement {
    public static void main(String[] args) {
        Node7.create();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to Search");
        int ele = sc.nextInt();
        Node7.search(ele);
    }
}