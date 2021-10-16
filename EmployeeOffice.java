import java.util.Scanner;
import java.io.*;
class Employee {
    String Name;
    int Age;
    double salary;
    Employee(String n, int a, double s){
        Name=n;
        Age=a;
        salary=s;
    }
   String getName(){
      String gN=Name;
      return gN;
   }
   int getAge(){
     int aG=Age;
     return aG;
   }
   double salary(){
   return  salary;
   }
}
public class EmployeeOffice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter outF=new PrintWriter("result2.txt");
        Employee e1=new Employee("Kara",26,250);
        outF.e1();
        
    }
}
