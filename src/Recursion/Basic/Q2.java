package Recursion.Basic;
// print from 1 to n;
public class Q2 {
    public static void prr(int i ,int n){
        if (i > n)
            return;
        System.out.print(i+" ");
        prr(i+1,n);
    }

    public static void main(String[] args) {
        prr(1,10);
    }
}
