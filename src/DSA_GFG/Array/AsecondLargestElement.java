package DSA_GFG.Array;

public class AsecondLargestElement {
    public static int m12(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i])
                max=arr[i];
        }
        int max2=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max2<arr[i] && arr[i]!=max)
                max2=arr[i];
        }
        return max2;
    }
    public static void main(String[] args) {
        int arr[]={10,50,100,52,78,300};
        System.out.println(m12(arr));
    }
}
