import java.util.Scanner;

/**
 *  There is a company that manufactures three types of products. In this company, there are 5 salesmen.
 *  Each salesman is supposed to sell three products. Write a program to print
 *
 * (i) The total no of sales by each salesman and
 *
 * (ii) total sales of each item.
 *
 * The structure of the class Company is as follows:-
 *
 * class Company
 * {
 * 	int products[];
 * }
 * HInt:-
 * Company salesman[]= new Company[5];
 *
 * Output :-
 * Enter the sales of 3 items sold by salesman 1: 23 23 45
 * Enter the sales of 3 items sold by salesman 2: 34 45 63
 * Enter the sales of 3 items sold by salesman 3: 36 33 43
 * Enter the sales of 3 items sold by salesman 4: 33 52 35
 * Enter the sales of 3 items sold by salesman 5: 32 45 64
 *
 * Total Sales By Salesman 1 = 91
 * Total Sales By Salesman 2 = 142
 * Total Sales By Salesman 3 = 112
 * Total Sales By Salesman 4 = 120
 * Total Sales By Salesman 5 = 141
 *
 * Total sales of item 1 = 158
 * Total sales of item 2 = 198
 * Total sales of item 3 = 250
 */

class Company{
     int products[];

    Company(Scanner sc){
        products = new int[3];
        for (int i = 0; i < products.length; i++) {
            products[i] = sc.nextInt();
        }
    }
    public int sum(){
        int s =0;
        for (int i = 0; i < products.length; i++) {
            s+=products[i];
        }
        return s;
    }
}
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Company salesman[] = new Company[5];
        for (int i = 0; i < salesman.length; i++) {
            System.out.print("Enter the sales of 3 items sold by salesman"+(i+1)+": ");
            salesman[i]=new Company(sc);
        }
        for (int i = 0; i < salesman.length; i++) {
            int s =salesman[i].sum();
            System.out.println("Total sales by Salesman "+(i+1)+": "+s);
        }
        System.out.println();

        for (int i = 0; i < salesman[i].products.length; i++) {
            int s2 =0;
            for (int j = 0; j < salesman.length; j++) {
                s2 = salesman[j].products[i] + s2;
            }
            System.out.println("Total Sales of item "+ i +"="+s2);
        }
    }
}
