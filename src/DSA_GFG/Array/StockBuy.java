package DSA_GFG.Array;
import java.util.Scanner;
public class StockBuy {
    public static void main(String[] args) {
        int arr[] = {1,5,3,8,12};
        int profit =0;
        for (int i = 0; i < args.length; i++) {
            int buy = arr[i];
            int sell=arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]>=buy){
                    profit=arr[j]-buy;
                    i=j-1;
                    break;
                }

            }

        }
    }
}
