package Searching;

public class LinearSearch {
    public static int search(int arr[] , int n){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,78));
    }
}
