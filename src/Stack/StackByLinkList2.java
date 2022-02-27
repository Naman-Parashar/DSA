package Stack;
class Node2 {
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        next= null;
    }
}

public class StackByLinkList2 {
    static Node2 top;
    public static boolean isEmpty(){
        return top == null;
    }

    public static void push(int data){
        Node2 n = new Node2(data);
        if (isEmpty())
            top = n;
        else {
            n.next = top;
            top = n;
        }
    }

    public static int pop(){
        if (isEmpty())
            return  -1;
        else {
            int q = top.data;
            top = top.next;
            return q;
        }
    }

    public static int peek(){
        return top.data;
    }

    public static void display(){
        Node2 t = top;
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


        System.out.println("poped element === "+pop());
        System.out.println("poped element === "+pop());
        System.out.println("poped element === "+pop());

        System.out.println("top  = "+peek());


        display();
    }
}
