package Tree.AVL;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}

public class Avl_Tree {

    public static Node insert(Node root, int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
            return root;
        } else {
            Node temp = root;
            if (data < temp.data) {
                temp.left = insert(root.left,data);
            }
            if (data > temp.data) {
                temp.right = insert(root.right,data);
            }
            return root;
        }
    }

    public static void f(Node root){

    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,25};
        Node root2 = insert(null,arr[0]);
        for(int i = 1; i < arr.length; i++) {
            insert(root2,arr[i]);
        }

    }
}
