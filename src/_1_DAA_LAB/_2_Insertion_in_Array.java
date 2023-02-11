package _1_DAA_LAB;

import java.util.Scanner;

public class _2_Insertion_in_Array {
    private static void shift(int[] arr , int s){
        int i = arr.length-1;
        while (i>s){
            arr[i] = arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number Of Element in the array");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element number "+(i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to insert");
        int key = sc.nextInt();
        System.out.println("Enter the position you want to insert the element");
        int index = sc.nextInt();
        
     }
 }
