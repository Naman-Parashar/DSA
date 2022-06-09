package Tree.BST;

class Node12{
    int data;
    Node12 left;
    Node12 right;
    Node12(int data){
        this.data = data;
    }
}
public class BST_By_LinkedList  {
    static Node12 root;

    public static void insert(int value) {
        Node12 n = new Node12(value);
        if (root == null) {
            root = n;
            return;
        } else {
            Node12 current = root;
            Node12 parent = null;

            while (true) {
                parent = current;

                if (value< current.data){
                    current = current.left;

                    if (current == null){
                        parent.left =n;
                        return;
                    }
                }
                if (value > current.data){
                    current = current.right;

                    if (current == null){
                        parent.right = n;
                        return;
                    }
                }
            }
        }
    }

    public static void preOrder(Node12 root){
        if (root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void insert(Node12 root , Node12 newNode){

        if (root == null) { root = newNode; return;}
    }

    public static void insert(Node12 root , int value){

    }

    public static void main(String[] args) {
        insert(30);
        insert(50);
        insert(20);
        insert(25);
        insert(35);
        insert(40);
        insert(10);

        preOrder(root);

//        int arr[] = {30,20,50,25,35,40,10};
//
//        for (int i = 0; i < arr.length; i++) {
//            insert(arr[i]);
//        }
//        preOrder(root);


        // method 2 call;
//        Node n1 = new Node(50);
//        insert(null,n1);  // to set root element
//        insert(n1,new Node(30)); // second element
//        insert(n1,new Node(56));  // third node
    }
}
