package Recursion.Basic;
// print from 1 to n by backtracking?
public class Q4 {
//    public static void f(int n){
//        if ( n == 0)
//            return;
//        f(n-1);
//        System.out.print(n+" ");
//    }
         // OR
    public static void f(int i ,int n){
        if ( i == 0)
            return;
        f(i-1,n);
        System.out.print(i+" ");
    }

    public static void main(String[] args) {
        f(10,10);
    }
 }

