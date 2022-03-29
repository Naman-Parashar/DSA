package Recursion;

import java.util.ArrayList;

public class Subsequences {
 static ArrayList<Integer> arr = new ArrayList<>();

    public static void sub(int index ,ArrayList ar){
         if (index>= arr.size()){
             System.out.println(ar);
             return;
         }
         ar.add(arr.get(index));
         sub((index+1),ar);
         ar.remove(arr.get(index));
         sub((index+1),ar);
    }
    public static void main(String[] args) {
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList<Integer> ar = new ArrayList<>();
        sub(0,ar);
    }
}
