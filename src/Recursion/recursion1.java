package Recursion;

import java.util.Scanner;

public class recursion1 {
    public static int factorial(int n){
        int s = 1;
        if (n > 0){
            s= n * factorial(n-1);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

       int a= factorial(n);
        System.out.println(a);
    }
}
