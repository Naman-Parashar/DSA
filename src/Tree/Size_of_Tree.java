package Tree;


class Node9 {
    int data;
    Node9 left;
    Node9 right;
    Node9(int data){
        this.data = data;
    }
}

public class Size_of_Tree {

    public static Node9 insert8(Node9 root, int data) {
        Node9 n = new Node9(data);
        if (root == null) {
            root = n;
            return root;
        } else {
            Node9 temp = root;
            if (data < temp.data) {
                temp.left = insert8(root.left,data);
            }
            if (data > temp.data) {
                temp.right = insert8(root.right,data);
            }
            return root;
        }
    }
   static int c =0;
    public static int size(Node9 root){
        if (root == null) return 0;
        else {
            c++;
            size(root.left);
            size(root.right);
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[] = {30,20,50,25,35,40,10};
        Node9 root2 = insert8(null,arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insert8(root2,arr[i]);
        }

        System.out.println(size(root2));
    }
}
