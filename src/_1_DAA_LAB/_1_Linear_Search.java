package _1_DAA_LAB;

import java.util.Scanner;

public class _1_Linear_Search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number Of Element in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element number "+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int key = sc.nextInt();
        boolean f = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                System.out.println("Found Element At index : "+ i+" ");
                f = false;
            }
        }
        if (f){
            System.out.println("Element Not Found");
        }
    }
}
