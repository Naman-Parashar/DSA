package DSA_GFG.Array;

public class MoveAllZeroToEnd2 {
    public static void m1(int[] arr){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[c];
                arr[c]=temp;
                c++;
            }
        }
        for (int a:
                arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,10,0,0,70,50,0};
        m1(arr);
    }
}
