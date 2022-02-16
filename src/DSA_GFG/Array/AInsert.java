package DSA_GFG.Array;

import java.util.Scanner;

/**
 *  //Your code here, Geeks
 *       if(index==sizeOfArray-1)
 *       {
 *       arr[index]= element;
 *       }
 *        else
 *        for(int i = sizeOfArray-1 ; i>index ; i--)    ***IMP***
 *        {
 *            arr[i]=arr[i-1];
 *        }
 *        arr[index]=element;
 *    }
 */
public class AInsert {
    public static int m1(int arr[],int e,int pos,int c){
        int s = arr.length-c;
        if (s== arr.length)
            return arr.length;
        if (pos> arr.length)
            return -1;
        int ind = pos-1;
        for (int i = (s-1); i >=ind ; i--) {
            arr[i+1]=arr[i];
        }
        arr[ind]=e;
        return s+1;
    }

    public static void main(String[] args) {
        int arr[]= new int[6];
        for (int i = 0; i < 5; i++) {
            arr[i]=i+1;
        }
        int c =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0)
                c++;   // size
        }              // capacity = 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int e = sc.nextInt();

        System.out.println("Enter the position of the element");
        int pos = sc.nextInt();

        System.out.println();
        System.out.println(m1(arr,e,pos,c));
        System.out.println();
        for (int a:
             arr) {
            System.out.println(a);
        }
    }
}
