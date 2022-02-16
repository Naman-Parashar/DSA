package DSA_GFG.Array;

public class ALargestElementNsol {
    public static int m11(int arr[]){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i])
                max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={10,5,20,5,70,1,40,3,88};
        System.out.println(m11(arr));
    }
}
