import java.util.Scanner;
import java.io.*;
class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    double getSalary() {
        return this.salary;
    }
 
    Employee CompareSalary(Employee obj) {
        if (this.getSalary() > obj.getSalary())
            return this;
        else
            return obj;
    }
}

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File("emp_record.txt"));
        Employee ob = new Employee("Ram", 10, 5000);
        out.printf("Name\t\t\tAge\t\tsalary\n");
        out.printf("%s\t\t\t%d\t\t\t%f\n", ob.getName(), ob.getAge(), ob.getSalary());
        out.close();
    }

}