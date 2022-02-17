package LinkedList.DoublyLinkList;

class DNode{
    int data;
    DNode next;
    DNode pre;
    public DNode(int data){
        this.data =data;
        next = pre = null;
    }
}

public class Doubly_LinkList_Without_Tail {
   static DNode head;

    public static int countt(){
        DNode temp = head;
        int c =0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

   public static void insertAtBegning(int data){
       DNode n1 = new DNode(data);
       if (head == null)
           head = n1;
       else {
         n1.next = head;
         head.pre = n1;
         head = n1;
       }
   }

   public static void insertAtEnd(int data){
       DNode n1 = new DNode(data);
       if (head == null){
           head = n1;
       }
        DNode temp = head;
       while (temp.next != null){
           temp = temp.next;
       }
       n1.pre = temp;
       temp.next=n1;
   }

   public static void insertInPosition(int data,int pos){
       DNode n1 = new DNode(data);
       if(head == null)
           head = n1;
       else {
           if (pos == 0 || pos ==1)
               insertAtBegning(data);
           else if (pos > countt())
               insertAtEnd(data);
           else {
               DNode temp = head;
               for (int i = 1; i < pos-1; i++) {
                   temp = temp.next;
               }
               temp.next.pre = n1;
               n1.next = temp.next;
               temp.next = n1;
               n1.pre = temp;
           }
       }
   }

   public static void insertAtPosition(DNode n1 , int p){
        if (head == null)
            head = n1;
        else {
            if (p == 0 || p == 1)
                insertAtBegning(n1.data);
            else if (p > countt())
                insertAtEnd(n1.data);
            else {
                DNode temp = head;
                for (int i = 1; i < p-1; i++) {
                    temp = temp.next;
                }
                temp.next.pre = n1;
                n1.next = temp.next;
                temp.next = n1;
                n1.pre = temp;
            }
        }
   }

   public static int deleteAtBegning() {
       if (head == null)
           return -1;
       else {
           if (head.next == null) {
               int c =head.data;
               head = null;
               return c;
           }
           else {
               DNode temp = head;
               head = head.next;
               head.pre = null;
               return temp.data;
           }
       }
   }

   public static int deleteAtEnd(){
        if (head == null){
            return -1;
        }
        else {
            if (head.next == null){
                int t = head.data;
                head = null;
                return t;
            }
            else {
                DNode temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                int d = temp.next.data;
                temp.next.pre = null;
                temp.next = null;
                return d;
            }
        }
   }

   public static int deleteAtPosition(int pos){
        if (head == null)
            return -1;
        else {
            if (pos == 0 || pos == 1)
                return deleteAtBegning();
            else if (pos >= countt())
                return deleteAtEnd();
            else {
                DNode temp = head;
                for (int i = 1; i < pos-1 ; i++) {
                    temp= temp.next;
                }
                int d = temp.next.data;
                temp.next.pre = null;
                temp.next = temp.next.next;
                temp.next.pre =temp;
                return d;

            }
        }
   }

   public static int deleteAtPositionData(int data){
        DNode temp = head;
      while ( temp.next != null)
          temp = temp.next;

        if (head == null)
            return -1;
        else {
            if (head.data == data)
                return deleteAtBegning();
            else if(temp.data == data)
                return deleteAtEnd();
            else {
                DNode temp2 = head;
                while (temp2.next != null){
                    if (temp2.next.data == data)
                        break;
                    temp2 = temp2.next;

                }
                try {
                    int d = temp2.next.data;
                    temp2.next.pre = null;
                    temp2.next = temp2.next.next;
                    temp2.next.pre = temp2;
                    return d;
                }
                catch (NullPointerException e) {
                    System.out.println("No Element");
                }
                return -1;
            }
        }
   }

   public static int deleteAtPosition(DNode n) {
       if (head == null)
           return -1;
       else {
           DNode temp = head;
           while (temp.next != null)
               temp = temp.next;
           if (head.data == n.data)
               return deleteAtBegning();
           else if (temp.data == n.data)
               return deleteAtEnd();
           else {
               DNode temp2 = head;
               while (temp2.next != null) {
                   if (temp2.next.data == n.data)
                       break;
                   temp2 = temp2.next;
               }
               try {
                   int d = temp2.next.data;
                   temp2.next.pre = null;
                   temp2.next = temp2.next.next;
                   temp2.next.pre =temp2;
                   return d;
               }catch (NullPointerException e){
                   System.out.println("No Element");
               }
           }
           return -1;
       }
   }

    public static boolean search(int data){
        if (head == null)
            return false;
        else {
            DNode temp = head;
            while (temp != null)
            {
                if (data == temp.data)
                    return true;
                temp = temp.next;
            }
            return false;
        }
    }
    public static boolean search(DNode n){
        if (head == null)
            return false;
        else {
            DNode temp = head;
            while (temp != null)
            {
                if (n.data == temp.data)
                    return true;
                temp = temp.next;
            }
            return false;
        }
    }




    public static void display(){
        if (head == null)
            System.out.println("No Element");
        else {
            DNode temp = head;
            while (temp != null){
                System.out.print(temp.data+"--->");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        insertAtBegning(50);
        insertAtBegning(40);
        insertAtBegning(30);
        insertAtBegning(20);
        insertAtBegning(10);

        //insertAtEnd(888);

        //insertInPosition(888,3);

        //insertAtPosition(new DNode(666),5);

      //  System.out.println( deleteAtBegning());

        //System.out.println(deleteAtEnd());

     //   System.out.println(deleteAtPosition(4));
      //
        //  System.out.println(deleteAtPositionData(505));

//        System.out.println(deleteAtPosition(new DNode(40)));

      //  System.out.println(search(40));

      //  System.out.println(search(new DNode(50)));

        display();
    }
}
