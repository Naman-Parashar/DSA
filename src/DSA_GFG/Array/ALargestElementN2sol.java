package DSA_GFG.Array;

public class ALargestElementN2sol {
    public static  int m1(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]<arr[j])
                    max = j;    // return index of largest element/
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr ={10,5,20,50,7};
        System.out.println(m1(arr));
    }
}
