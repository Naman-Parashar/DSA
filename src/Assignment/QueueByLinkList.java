package Assignment;
class Node{
    String data;
    Node next;
    public Node(String  data){
        this.data = data;
    }
}
public class QueueByLinkList {
    Node front , rear;
    public void enQueue(String data){
        Node n1 = new Node(data);
        if (front == null && rear == null){
            front = rear = n1;
        }
        else {
            rear.next = n1;
            rear = n1;
        }
    }

    public static void main(String[] args) {
        int temp, s = 0, j = 1;
//        if (args.length > 3){
//            System.out.println("Only Pass 3 Argument");
//        }
        // else {
        //   for (int i = 0; i < args.length; i++) {
        //     int a = Integer.parseInt(args[i]);
        int a = 12345;
        int g = -1,f=0;
        while (g != 0) {
            g = a;
            j = j * 10;
            g = g / j;
            temp = g;
            while (temp != 0) {
                f = temp % 10;
                s = s + f;
                temp = temp / 10;
            }
        }
        //  }
        //}
        System.out.println(s);
    }
}
