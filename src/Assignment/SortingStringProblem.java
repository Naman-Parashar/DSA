package Assignment;

public class SortingStringProblem {
    public static void InSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j>0 && arr[j-1]>temp){
                arr[j]= arr[j-1];
                j--;
            }
            arr[j]= temp;
        }
    }
    public static void main(String[] args) {
        String str = "EMP128AF7K3";
        int arr1[] = new int[str.length()];
        int j= 0;
        for (int i = 0; i < str.length(); i++) {
             if (str.charAt(i) >= 48 && str.charAt(i) <= 57 ){
                 arr1[j++]=(Character.getNumericValue(str.charAt(i)));
             }
        }
        InSort(arr1);
        for (int r:
             arr1) {
            if (r != 0) {
                System.out.println(r);
            }
        }
    }
}
