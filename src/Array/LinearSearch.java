package Array;
import java.util.Scanner;
class demo{
    int arr[];
    demo(int size,Scanner sc){
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }

    public int search(int n){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                System.out.println("Found");
                return arr[i];
            }
        }
        return -1;
    }
}
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = sc.nextInt();

        demo d = new demo(s,sc);
        System.out.println("Enter the element you want to search");
        int v = sc.nextInt();
        System.out.println(d.search(v));
    }
}
