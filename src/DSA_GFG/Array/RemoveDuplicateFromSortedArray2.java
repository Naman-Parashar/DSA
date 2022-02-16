package DSA_GFG.Array;

import org.jetbrains.annotations.Contract;

public class RemoveDuplicateFromSortedArray2 {
    public static int[] remove(int arr[]){
       int r= 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= arr[r-1]){
                arr[r]=arr[i];
                r++;
            }
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
