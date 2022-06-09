package DSA_GFG.Array;

public class AsecondLargestelement2 {
    public static int m12(int arr[]){
        int max=Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max2 =max;
                max=arr[i];}
           else if (arr[i]>max2 && arr[i]!=max)
                max2=arr[i];
        }
        return max2;
    }
    public static void main(String[] args) {
        int arr[]={8 ,9 ,9, 1, 7 ,5 ,5 ,10 ,1 ,0 ,7 };
        int n = m12(arr);
        System.out.println(n);
    }
}
