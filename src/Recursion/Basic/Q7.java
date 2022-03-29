package Recursion.Basic;

// Factorial of a number?
public class Q7 {
    // Parametrised Way
    public static void f(int i , int fac){
        if (i == 0){
            System.out.println(fac);
            return;
        }
        f(i-1,fac*i);
    }

    // Functional Way
    public static int f(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * f(n-1);
        }
    }

    public static void main(String[] args) {
         f(5,1);
        System.out.println( f(5));
    }
}
