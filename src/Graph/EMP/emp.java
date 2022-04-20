package Graph.EMP;

public class emp {
    private int empId;
    private String name;
    private int sal;

   emp(int empId , String name , int sal){
        this.empId = empId;
        this.name = name;
        this.sal = sal;
    }
    public void displayEmp(){
        System.out.println("Name - "+ name+"\n"
                          +"Emp ID - "+empId+"\n"
                          +"Salary - "+sal);
    }

}
