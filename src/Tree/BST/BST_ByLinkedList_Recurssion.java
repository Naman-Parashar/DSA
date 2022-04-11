package Tree.BST;
class Node3{
    public int data;
    Node3 left;
    Node3 right;
    Node3(int data){
        this.data = data;
    }
}
public class BST_ByLinkedList_Recurssion  {

    public static Node3 insert(Node3 root,int data) {
        Node3 n = new Node3(data);
        if (root == null) {
            root = n;
            return root;
        } else {
            Node3 temp = root;
            if (data < temp.data) {
                temp.left = insert(root.left,data);
            }
            if (data > temp.data) {
                temp.right = insert(root.right,data);
            }
            return root;
        }
    }

    public static void preOrder(Node3 root){
        if (root == null) return;
//        if (root.data >=5 && root.data <=20)
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
//        Node3 root2 = insert(null,30);
//        insert(root2,30);
//        insert(root2,20);
//        insert(root2,50);
//        insert(root2,25);
//        insert(root2,35);
//        insert(root2,40);
//        insert(root2,10);
//
//        preOrder(root2);

        int arr[] = {30,20,50,25,35,40,10};
        Node3 root2 = insert(null,arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insert(root2,arr[i]);
        }
        preOrder(root2);
    }
}
