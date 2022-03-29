package Recursion;

public class ReverseAnArray {
    public static void swap(int arr[],int l,int r){
        if (l >= r)
            return;
            int temp= arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            swap(arr,l+1,r-1);
        }

        // USING ONE POINTER
        public static void swap2(int arr[],int l){
        if (l >= (arr.length/2))
            return;
            int temp= arr[l];
            arr[l]=arr[arr.length-l-1];
            arr[arr.length-l-1]=temp;
            swap2(arr,l+1);
        }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int r = arr.length-1;
        swap2(arr,0);

        for (int a:
             arr) {
            System.out.print(a+" ");
        }
    }
}
