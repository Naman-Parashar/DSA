package Assignment;

import java.util.LinkedList;
import java.util.Queue;

public class Q4 {
    public static String change(String str , Queue<String > q){
        int a=0;
        String str1="" ,str2="";
        for (int i = 0; i < str.length(); i++) {
            a= str.charAt(i);
            if (a%2 == 0 ) str1 +=str.charAt(i);
            else str2+=str.charAt(i);
        }
    return str1+str2;
    }



    public static void main(String[] args) {
        String [] str = {"ABCDE","neeraj","naman"};
            Queue<String> q = new LinkedList<>();

            for (int i = 0; i < str.length; i++) {
                q.add(change(str[i],q));
            }
            System.out.println(q);
    }
}