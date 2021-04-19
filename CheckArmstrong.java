import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Figures that you want to check : ");
        int figures= sc.nextInt();
        int n = 0;
        int x =figures;
        int r = 0;
        int o = figures;
        int sum =0;
        while (figures > 0) {
            figures = figures / 10;
            n++;
        }
        System.out.println("No of digits in the given figure is "+ n);
        while (x>0){
            r=x%10;
            sum += (int)Math.pow(r,n);
            x/=10;

        }
        if(sum==o){
           System.out.println(" The given number " + o +" is armstrong number");
        }
        else{
            System.out.println(" The given number " + o + " is not armstrong number");
        }
        sc.close();
    }
}
