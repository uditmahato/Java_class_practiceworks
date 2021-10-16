class Student {
    String name;
    double marks;
    static String college_name="Sunway intl college";
    static int count=0;

    public Student(String name,double marks){
        this.name=name;
        this.marks=marks;
    }

    public void display() {
        System.out.println("Percentage obtained : " + (marks / 3) + " %");
    }
    static int getObjectCount(){
        return count;
    }
}

public class Test3 {
    public static void main(String[] args) {
    Student s1=new Student("Ram ",75);
    Student s2 = new Student("Ramu ", 57);
    s1.display();
    s2.display();
    s1.display("Testing Method Overload");
    System.out.println("College name : " +(Student.college_name));
    System.out.println("no of object created :"+(Student.getObjectCount()));
}
}