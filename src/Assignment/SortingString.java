package Assignment;

import java.util.Scanner;

public class SortingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        String arr[]= str.split(" ");

        String temp;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if(arr[j].length() > arr[j+1].length()){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
                if (arr[j].length() == arr[j+1].length()){
                    int s = arr[j].compareTo(arr[j+1]);
                    if (s>0){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]= temp;
                    }
                }
            }
        }

        for (String y:arr
             ) {
            System.out.println(y);
        }
    }
}
