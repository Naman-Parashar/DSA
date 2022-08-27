package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(1);
        System.out.println(set);

        if (set.contains(2)) System.out.println("yes");
        else System.out.println("false");

//        set.remove(2);

        System.out.println(set.size());

        // Iterator
        Iterator it = set.iterator();   //  it has to fun hasNext(return boolean) and next(return element) firat it point to null and next is 1

        while (it.hasNext()) System.out.println(it.next());


    }
}
