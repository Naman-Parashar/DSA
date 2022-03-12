package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array");
//        int size = sc.nextInt();
//        int arr[] = new int[size];
//        System.out.println("Enter the size of array");
//        for (int i = 0; i < args.length; i++) {
//            arr[i] = sc.nextInt();
//        }

        int arr[] = {1, 3, 6, 8, 10, 14, 16};
        int a = 8;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == a) {
                System.out.println("Element found");
            }
            if (arr[mid] < a) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

    }
}
