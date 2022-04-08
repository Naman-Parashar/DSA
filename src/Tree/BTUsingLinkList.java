package Tree;

 class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
public class BTUsingLinkList {
    public static void main(String[] args) {
         Node root2 = new Node(1);
       root2.left= new Node(2);
        root2.right= new Node(3);
        root2.left.right = new Node(4);
    }
}

