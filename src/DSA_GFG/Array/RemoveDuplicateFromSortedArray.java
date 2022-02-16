package DSA_GFG.Array;

public class RemoveDuplicateFromSortedArray {
    public static int[] remove(int arr[]){
        int temp[]= new int[arr.length];
        temp[0]=arr[0];
        int r=1;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != temp[r-1]){
                temp[r]=arr[i];
                r++;
                c++;    // give number of element.
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30, 30};
        int sarr[] = remove(arr);
        for (int a :
                sarr) {
            System.out.println(a);
        }
    }
}
