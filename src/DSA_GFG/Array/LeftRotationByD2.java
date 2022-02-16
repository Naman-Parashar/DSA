package DSA_GFG.Array;

public class LeftRotationByD2 {
    public static void m1(int[] arr,int n) {
        if (n > arr.length) {
            n=n- arr.length;
        }
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i]=arr[i];
        }
        for (int i = n; i < arr.length; i++) {
            arr[i-n]=arr[i];
        }
        for (int i =1; i <=n ; i++) {
            arr[arr.length-i]=temp[temp.length-i];
        }
        for (int a :
                arr) {
            System.out.println(a);
        }

    }
    public static void main(String[] args) {
        int[] arr = {58,10,5,30,15,548,65};
        m1(arr,4);
    }
}
