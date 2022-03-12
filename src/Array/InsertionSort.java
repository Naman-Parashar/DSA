package Array;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,3,1,7,2};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j>0 && arr[j-1]>temp){
                arr[j]= arr[j-1];
                j--;
            }
            arr[j]= temp;
        }
        for (int r:
             arr) {
            System.out.print(r+"   ");
        }
    }
}
