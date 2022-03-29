package Assignment;

public class RowMajorandcollumnMajor {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum =0;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][0]+" ");
                sum+=arr[j][0];
            }
        System.out.println();
            System.out.println("SUM = "+sum);

    }
}
