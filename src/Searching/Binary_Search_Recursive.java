package Searching;

public class Binary_Search_Recursive {
    public static int search(int arr[] , int n, int low , int high) {
        if(low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == n) return mid;

        else if (arr[mid] > n) return search(arr,n,low,mid-1);

        else  return search(arr,n,mid+1,high);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9,7,8,9};
        int low = 0;
        int high = arr.length - 1;
        System.out.println(search(arr,85,low,high));
    }
}
