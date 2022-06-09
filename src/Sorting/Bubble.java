package Sorting;

public class Bubble {
    public static void bSort(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)      // or   for (int j = 0; j < arr.length-1-i; j++)
            {
                if (arr[i]> arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {50,10,20,70,60,90,54,36,48,35,2};
        bSort(arr);
        for (int a:
                arr) {
            System.out.print(a+" ");
        }
    }
}
