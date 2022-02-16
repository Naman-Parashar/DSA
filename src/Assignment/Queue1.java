package Assignment;
import Assignment.queByArray;

public class Queue1 {
    public static int check(String str){
        int c=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0'){
                 c =i;
                break;
            }
        }
        String str2;
        for (int i = c; i <str.length() ; i++) {
            //str2 = str2;
        }
        return 0;
    }
    public static void main(String[] args) {
        int size = 0;
        try {
            size = args.length;
        } catch (Exception e) {
            System.out.println(e);
        }
        if (size != 0) {
            queByArray q = new queByArray(size);
        }
        else
            System.out.println("NO Element");

    }
}
