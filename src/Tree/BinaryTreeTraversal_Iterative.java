package Tree;

public class BinaryTreeTraversal_Iterative {
    static Node2 root;
    static class Node2 {
        int data;
       Node2 left;
       Node2 right;

        public Node2(int data) {
            this.data = data;
        }
        Node2(){
            root = null;
        }
    }

    public static void preOrder(Node2 root){

    }

    public static void inOrder(Node2 root){

    }

    public static void postOrder(Node2 root){

    }

    public static void main(String[] args) {
        Node2 root = new Node2(1);
        root.left= new Node2(2);
        root.right= new Node2(3);
        root.left.right = new Node2(4);
        root.left.left = new Node2(6);
        root.right.right = new Node2(7);
        root.right.left = new Node2(8);

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);


    }
}
