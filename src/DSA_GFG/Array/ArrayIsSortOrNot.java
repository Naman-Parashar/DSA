package DSA_GFG.Array;

public class ArrayIsSortOrNot {
    public static String  m(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i!= (arr.length-1))
            if (arr[i]>arr[i+1])
                return "Not Sorted";
        }
        return "Sorted";
    }
    public static void main(String[] args) {
        int[] arr ={0,10,0,10};
        System.out.println(m(arr));
    }
}
