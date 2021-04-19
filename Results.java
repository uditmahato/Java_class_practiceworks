import java.util.Scanner;
class Name {
    String name;
    double marks1;
    double marks2;
    double marks3;

    double sum() {
        double add = marks1 + marks2 + marks3;

        return add;

    }

    void detail(String nam, double m1, double m2, double m3) {
        name = nam;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    double percentage() {
        double percent = sum() / 3;

        return percent;

    }

    void display() {
        System.out.println("name is" + name);
        System.out.println("total is" + sum());
        double per = percentage();

        if (per < 50) {
            System.out.println("third division");
        }
        if (per > 50 && per < 60) {
            System.out.println("second divisiom");

        }
        if (per > 60 && per < 70) {
            System.out.println(" first");
        }
        if (per > 70 && per < 80) {
            System.out.println("distiction");
        }
        if (per >= 80) {
            System.out.println("topper");
        }

        System.out.println("percent is" + per + "%");

    }
}

public class Results {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ad;
        double pr;
        Name result = new Name();
        System.out.println("give student details");
        String nam = sc.next();
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        result.detail(nam, m1, m2, m3);

        ad = result.sum();

        pr = result.percentage();

        result.display();

    }

}
