import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, option;
        char ex;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1::ADD 2::SUBTRACTION 3::MULTIPLY 4::DIVIDE 5::MOD");
            option = sc.nextInt();
            if (option != 6) {
                System.out.println("Enter the two numbers for ");
                if (option == 1) {
                    System.out.println("addition : ");
                } else if (option == 2) {
                    System.out.println("subtraction : ");
                } else if (option == 3) {
                    System.out.println("multiplication : ");
                } else if (option == 4) {
                    System.out.println("division : ");
                } else if (option == 5) {
                    System.out.println("modulus : ");
                }

                num1 = sc.nextInt();
                num2 = sc.nextInt();
            } else
                break;
            switch (option) {
            case 1:
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case 4:
                if (num2 == 0)
                    System.out.println("Error!!! In Division denominator cannot be 0!");
                else {
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                }
                break;
            case 5:
                System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
                break;
            default:
                System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue?(y/n)");
            ex = sc.next().charAt(0);
        } while (ex == 'y');
    }
}