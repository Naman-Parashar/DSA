package Tree.BST;

public class Delete_Node extends BST_ByLinkedList_Recurssion{
    public static int min(Node3 root){
        if (root.left == null) return root.data;
        return min(root.left);
    }

    public static int max(Node3 root){
        if (root.right == null) return root.data;
        return max(root.right);
    }

    public static Node3 delete(Node3 root ,int val){
        if (root == null) return null;

        if (val < root.data){
            root.left = delete(root.left,val);
        }
        else if (val> root.data){
            root.right=delete(root.right,val);
        }
        else {
            if (root.left == null && root.right == null) return null;  // no child.
            else if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                int minim = min(root.right);
                root.data = minim;
                root.right = delete(root.right,minim);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {6,2,9,1,4,8,13,11,18,3,7};  // no child delete 3
        // int arr[] = {6,2,1,9,5,4,3,8,7,13,11,18}; // 1 child  delete 5
        // int arr[] = {6,2,1,9,8,15,11,13,18};  // having two child delete 9

        Node3 root2 = insert(null,arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insert(root2,arr[i]);
        }
        System.out.println("..........................BEFORE.......................");
        preOrder(root2);
        System.out.println();
       delete(root2,6);
        System.out.println("..........................AFTER.......................");
       // System.out.println(val.data);
        preOrder(root2);

    }
}
