package Recursion.Basic;
// Sum of first n numbers?

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;

public class Q6 {
    // Parametrised Way
    public static void f(int i , int sum){
        if (i < 1){
            System.out.println(sum);
            return;
        }
        f(i-1,sum+i);
    }

    // Functional Way
    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + f(n-1);
        }

    }

    public static void main(String[] args) {
      //  f(5,0);
        System.out.println( f(5));
    }
}
