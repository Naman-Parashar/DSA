package HR_PS;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {
    public static int[] reverse(int[] a , int s , int e){
       while (true){
           int temp = a[s];
           a[s] = a[e];
           a[e] = temp;
           s++;
           e--;
           if (s>=e) break;
       }
        return a;
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        int[] ar = new int[arr.size()];
        int i = 0;
        for (Integer s:
                arr) {
            ar[i] = s;
            i++;
        }
        arr.clear();
        ar = reverse(ar,0,d-1);
        ar=reverse(ar,d, ar.length-1);
        ar =reverse(ar,0, ar.length-1);

        for (int w:
                ar) {
            arr.add(w);
        }
        return arr;
    }

}

public class Left_Rotation {
    public static void main(String[] args) throws IOException {
       ArrayList<Integer> arr = new ArrayList<>();

       arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       arr.add(5);

       Result3 o = new Result3();
        System.out.println(o.rotateLeft(3,arr));
    }
}
