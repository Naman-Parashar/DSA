package LinkedList;
class Node54 {
    int data;
    Node54 next;
    Node54(int data){
        this.data = data;
    }
}
public class moveZerosInFront {
    public void moveZeroes(Node54 head)
    {
        if (head == null) return;

        Node54 temp = head.next;
        Node54 temp2 = head;
        while (temp != null)
        {
            if (temp.data == 0)
            {
                Node54 curr = temp;
                temp = temp.next;
                temp2.next = temp;
                curr.next = head;
                head = curr;
            }
            else
            {
                temp2 = temp;
                temp = temp.next;
            }

        }
    }
}
