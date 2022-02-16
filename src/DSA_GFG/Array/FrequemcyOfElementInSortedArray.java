package DSA_GFG.Array;

public class FrequemcyOfElementInSortedArray {
    public static void main(String[] args) {
        int arr[] = {10,10,10,20,30,30,50};
        int flag =0;
        for (int i = 0; i < arr.length;i++) {
            int s =0;
            for (int j = 0; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    s++;
                    flag++;
                }
            }
            System.out.println("Element "+arr[i]+"= "+ s);
            i =flag-1;
        }
    }
}
