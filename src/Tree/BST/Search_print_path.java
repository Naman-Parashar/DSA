package Tree.BST;

import java.util.LinkedList;

//class Node4{
//    int data;
//    Node4 left;
//    Node4 right;
//    Node4(int data){
//        this.data = data;
//    }
//}
public class Search_print_path extends BST_ByLinkedList_Recurssion {

    public static LinkedList path(Node3 root ,int val){
        if (root == null) return null;
        if (val == root.data){
            LinkedList<Integer> obj = new LinkedList<>();
            obj.add(root.data);
            return obj;
        }
        if(val < root.data){
            LinkedList left = path(root.left,val);
            if (left != null){
                left.add(root.data);
            }
            return left;
        }
        if(val > root.data){
            LinkedList right = path(root.right,val);
            if (right != null){
                right.add(root.data);
            }
            return right;
        }
        return null;
    }

    public static void main(String[] args) {
        Node3 root2 = insert(null,30);
        insert(root2,20);
        insert(root2,40);
        insert(root2,10);
        insert(root2,25);
        insert(root2,35);
        insert(root2,45);

       LinkedList<Integer> ll = path(root2,45);




  System.out.println(ll);
//        java.util.Iterator i = ll.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }

    }
}
