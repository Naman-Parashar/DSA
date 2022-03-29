package Recursion.MultipleRecursionCall;

public class Fabonacci {
    public static int fab(int n){
        if (n<=1)
            return n;
        int s= fab(n-1);
        int l = fab(n-2);
        return s+l;
    }
    public static void main(String[] args) {
        System.out.println(fab(6));
    }
}
