package DSA_GFG.Array;

import java.util.Scanner;

public class ASearch {
    public static int m1(int arr[],int n){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element You want to search");
        int n = sc.nextInt();
        System.out.println(m1(arr,n));
    }
}
