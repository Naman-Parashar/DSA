import java.util.ArrayList;

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

    }
}
