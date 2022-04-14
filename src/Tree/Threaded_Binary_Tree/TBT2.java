package Tree.Threaded_Binary_Tree;

import java.util.Scanner;

class MyNode {
    private String phone;
    private MyNode left;
    private MyNode right;
    boolean RightThread;

    MyNode(String data) {
        phone = data;
    }

    public boolean check(String res){
        if (res.length() == 10) return true;
        else return false;
    }
    public void insert() {
        MyNode n1 = new MyNode("");
        MyNode n2 = new MyNode("");
        MyNode n3 = new MyNode("");
        MyNode n4 = new MyNode("");
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;

        MyNode dummy = new MyNode("");
        dummy.left = n1;
        dummy.right = dummy;
        dummy.RightThread = true;

        // n2
        n2.RightThread = true;
        n2.right = n1;

        //n4
        n4.RightThread = true;
        n4.right = n2;

        //n3
        n3.RightThread = true;
        n3.right = dummy;
    }


}
public class TBT2 {
    public static String str_to_num(String str) {
        String res = "";
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            String temp = s[i];
            temp = temp.toLowerCase();
            int t = 1;
            if (temp.equals("double")) t = 2;
            else if (temp.equals("triple")) t = 3;
            else if (temp.equals("quad")) t = 4;
            else if (temp.equals("penta")) t = 5;
            if (t != 1) {
                temp = s[i + 1];
                i++;
                temp = temp.toLowerCase();
            }
            while (t != 0) {
                if (temp.equals(("one"))) res += "1";
                else if (temp.equals(("two"))) res += "2";
                else if (temp.equals(("three"))) res += "3";
                else if (temp.equals(("four"))) res += "4";
                else if (temp.equals(("five"))) res += "5";
                t--;
            }
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(str_to_num("one two triple three penta five"));
    }
}

