package Stack;

import java.util.Scanner;

public class palandrom  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stsck v = new stsck(10);
        System.out.println("Enter the Number");
        String str=sc.next();

//        String str= Integer.toString(a);
        for (int i = 0; i < str.length(); i++) {
            int b = Integer.parseInt(String.valueOf(str.charAt(i)));
            stsck.push(b);
        }
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
           str2 = str2+stsck.pop();
        }
        if (str.equals(str2))
            System.out.println("palandrome");
        else
            System.out.println("Not");
    }
}