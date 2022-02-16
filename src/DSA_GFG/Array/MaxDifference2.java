package DSA_GFG.Array;

import java.util.Arrays;

public class MaxDifference2 {
    public static int md(int arr[]){
        int res=arr[1]-arr[0];
        int minval = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            int temp = arr[i]-minval;
            if (temp> res){
                res=temp;
            }
            if (arr[i]<minval){
                minval=arr[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println(md(arr));
    }
}
