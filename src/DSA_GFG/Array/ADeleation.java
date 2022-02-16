package DSA_GFG.Array;

import java.util.Scanner;

/**
 * we can also write method like
 *   public static int m1(int arr[],int e,int c){
 *         int s = arr.length-c;
 *         int idx=-1;
 *         for (int i = 0; i < arr.length; i++) {
 *             if(arr[i]==e)
 *                  idx = i;
 *         }
 *         if (idx == -1)
 *             return s;
 *         for (int i = idx; i < arr.length-1; i++) {
 *             arr[i]=arr[i+1];
 *         }
 *         arr[arr.length-1]=0;
 *         return s-1;
 *
 *     }
 */
public class ADeleation {
    public static int m1(int arr[],int e){
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i]==e)
                 break;
        }
        if (i == arr.length)
            return arr.length;
        for (int j = i; j < arr.length-1; j++) {
            arr[j]=arr[j +1];
        }
        arr[arr.length-1]=0;
        return arr.length-1;

    }

    public static void main(String[] args) {
        int arr[]= {3,8,12,5,6};
        Scanner sc = new Scanner(System.in);
        for (int a:
                arr) {
            System.out.println(a);
        }
        System.out.println("------------BEFORE------------");

        System.out.println("Enter the element you want to delete");
        int e = sc.nextInt();

        System.out.println(m1(arr,e));
        System.out.println("-----------------AFTER-----------------");
        for (int a:
                arr) {
            System.out.println(a);
        }
    }
}
