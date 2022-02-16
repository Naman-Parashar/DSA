package DSA_GFG;

public class TimeComplexitySumOfNaturalNumber {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
      //  sum1(9999);  //0.0 ms
        sum2(9999);   // 1.0 ms

        System.out.println("Time taken = "+(System.currentTimeMillis()-now));

    }

    public static void sum1(int a){
        System.out.println((a*(a-1))/2);
    }

    public static void sum2(int b){
        int s=0;
        for (int i = 1; i <= b; i++) {
            s= s+i;
        }
        System.out.println(s);
    }
}
