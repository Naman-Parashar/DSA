package Tree.BST;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversing extends BST_ByLinkedList_Recurssion{

    public static void levelOrder(Node3 root){
    if (root == null) return;

        Queue<Node3> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()){
            Node3 temp = q.poll();
            System.out.print(temp.data+" ");
            if (temp.left != null) q.offer(temp.left);
            if (temp.right != null) q.offer(temp.right);
        }
    }


    public static void main(String[] args) {
        int arr[] = {30,20,50,25,35,40,10};
        Node3 root2 = insert(null,arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insert(root2,arr[i]);
        }

        levelOrder(root2);
    }
}
