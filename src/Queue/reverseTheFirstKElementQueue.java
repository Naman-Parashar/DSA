package Queue;
import java.io.IOException;
import java.util.*;

public class reverseTheFirstKElementQueue {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        Queue<Integer> q = new ArrayDeque<>();

        System.out.println("Enter How Many Element You Want To Enter");
        int w = sc.nextInt();


        for (int i = 0; i < w; i++) {
            System.out.println("Enter the "+(i+1)+" Element");
            q.add(sc.nextInt());
        }

        System.out.println("Enter the number you want to reverse");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            s.push(q.remove());
       }
        int qs = q.size();

        for (int i = 0; i < n; i++) {
            q.add(s.pop());
        }
        if (n<q.size()) {
            for (int i = 0; i < qs; i++) {
                int z = q.remove();
                q.add(z);
            }
        }

        System.out.println("************OUTPUT************");
        for (Integer a:
             q) {
            System.out.print(a+"  ");
        }

    }
}
