package DSA_GFG.Array;

public class LeftRotationByD {
    public static void m1(int[] arr,int n) {
        if (n > arr.length) {
            n=n- arr.length;
        }
            while (n != 0) {
                int tem = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[arr.length - 1] = tem;
                n--;
            }

            for (int a :
                    arr) {
                System.out.println(a);
            }

    }
    public static void main(String[] args) {
        int[] arr = {10,5,30,15};
        m1(arr,5);
    }

}
