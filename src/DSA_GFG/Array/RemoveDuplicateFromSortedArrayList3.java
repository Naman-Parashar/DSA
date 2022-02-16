package DSA_GFG.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromSortedArrayList3 {
    public static void m(ArrayList<Integer> arr){
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (Integer i:
             arr) {
            if (arr2.contains(i)==false){
                arr2.add(i);
            }
        }
        for (Integer p:
             arr2) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,25,333,26,44,44,44,10,10,20,20,20,30));
        m(arr);
    }
}
