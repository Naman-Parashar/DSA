package Recursion;

public class PalandromeString {
    public static String reverse(String str,String temp,int l) {
        if (l < 0)
            return temp;
        return reverse(str, temp + str.charAt(l), l - 1);
    }

    public static boolean plandrome(String str, int l){
        if (str.charAt(l) != str.charAt(str.length()-l-1)) return false;

        if (l >= str.length()-1) return true;

        return plandrome(str,l+1);
    }
    public static void main(String[] args) {
        String str = "naman";
//        String t= reverse(str,"",str.length()-1);
//
//        if (t.equalsIgnoreCase(str))
//            System.out.println("T");
//        else
//            System.out.println("F");
        System.out.println(plandrome(str,0));
    }
}
