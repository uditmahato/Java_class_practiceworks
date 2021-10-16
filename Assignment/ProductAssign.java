import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ProductAssign {
    String name;
    double price;
    double stockValue;

    ProductAssign(String productname, double p, double value){
        name = productname;
        price = p;
        stockValue = value;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public boolean IsInStock(){
        double stock = stockValue;
        if (stock>50){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name, price and stock value: ");
        String n = sc.nextLine();
        double pr = sc.nextDouble();
        double sv = sc.nextDouble();
        ProductAssign p1 = new ProductAssign(n,pr,sv);
        PrintWriter outF = new PrintWriter("product.txt");
        outF.printf("####### Product Information #######\n");
        outF.printf("product Name: " + p1.getName() + "\n");
        outF.printf("product Price: " + p1.getPrice() + "\n");
        outF.printf("Availability: " + p1.IsInStock() + "\n");


        outF.close();

    }

}