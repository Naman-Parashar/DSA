package DSA_GFG;

public class SumOfNaturalNumber {
    public void sum(int n){
        int sum =0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                sum++;                 // do sum n*(n-1)/2  times
            }                          // 1+(1+1)+(1+1+1)......and so no.
        }
        System.out.println(sum);
    }
}
