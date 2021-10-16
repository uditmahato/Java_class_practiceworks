import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
class  ProductStock {
    String name;
    double price;
    double StockValue;

    ProductStock(String name, double price, double StockValue){
        this.name = name;
        this.price = price;
        this.StockValue = StockValue;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public boolean IsInStock(){
        double stock = StockValue;
        if (stock>50){
            return true;
        }
        else {
            return false;
        }
    }
}

class Product {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name, price and stock value: ");
        String nam = sc.nextLine();
        double pri = sc.nextDouble();
        double sto = sc.nextDouble();
        //allocate memory
        ProductStock P = new ProductStock(nam,pri,sto);
        //to print in product file
        PrintWriter outF = new PrintWriter("product.txt");
        outF.printf("####### Product Information #######\n");
        outF.printf("product Name: " + P.getName() + "\n");
        outF.printf("product Price: " + P.getPrice() + "\n");
        outF.printf("Availability: " + P.IsInStock() + "\n");
        outF.close();

    }
}



