package Sorting;

public class Selection {
    public static void sSort(int arr[]){
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min = 0;
            // this loop will find index of min element in array:
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            temp[i] = arr[min];
            arr[min] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        for (int a:
                arr) {
            System.out.print(a+" ");
        }
    }

    // Now in above dol we use a extra space so, it became out-place so now we sol it with some octimization

    public static void sSort2(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            int tem = arr[min];
            arr[min] = arr[i];
            arr[i] = tem;
        }
        for (int a:
                arr) {
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {50,10,20,70,60,90,54,36,48,35,2};
        sSort2(arr);
    }
}
