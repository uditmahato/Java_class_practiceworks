import java.util.Scanner;
class Student{
    String name;
    Double mark1;
    double mark2;
    double mark3;
    void setStudent(String n,double m1,double m2,double m3){
        name = n;
        mark1 =m1;
        mark2=m2;
        mark3=m3;
    }
    double calculateTotal(){
        double total;
        total=(mark1+mark2+mark3);
        return total;
    }
    double CalculatePercentage(double tot){
        double per;
        per=tot/3;
        return per;
    }
    void GetResult(double per){
        if(per>80 && per<100){
            System.out.println("Distinction");
        }
        else if (per>60 && per<80){
            System.out.println("First Division");
        }
        else if (per > 50 && per < 60) {
            System.out.println("Second Division");
        }        
        else{
            System.out.println("Fail");
        }
    }
}
public class OopProject {
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        Student st=new Student();
        System.out.println("Enter Name,Marks1,Marks2,Marks,3 and Percetage");
        String name =sc.next();
        double m1= sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        st.setStudent(name, m1, m2, m3);
        double tot =st.calculateTotal();
        double per=st.CalculatePercentage(tot);
        st.GetResult(per);
        sc.close();
    } 
}
