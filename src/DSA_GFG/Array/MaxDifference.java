package DSA_GFG.Array;

public class MaxDifference {
    public static int md(int arr[]){
        int s=arr[1]-arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                   int r= arr[j]-arr[i];
                   if (r>s){
                       s=r;
                   }
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
            System.out.println(md(arr));
    }
}
