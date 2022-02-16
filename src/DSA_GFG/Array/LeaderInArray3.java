package DSA_GFG.Array;

public class LeaderInArray3 {
    public static void main(String[] args) {
        int[] arr ={7,10,4,3,6,5,2};
        int[] arr2 = new int[arr.length];

        int l =arr[arr.length-1];
        arr2[0]=l;

        int s=1;
        for (int i = arr.length-2; i >=0 ; i--) {
            if (arr[i]>l){
                l=arr[i];
                arr2[s]=l;
                s++;
            }
        }
        int q=0;
        int h =arr2.length-1;
        while (q<h){
            int tem = arr2[q];
            arr2[q]=arr2[h];
            arr2[h]=tem;
            q++;
            h--;
        }
        for (int a:
             arr2) {
            if (a!=0)
            System.out.println(a);
        }
    }
}
