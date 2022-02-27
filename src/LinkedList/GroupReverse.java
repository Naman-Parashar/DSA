package LinkedList;

class Node88 {
    int data;
    Node88 next;

    @Override
    public String toString() {
        return data+"";
    }

    public Node88(int data){
        this.data = data;
        next = null;
    }
}

public class GroupReverse {
    static Node88 head=null;

    public static int count(){
        Node88 temp = head;
        int c =0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public static void insertAtBegning(int data){
       Node88 n1 = new Node88(data);
        if (head == null){
            head = n1;
        }
        else {
            n1.next = head;
            head = n1;
        }
    }

    public static void display(){
        if (head == null)
            System.out.println("No Element");
        else {
               Node88 temp = head;
            while (temp != null){
                System.out.print(temp.data+"--->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void reverase(){
        Node88 temp =head;
        Node88 temp2 =head;
        int a = head.next.data;
        while (temp.next != null){

        }
    }

    public static void main(String[] args) {
        insertAtBegning(50);
        insertAtBegning(40);
        insertAtBegning(30);
        insertAtBegning(20);
        insertAtBegning(10);

        display();
    }
}
