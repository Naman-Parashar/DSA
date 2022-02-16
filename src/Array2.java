import java.util.Scanner;

/**
 * Write a program to find whether the array of integers contains a duplicate number.
 * if yes print the location where duplicate numbers are found.
 */
class Check{
    int arr[];
    Check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of element you want to enter: ");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element "+i);
            arr[i]= sc.nextInt();
        }
    }
    public void cs(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] )
                        System.out.println("Element  " + arr[i] + "  also present at  " + j);
            }
        }
    }
}
public class Array2 {
    public static void main(String[] args) {
        Check c = new Check();
        c.cs();
    }
}
