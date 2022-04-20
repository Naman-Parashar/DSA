package Graph.EMP;
public class LinkList {

     Node head=null;
     Node tail;
     int size = 0;

    public  int count(){
        Node temp = head;
        int c =0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    public  void insertAtBegning(int empId , String name , int sal){
        Node n1 = new Node( empId , name , sal);
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

    public void insertAtEnd(int empId , String name , int sal){
        Node n1 = new Node( empId , name , sal);
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

    public void disp(){
        if (head == null){
            System.out.println("No Element");
        }
        else {
            Node temp = head;
            while (temp != null){
                temp.e.displayEmp();
                System.out.println();
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }
    public static void main(String[] args) {
        LinkList l = new LinkList();
        l.insertAtEnd(1,"a",1000);
        l.insertAtEnd(2,"b",2000);
        l.insertAtEnd(3,"c",3000);
        l.insertAtEnd(4,"d",4000);
        l.insertAtEnd(5,"e",5000);

        l.disp();
    }
}
