package LinkedList;

import java.util.Scanner;

class Node6 {
    private static Node6 head;
    private int data;
    private Node6 next;

    Node6(int data) {
        this.data = data;
    }
    public static void create() {
        head = new Node6(10);
        Node6 n2 = new Node6(20);
        Node6 n3 = new Node6(30);
        Node6 n4 = new Node6(40);
        Node6 n5 = new Node6(50);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
    }
    public static int count() {
        int c = 0;
        Node6 temp = head;
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

    public static void delete(int pos){ //  without using count.
        if (head == null)
            System.out.println("No Element");
        else {
           Node6 temp= head;
            for (int i = 1; i <pos ; i++) {
                temp= temp.next;
            }
            Node6 temp2 = head;
            for (int i = 1; i <pos-1 ; i++) {
                temp2=temp2.next;
            }
            temp2.next =temp.next;
            temp.next=null;
        }
    }
//**************************  efficient method  ****************************
    public static void delete2(int pos){ //  without using count.
        if (head == null)
            System.out.println("No Element");
        else {
            Node6 temp= head;
            for (int i = 1; i <pos-1 ; i++) {
                temp= temp.next;
            }
            Node6 posi = temp.next;
            temp.next =posi.next;
        }
    }
//******************************************************************************
    public static void display(){
        if (head==null){
            System.out.println("NO Element");
        }
        else {
            Node6 temp = head;
            while (temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }
}
public class DeleteElementAtGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node6.create();
        System.out.println("********* Before ********");
        Node6.display();
        System.out.println();
        System.out.println("Enter the position of element you want to delete");
        int pos= sc.nextInt();
        Node6.delete2(pos);
        System.out.println("********* After **********");
        Node6.display();
    }
}
