package Tree;

import Tree.BST.BST_ByLinkedList_Recurssion;
import java.util.LinkedList;
import java.util.Queue;

 class Node7 {
    public int data;
    Node7 left;
   Node7 right;
    Node7(int data){
        this.data = data;
    }
}

public class Level_Oder_Line_By_Line {
    public static Node7 insert2(Node7 root, int data) {
        Node7 n = new Node7(data);
        if (root == null) {
            root = n;
            return root;
        } else {
            Node7 temp = root;
            if (data < temp.data) {
                temp.left = insert2(root.left,data);
            }
            if (data > temp.data) {
                temp.right = insert2(root.right,data);
            }
            return root;
        }
    }

    public static void prin(Node7 root){
        if (root == null) return;

        Queue<Node7> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (q.size() > 1){
            Node7 temp = q.poll();
            if (temp == null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(temp.data+"  ");
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
        }

    }

    public static void prin2(Node7 root){
        if (root == null) return;

        Queue<Node7> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node7 temp = q.poll();
                System.out.print(temp.data+" ");
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {30,20,50,25,35,40,10};
        Node7 root2 = insert2(null,arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insert2(root2,arr[i]);
        }
        prin2(root2);
    }
}
