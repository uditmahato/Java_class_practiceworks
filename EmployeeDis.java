import java.util.Scanner;

public class EmployeeDis {

    String name;
    double salary;
    String address;

    public void getInput() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name :: ");
        name = in.next();
        System.out.print("Enter the salary :: ");
        salary = in.nextFloat();
        System.out.print("Enter the address :: ");
        address = in.next();
    }
    public void display() {
        System.out.println("Employee name = " + name);
        System.out.println("Employee salary = " + salary);
        System.out.println("Employee Address = " + address);
    }

    public static void main(String[] args) {

        EmployeeDis e[] = new EmployeeDis[5];

        for (int i = 0; i < 3; i++) {

            e[i] = new EmployeeDis();
            e[i].getInput();
        }

        System.out.println("**** Data Entered as below ****");

        for (int i = 0; i < 3; i++) {

            e[i].display();
        }
    }
}