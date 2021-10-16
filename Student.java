import java.util.Scanner;
class Student {

    String name;
    double mark1;
    double mark2;
    double mark3;
    double total;
    double percent;

    public Student(String nam, double m1, double m2, double m3) {
        name = nam;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    double getTotal() {
        total = mark1 + mark2 + mark3;
        return total;
    }

    double getPercentage(double total) {
        percent = (total / 300) * 100;
        return percent;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Total Mark Obtained : " + total);
        System.out.println("Percentage Score: " + percent+"%");
    }
}
class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name");
        String nam = sc.next();
        System.out.println("mark1");
        double m1 = sc.nextDouble();
        System.out.println("mark2");
        double m2 = sc.nextDouble();
        System.out.println(" mark3");
        double m3 = sc.nextDouble();
        Student d1 = new Student(nam,m1,m2,m3);
        d1.getPercentage(d1.getTotal());
        d1.display();
        sc.close();
    }
}