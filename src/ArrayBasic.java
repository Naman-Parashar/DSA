import java.util.Scanner;

class ins{
    private int [] arr;
    Scanner sc = new Scanner(System.in);
    ins(){
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }
    public void view(){
        for (int a:arr) {
            System.out.println(a);
        }
    }
}
public class ArrayBasic {
    public static void main(String args[]) {
        new ins().view();
    }
}
