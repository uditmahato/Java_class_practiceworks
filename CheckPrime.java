import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ex;
        do {
            System.out.print("Enter a number: ");
            int x = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(x + " is prime number");
            } else {
                System.out.println(x + " is not prime number");
            }

            System.out.println("\n\nDo you want to test another number(y/n)?");
            ex = sc.next().charAt(0);
        } while (ex == 'y');
    }
}
