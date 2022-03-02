package LinkedList.SinglyLinkList;

import java.util.Scanner;

class Node10 {
    int data;
    Node10 next;
    static Node10 head;

    Node10(int data) {
        this.data = data;
    }

    public static void create() {
        head = new Node10(10);
        Node10 n2 = new Node10(20);
//        Node10 n3 = new Node10(30);
//        Node10 n4 = new Node10(40);
//        Node10 n5 = new Node10(50);
//        Node10 n6 = new Node10(50);
     //   Node10 n7 = new Node10(50);

        head.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
//        n6.next = n7;
    }

    public static void middele() {
        Node10 temp = head;
        Node10 temp2 = head;
        while (temp2 != null  && temp2.next != null ){
            temp = temp.next;
            temp2 = temp2.next.next;
        }
        System.out.println(temp.data);
    }

}
public class MiddleNode {
    public static void main(String[] args){
        Node10.create();
        Node10.middele();
    }
}
