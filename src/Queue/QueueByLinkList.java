package Queue;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
public class QueueByLinkList {
    static Node front;
    static Node rear;

    public static boolean isEmpty(){
        return front == null;
    }

    public static void enqueue(int data){
        Node n = new Node(data);
        if (isEmpty()){
            front = rear = n;
        }
        else {
            rear.next = n;
            rear = n;
        }
    }

    public static int deQueue(){
        if (isEmpty())
            return -1;
        else {
            int a = front.data;
            front = front.next;
            return a;
        }
    }

    public static int peek(){
        return front.data;
    }

    public static int rear(){
        return rear.data;
    }

    public static void display(){
        Node temp = front;
        while (front != null)
        {
            System.out.print(front.data+"----->");
            front = front.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

      //  System.out.println("Deleted element = "+deQueue() );

        System.out.println("rear = "+rear());
        System.out.println("peek = "+peek());
       // display();
    }
}
