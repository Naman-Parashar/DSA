package Searching;

public class Binary_Search {
    public static int search(int arr[] , int n) {
        int low = 0;
        int high = arr.length - 1;

        while (low<=high) {
            int mid = (low + high) / 2;

            if (arr[mid] == n) return mid;

            else if (arr[mid] > n) high=mid-1;

            else if (arr[mid] < n) low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,3));
    }
}