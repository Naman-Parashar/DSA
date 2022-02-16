package DSA_GFG.Array;

public class ReverseOfArray {
    public static int[] m(int[] arr){
        int n = arr.length-1;
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==n)
                break;
                temp = arr[i];
                arr[i]=arr[n];
                arr[n]=temp;
                n--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[]={20,52,47,45,7};
        int sarr[]=m(arr);
        for (int a:
                sarr) {
            System.out.println(a);
        }

    }
}
