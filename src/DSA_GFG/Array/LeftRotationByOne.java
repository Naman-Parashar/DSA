package DSA_GFG.Array;

/**
 *   or we can use this method which store 1st element in temp variable then shift each element by 1 position
 *
 *   public static void m1(int[] arr){
 *       int tem = arr[0];
 *         for (int i = 1; i < arr.length; i++) {
 *           arr[i-1]=arr[i];
 *         }
 *         arr[arr.length-1] = temp;
 *       }
 */
public class LeftRotationByOne {
    public static void m1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr.length-1 == i)
                break;
          int tem = arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=tem;
        }
        for (int a:
                arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        m1(arr);
    }
}
