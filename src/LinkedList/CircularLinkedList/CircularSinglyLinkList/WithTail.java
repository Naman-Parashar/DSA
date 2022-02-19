package LinkedList.CircularLinkedList.CircularSinglyLinkList;

class CNode{
    int data;
    CNode next;
    public CNode(int data)
    {
        this.data = data;
        next = null;
    }
}
public class WithTail {
    public static CNode head;
    public static CNode tail;

    public static int coun(){
        CNode temp = head;
        int c =0;
        while (temp.next != head) {
            c++;
            temp = temp.next;
        }
        return c+1;
    }

    public static void insertAtBegning(int data){
        CNode n1 = new CNode(data);
        if (head == null)
        {
            head = n1;
            tail = n1;
            head.next = n1;
        }
        else {
            n1.next = head;
            tail.next = n1;
            head=n1;
        }
    }

    public static void insertAtEnd(int data){
        CNode n1 = new CNode(data);
        if (head == null){
            head=n1;
            tail= n1;
            head.next = n1;
        }
        else {
            tail.next = n1;
            tail = n1;
            tail.next = head;

        }
    }

    public static void insertAtPos(int data , int pos)
    {
        CNode n1 = new CNode(data);
        if (pos == 0 || pos == 1  || head == null)
            insertAtBegning(data);
        else if (pos > coun())
            insertAtEnd(data);
        else {
            CNode temp = head;
            for (int i = 1; i <pos -1 ; i++) {
                temp = temp.next;
            }
            n1.next= temp.next;
            temp.next =n1;
        }
    }

    public static void insertAtPos(CNode n1 , int pos){
        CNode temp = head;
        for (int i = 1; i < pos-1; i++)
            temp = temp.next;
        if(head == null || pos == 0 || pos == 1)
            insertAtBegning(n1.data);
        else if (pos > coun())
            insertAtEnd(n1.data);
        else {
            n1.next = temp.next;
            temp.next = n1;
        }
    }

    public static int deleteAtBegning(){
        if (head == null)
            return -1;
        else if (head.next == head){
            int t = head.data;
            head = null;
            return t;
        }
        else {
            int t = head.data;
            head = head.next;
            tail.next = head;
            return t;
        }
    }

    public static int deleteAtEnd(){
        if (head == null)
            return -1;
        else if (head.next == head){
            int t = head.data;
            head = null;
            return t;
        }
        else {
            CNode temp = head;
            int t = tail.data;
            while (temp.next.next != head)
                temp = temp.next;
            temp.next = head;
            tail = temp;
            return t;
        }
    }

    public static int deleteAtPosition(int pos){
        if (pos == 0 || pos == 1 || head == null)
           return deleteAtBegning();
        else if (pos >= coun())
            return deleteAtEnd();
        else {
            CNode temp = head;
            for (int i = 1; i < pos-1; i++) {
                temp = temp.next;
            }
            int t = temp.next.data;
            temp.next = temp.next.next;
            return t;
        }
    }

    public static int deleteAtPos(int data){
        int c = 1;
        CNode temp = head;
        while (temp.next != head){
            if (temp.data == data)
                break;
            c++;
            temp=temp.next;
        }
        return c;
//        if (head == null){
//            return -1;
//        }
//        else if (head.next == head){
//            if (head.data == data) {
//                int t = head.data;
//                head = null;
//                return t;
//            }
//            else
//                return -1;
//        }
//        else {
//            CNode temp = head;
//            while (temp.next != head){
//                if (temp.data == data){
//                    int t = temp.data;
//                    temp.next = temp.next.next;
//                    return t;
//                }
//                temp=temp.next;
//            }
//            if (temp.data == data)
//                return deleteAtEnd();
//            return -1;
//        }
    }


    public static void display(){
        if (head == null)
            System.out.println("No Element");
        else {
            CNode temp = head;
            while (temp.next != head){
                System.out.print(temp.data+"--->");
                temp = temp.next;
            }
            System.out.print(temp.data+"--->");
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        insertAtBegning(50);
        insertAtBegning(40);
        insertAtBegning(30);
        insertAtBegning(20);
        insertAtBegning(10);

//        insertAtEnd(22);

//        insertAtEnd(33);
//        insertAtEnd(33);
//        insertAtEnd(44);

//        insertAtPos(999,4);

//        insertAtPos(new CNode(8787),2);


//        System.out.println(deleteAtBegning());

//        System.out.println(deleteAtEnd());


     //   System.out.println(deleteAtPosition(3));

        System.out.println(deleteAtPos(60));


        display();
      //  System.out.println(coun());
    }

}
