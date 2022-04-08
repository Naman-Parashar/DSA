package Tree.BST;

import java.lang.reflect.Array;
import java.util.Arrays;

// Replace with sum of greater value
class Node5{
    int data;
    Node5 left;
    Node5 right;
    Node5(int data){
        this.data = data;
    }
}
public class BST_LAB_QUESTION{
   static Node5 root;

    public static Node5 insert(Node5 root,int data) {
        Node5 n = new Node5(data);
        if (root == null) {
            root = n;
            return root;
        } else {
            Node5 temp = root;
            if (data < temp.data) {
                temp.left = insert(root.left,data);
            }
            if (data > temp.data) {
                temp.right = insert(root.right,data);
            }
            return root;
        }
    }

    public static int[] calSum(int[] arr){
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr2.length; i++) {
            int sum = 0;
            for (int j = i + 1; j < arr2.length; j++) {
                sum = sum + arr[j];
            }
            arr2[i] = sum;
        }
        return arr2;
    }
    public static void preOrder(Node5 root,int arr[],int arr2[]){
        if (root == null) return;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == root.data){
                root.data = arr2[i];
                break;
            }
        }
        preOrder(root.left,arr,arr2);
        preOrder(root.right,arr,arr2);
    }

    public static void preOrder2(Node5 root){
        if (root == null) return;
        System.out.print(root.data+" ");
        preOrder2(root.left);
        preOrder2(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {30, 20, 50, 25, 35, 40, 10};
        Node5 root2 = insert(null, arr[0]);
        for (int i = 0; i < arr.length; i++) {
            insert(root2, arr[i]);
        }
        int a[] = calSum(arr);
        preOrder(root2,arr,a);

        preOrder2(root2);


    }
}
