package Stack;
class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
}

public class StackByLinkList {
    static Node head;
    static  Node top;
    public static boolean isEmpty(){
        return head == null;
    }

    public static void push(int data){
        Node n = new Node(data);
        if (isEmpty()){
            head = n;
            top= n;
        }
        else {
            top.next = n;
            top = n;
        }
    }

    public static int pop(){
        if (isEmpty())
            return -1;
        else {
            Node t = head;
            while (t.next.next != null){
                t=t.next;
            }
            int q = t.next.data;
            top = t;
            t.next = null;
            return q;
        }
    }

    public static int peek(){
        return top.data;
    }

    public  static void display2(){
        Node t = head;
        while (t != null){
            System.out.println(t.data);
            t = t.next;
        }
        System.out.printf("null");
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);

        System.out.println("poped element === "+pop());
        System.out.println("poped element === "+pop());
        System.out.println("poped element === "+pop());

        System.out.println("top  = "+peek());

        display2();
    }
}
