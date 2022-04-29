package Sorting;

public class Insertion {
    public static void iSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int a:
                arr) {
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {50,10,20,70,60,90,54,36,48,35,2};
        iSort(arr);
    }
}
