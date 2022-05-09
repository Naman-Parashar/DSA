package Sorting;

public class Quick {

    public static int partition(int arr[] , int low , int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j <high ; j++) {
            if (arr[j]< pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void qSort(int arr[],int low ,int high){
        if (low<high){
            int pivotIndex = partition(arr,low,high);
            qSort(arr, low, pivotIndex-1);
            qSort(arr, pivotIndex+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {50,10,20,70,60,90,54,36,48,35,2};
        int n = arr.length-1;
        qSort(arr,0,n);
        for (int a:
                arr) {
            System.out.print(a+" ");
        }
    }

}
