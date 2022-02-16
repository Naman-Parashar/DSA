package DSA_GFG.Array;

public class MoveAllZeroToEnd {
    public static void m1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] !=0) {
                        int temp = arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                        break;
                    }
                }
            }
        }
        for (int a:
             arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,50,0};
        m1(arr);
    }
}
