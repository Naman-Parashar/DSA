package Assignment;

public class RoboMove {
    public static void main(String[] args) {
        String str = "22E";
        int input1 = 9;
        int input2 = 9;
        int x = Character.getNumericValue(str.charAt(0));
        int y = Integer.parseInt(String.valueOf(str.charAt(1)));
        char d = str.charAt(2);
        boolean temp=false;
        String input4 = "RLMMLLRRMRR";
        for (int i = 0; i < input4.length(); i++) {

            if (x < input1 && y < input2 && x > 0 && y > 0) {

                if (input4.charAt(i) == 'R'){
                    if(d == 'E')  d='S';

                    else if (d == 'W') d='N';

                    else if (d == 'N') d = 'E';

                    else if ( d == 'S') d='W';
                }

                else if (input4.charAt(i) == 'L'){
                    if(d == 'E')  d='N';

                    else if (d == 'W') d='S';

                    else if (d == 'N') d = 'W';

                    else if ( d == 'S') d='E';
                }
                else if (input4.charAt(i) == 'M'){
                    if(d == 'E') ++x;

                    else if (d == 'W') --x;

                    else if (d == 'N') ++y;

                    else if ( d == 'S') --y;
                }
            }
            else {
                temp=true;break;

            }
        }
        System.out.print(x+"-"+y+"-"+d);
        if(temp) System.out.print("-ER");
    }

}