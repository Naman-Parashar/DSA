package LinkedList;
class Node5 {
    private static Node5 head;
    private int data;
    private Node5 next;

    Node5(int data) {
        this.data = data;
    }
    public static void create() {
        head = new Node5(10);
        Node5 n2 = new Node5(20);
        Node5 n3 = new Node5(30);
        Node5 n4 = new Node5(40);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
    }
    public static int count() {
        int c = 0;
        Node5 temp = head;
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

    public static void delete(int pos){
        if(head == null)
            System.out.println("No Element");
        else {
            Node5 t = head;
            for (int i = 1; i <pos-1 ; i++) {
                t=t.next;
            }
            t.next=null;
        }
    }
    public static void delete(){ //  without using count.
        if (head == null)
            System.out.println("No Element");
        else {
            Node5 temp=head;
            Node5 temp2 = null;
            while (temp.next != null ){
                temp2=temp;
                temp = temp.next;
            }
            temp2.next=null;
        }
    }

    public static void display(){
        if (head==null){
            System.out.println("NO Element");
        }
        else {
            Node5 temp = head;
            while (temp != null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }
}
public class DeleteLastElement {
    public static void main(String[] args) {
        Node5.create();
        System.out.println("********* Before ********");
        Node5.display();
        System.out.println();
        Node5.delete();
        System.out.println("********* After **********");
        Node5.display();
    }
}
