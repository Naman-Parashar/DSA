package Assignment;

public class SumAndDigit {
    public static String ty() {
        String input1 = "";
        int input2 = 0;
        int sum = 0;
        int flag = -1;
        String result = "";
        if(input1.length() != 0){
            if(input2  == 0){
                for (int i = 0 ; i < input1.length();i++){
                    char g = input1.charAt(i);
                    if(g >= '0' && g<= '9'){
                        sum+=(g-'0');
                        flag = 1;
                    }
                }
                if(flag == 1){
                    return Integer.toString(sum);
                }
                else{
                    return "ZERO";
                }

            }
            else{
                for(int i =0 ; i<input1.length();i++){
                    char g = input1.charAt(i);
                    if(!(g>='0' && g<='9')){
                        result+=g;
                        flag = 1;
                    }
                }
                if(flag == 1) return result;
                else return "ZERO";
            }
        }
        return "NULL";
    }
    public static void main(String[] args) {
//        System.out.println(ty());
        String str = "MKHI";
        System.out.println();
        System.out.println(str);
    }
}
