package DSA_GFG.Array;

public class AsecondLargestelement2 {
    public static int m12(int arr[]){
        int max=arr[0];
        int max2=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max=arr[i];
            if (arr[i]>max2 && arr[i]!=max)
                max2=arr[i];
        }
        return max2;
    }
    public static void main(String[] args) {
        int arr[]={10,6,10,7};
        System.out.println(m12(arr));
    }
}
