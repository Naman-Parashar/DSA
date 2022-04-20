package Graph.EMP;

class Node {
    int data;
    Node next;

    @Override
    public String toString() {
        return data+"";
    }

    public Node(int data){
        this.data = data;
        next = null;
    }
}
public class LinkList {

    static Node head=null;
    static Node tail;
    static int size = 0;

    public static int count(){
        Node temp = head;
        int c =0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static int countt(Node n){
        if (n==null)
            return 0;
        else
            return 1 + countt(n.next);
    }

    public static void insertAtBegning(int data){
        Node n1 = new Node(data);
        if (head == null){
            head = n1;
            tail = n1;
        }
        else {
            n1.next = head;
            head = n1;
        }
        size++;
    }

    public static void insertAtEnd(int data){
        Node n1 = new Node(data);
        if (head == null){
            head =n1;
            tail = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
        }
        size++;
    }

    public static void insertAtPos(int data , int pos){
        Node temp = head;
        Node n1 = new Node(data);
        if (head == null || pos == 0 || pos ==1)
           insertAtBegning(data);
        else if (pos > count())
            insertAtEnd(data);
        else{
            for (int i = 1; i < pos-1; i++) {
                temp = temp.next;
            }
            n1.next = temp.next;
            temp.next = n1;
        }
        size++;
    }

    public static void insertAtPos(Node n , int pos){
        Node temp = head;
        if (head == null || pos == 0 || pos ==1)
            insertAtBegning(n.data);
        else if (pos > count())
            insertAtEnd(n.data);
        else {
            for (int i = 1; i < pos-1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
        size++;
    }

    public static Node deleteAtBegening(){
        if (head == null){
            return head;
        }
        else{
            Node temp = head;
            head = head.next;
            size--;
            return temp;
        }
    }

    public static Node deleteAtEnd(){
        if (head == null){
            return head;
        }
        else{
            Node temp = tail;
            tail = head;
            while (tail.next.next != null)
                tail = tail.next;
            tail.next=null;
            size--;
            return temp;
        }
    }

    public static Node deleteAtPos(int pos) {
        if (head == null)
            return head;
        else   if (pos == 0 || pos == 1)
            return deleteAtBegening();
        else if (pos > count())
            return deleteAtEnd();
        else {
            Node temp = head, t;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            t = temp.next;
            temp.next = temp.next.next;
            size--;
            return t;
        }
    }

    public static Node deleteAtPoss(int data) {
        if (head == null)
            return head;
        else {
            Node temp = head, p = null;
            if (head.data == data) {
                p =head;
                head = head.next;
            }
            else {
                while (temp != null) {
                    if (temp.next == null)
                        break;
                    else {
                        if (temp.next.data == data) {
                            p = temp.next;
                            temp.next = temp.next.next;
                            break;
                        }
                    }
                    temp = temp.next;
                }
            }
            return p;
        }
    }

    public static Node deleteAtPosition(Node n){
        Node temp = head , p = null;
        if (head == null)
            return head;
        else {
            if (n.data == head.data){
                p=head;
                head =head.next;
            }
            else {
                while (temp != null) {
                    if (temp.next == null)
                        break;
                    else {
                        if (n.data == temp.next.data) {
                            p = temp.next;
                            temp.next = temp.next.next;
                            break;
                        }
                    }
                    temp = temp.next;
                }
            }
            return p;
        }
    }

    public static boolean search(int data){
        if (head == null)
            return false;
        else {
            Node temp = head;
            while (temp != null)
            {
                if (data == temp.data)
                    return true;
                temp = temp.next;
            }
            return false;
        }
    }

    public static int searchPos(int data){
        int s=-0;
        if (head == null)
            return -1;
        else {
            Node temp = head;
            while (temp != null)
            {
                s++;
                if (data == temp.data)
                    return s;
                temp = temp.next;
            }
            return -1;
        }
    }

    public static boolean search(Node n){
        if (head == null)
            return false;
        else {
            Node temp = head;
            while (temp != null)
            {
                if (n.data == temp.data)
                    return true;
                temp = temp.next;
            }
            return false;
        }
    }

    public static int searchPos(Node n){
        int s=0;
        if (head == null)
            return -1;
        else {
            Node temp = head;
            while (temp != null)
            {
                s++;
                if (n.data == temp.data)
                    return s;
                temp = temp.next;
            }
            return -1;
        }
    }


    public static void display(){
        if (head == null)
            System.out.println("No Element");
        else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+"--->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }
}
