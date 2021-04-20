class Employee{
    String name;
    String address;
    double salary;
    void setEmployee(String n,String add,double sal){
            name=n;
            address=add;
            salary=sal;
    }
    
    void display(){
        System.out.println(name+" "+address+" "+salary);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e= new Employee();
        e.setEmployee("udit","koteshwor",1000);
    }
}
