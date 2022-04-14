package Tree.Threaded_Binary_Tree;

class Node{
    int data;
    Node left;
    Node right;
    boolean leftThread;
    boolean rightThread;
    Node(int data){
        this.data = data;
    }
}
public class TBT {
    public static void inOrder(Node root){
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static Node leftMost(Node n)
    {
        if (n == null)
            return null;
        while (n.left != null)
            n = n.left;
        return n;
    }

    static void inorder(Node root)
    {
        Node cur = leftMost(root);
        while (cur != null && cur.data != Integer.MIN_VALUE) {
            System.out.printf("%d ", cur.data);
            if (cur.rightThread) cur = cur.right;
            else cur = leftMost(cur.right);
        }
    }



    public static void main(String[] args) {
        Node n1 = new Node(30);
        Node n2 = new Node(40);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;

        Node dummy = new Node(Integer.MIN_VALUE);
        dummy.left = n1;
        dummy.right = dummy;
        dummy.rightThread = true;

        // n2
        n2.rightThread = true;
        n2.right = n1;

        //n4
        n4.rightThread =true;
        n4.right = n2;

        //n3
        n3.rightThread = true;
        n3.right = dummy;

        inorder(dummy);

    }
}
