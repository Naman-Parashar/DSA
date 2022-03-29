package Recursion;

public class fabonacci {
    static int a= 0, b =1 ,c=0;
    public static void fab(int n){
        if (n >0){
            c = a +b;
            a= b;
            b=c;
            System.out.print(" "+c);
            fab(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.print(a+"  "+b);
        fab(9);
    }
}

