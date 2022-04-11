package Tree;
class Node2 {
    int data;
    Node9 left;
    Node9 right;
    Node2(int data){
        this.data = data;
    }
}
public interface Print_Node_At_Distance_K {
    public static Node9 insert(Node9 root, int data) {
        Node9 n = new Node9(data);
        if (root == null) {
            root = n;
            return root;
        } else {
            Node9 temp = root;
            if (data < temp.data) {
                temp.left = insert(root.left,data);
            }
            if (data > temp.data) {
                temp.right = insert(root.right,data);
            }
            return root;
        }
    }

    public static void printnode(Node9 root, int k){
        if (root == null) return;
        if (k == 0) {
            System.out.println(root.data);
        }
        else {
            printnode(root.left,k-1);
            printnode(root.right,k-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {30,20,50,25,35,40,10};
        Node9 root2 = insert(null,arr[0]);
        for(int i = 1; i < arr.length; i++) {
            insert(root2,arr[i]);
        }
        printnode(root2,2);
    }
}
