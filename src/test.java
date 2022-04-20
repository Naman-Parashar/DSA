import java.util.ArrayList;
import java.util.Scanner;

class emp{
    String name,department;
    int duration,salary;
    emp(String name , String department , int duration, int salary){
        this.name = name;
        this.department = department;
        this.duration = duration;
        this.salary = salary;
    }
}

class  Node{
    emp a;
    Node left;
    Node right;
    Node(String name , String department , int duration, int salary){
        a= new emp( name ,department ,  duration,  salary);
        left=right=null;
    }
}

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max=arr[0];
        for(int i = 0; i<n;i++){
            for(int j= i+1 ;j<n;j++){
                if(arr[j]< arr[i]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int a:
             arr) {
            System.out.print(a+" ");
        }
    }
}
