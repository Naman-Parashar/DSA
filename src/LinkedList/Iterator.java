package LinkedList;

import java.util.LinkedList;

public class Iterator {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        java.util.Iterator i = l.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}

