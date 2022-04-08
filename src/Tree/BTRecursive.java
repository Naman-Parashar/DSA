package Tree;

import java.util.Scanner;

public class BTRecursive {

    public static Node create(Scanner sc){
        Node root;

        System.out.println("Enter the data");
        int d = sc.nextInt();

        if (d < 0) return null ;

        root = new Node(d);

        System.out.println("Enter the element \"LEFT\" to :"+ d);
        root.left= create(sc);

        System.out.println("Enter the element \"RIGHT\"T to :"+ d);
        root.right = create(sc);

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root =create(sc);
    }
}