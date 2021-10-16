import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
class Customer{
     String name;
     double purchase_amount;
     double discount;

     Customer(String name,double purchase_amount){
     this.purchase_amount=purchase_amount;
     this.name = name;
     }
    String getName(){
        return name;
    }
    double getPurchaseAmount(){
        return purchase_amount;
    }
    double getDiscountamt(){
        return discount;
    }
}
public class CustomerOop {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        ArrayList<Customer> name_l=new ArrayList<Customer>();
        ArrayList<String> name_l=new ArrayList<String>();
        ArrayList<Double> pa_l=new ArrayList<Double>();`
        PrintWriter out = new PrintWriter(new File("recorded.txt"));
        out.printf("ID\t\t\tNAME\t\t\tPURCHASE AMOUNT\t\t\tTOTAL PAYABLE(Rs.)\n");
        for(int i=0;i<2;i++){
            System.out.println("Enter the customer name : ");
            name_l.add(sc.next());
            System.out.println("Enter the purchase amount: ");
            pa_l.add(sc.next());
        }
        for(int i=0;i<2;i++){
            System.out.println(name_l.get(i));
        }
        //Discount +total payable amount calculation
        double payable_amt;
        double sum=0;
        for(int i=0;i<2;i++){
            if(pa_l.get(i)<=1000){
                payable_amt=pa_l.get(i)*0.95;
            }
            else{
                payable_amt=pa_l.get(i)*0.90;
            }
            sum +=payable_amt;
            out.printf("\n"+(i+1));
            out.printf("\t\t"+name_l.get(i));
            out.printf("\t\t"+pa_l.get(i));
            out.printf("\t\t\t"+payable_amt);
            System.out.print("\n"+(i+1));
            // System.out.print(name_l.get(i)+"\t\t\t");
            // System.out.print(pa_l.get(i)+"\t\t\t");
            // System.out.println(payable_amt);
            out.printf("\t\t\t"+payable_amt);
        }
        out.printf("\n.\n.");
        out.printf("\n===================================================================");
        out.printf("\nTotal Amount:");
        out.printf("\t\t\t\t\t\t\t\tRs." + sum);
        sc.close();
        out.close();
    }
}