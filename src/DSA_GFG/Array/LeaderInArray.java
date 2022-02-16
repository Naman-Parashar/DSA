package DSA_GFG.Array;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {7,10,4,10,3,6,5,2};
        for (int i = 0; i < arr.length; i++) {
            boolean b = true;
            for (int j = i+1; j < arr.length ; j++) {
               if (arr[j]>=arr[i]) {
                   b = false;
                   break;
               }
            }
            if (b==true)
                System.out.println(arr[i]);
        }
    }
}
