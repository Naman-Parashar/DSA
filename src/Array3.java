import java.util.Scanner;

/**
 * Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects.
 * Now write a program to:
 * (a) find the average marks obtained in each subject.
 * (b) find the average marks obtained by every student.
 * (c) find the number of students who have scored below 50 in their average.
 * (d) display the scores obtained by every student.
 */
class stu{
   private int marks[][];
    stu(){
        marks = new int[4][5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length ; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Enter the marks of "+(j+1)+"th"+" subject for student"+ (i+1));
                marks[i][j]= sc.nextInt();
            }
        }
    }
    public void eavg(){
        for (int i = 0; i < 5 ; i++) {
            int sum = 0;
            for (int j = 0; j <4; j++) {
                sum +=marks[j][i];
            }
            sum/=5;
            System.out.println("Average Marks of "+(i+1) + " subject = "+ sum);
        }
    }
    public void avg(){
        int av[] = new int[4];
        for (int i = 0; i < 4 ; i++) {
            int sum = 0;
            for (int j = 0; j <5; j++) {
                sum +=marks[i][j];
            }
            sum/=5;
            av[i]=sum;
            System.out.println("Average Marks of student "+(i+1) + " = "+ sum);
        }
        int c=0;
        for (int i = 0; i < av.length; i++) {
         if (av[i]<50){
             c++;
         }
        }
        System.out.println();
        System.out.println("Number of student whose avg is less than 50 = "+c);
    }
    public void display(){
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print("Marks of student"+(i+1)+"  = ");
                System.out.println(marks[i][j]);
            }
            System.out.println("-----------------------------------");
        }
    }

}
public class Array3 {
    public static void main(String[] args) {
        stu s =new stu();
        s.eavg();
        System.out.println();
        s.avg();
        System.out.println();
        s.display();
        }
    }

