import java.util.Scanner;

/**
 * Me Bean is very good in mathematics. He was given a number n and was told to find out number
 * of trailing zeroes in n! (Factorial) . Can you help him?
 *
 * Sample Input
 * 5
 * Sample Output
 * 1
 * Explanation
 * 5! (Factorial) is 120, so there is one trailing zero.
 *
 * Implement it by using loop
 */
public class Array4 {
    public static int factorial(int n){
        int f =1;
        while (n!=0){
            f=f*n;
            n--;
        }
        return f;
    }
    public static int count(int f){
        int c=0;
        while (f!=0){
            int a=f%10;
            if (a==0){
                c++;
            }
            else
                break;
            f=f/10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();
        System.out.println("Number Of Tailing Zeros: "+count(factorial(n)));
    }
}
