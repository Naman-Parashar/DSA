package DSA_GFG.Array;

public class LeaderInArray2 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 3, 6, 5, 2};
        int l = arr[arr.length - 1];
        System.out.println(l);
        for (int i = arr.length - 2; i >=0; i--) {
            if (arr[i]>l){
                l=arr[i];
                System.out.println(l);
            }
        }
    }
}
