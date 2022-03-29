package Recursion.Basic;
// print from n to 1 by backtracking?
public class Q5 {
    public static void f(int i ,int n){
        if ( i > n)
            return;
        f(i+1,n);
        System.out.print(i+" ");
    }

    public static void main(String[] args) {
        f(1,10);
    }
}
