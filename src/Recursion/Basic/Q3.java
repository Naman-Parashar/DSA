package Recursion.Basic;
// print from n to 1?
public class Q3 {
    public static void prr(int i ,int n){
        if (i<0)
            return;
        System.out.print(i+" ");
        prr(i-1,n);
    }

    public static void main(String[] args) {
        prr(10,10);
    }
}
