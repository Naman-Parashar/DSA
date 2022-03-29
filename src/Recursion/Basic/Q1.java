package Recursion.Basic;
// print Name n times?

public class Q1 {
//    static int count = 0;
//    public static void pr(int n){
//        if (n > 0){
//            System.out.println(" Naman");
//            pr(n-1);
//        }
//    }
                    //   OR
    public static void pr(int n){
        if (n == 0)
            return;
        System.out.println(" Naman");
        pr(n-1);
    }
    public static void main(String[] args) {
        pr(5);
    }
}
