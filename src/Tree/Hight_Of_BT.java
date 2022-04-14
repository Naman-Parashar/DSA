package Tree;

import java.util.LinkedList;

class Node5 {
    int data;
    Node9 left;
    Node9 right;
    Node5(int data){
        this.data = data;
    }
}
public class Hight_Of_BT {

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

    public static int height(Node9 root){
         if (root == null) return 0;
         else return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String[] args) {
        int arr[] = {30,20,50,25,35,40,10};
        Node9 root2 = insert(null,arr[0]);
        for(int i = 1; i < arr.length; i++) {
            insert(root2,arr[i]);
        }
        LinkedList<Integer> l = new LinkedList<>();
        l.get(0);
        System.out.println(height(root2));
    }
}
