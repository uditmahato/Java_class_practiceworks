import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] w = new double[5];
        double sum =0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the data : " + i);
            w[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Weight for " + i +" is "+ w[i]);
        }
        for(int i =0;i<5;i++){
            sum = sum+w[i];
        }
        System.out.println("Average of the numbers stored in array is " + (sum/w.length));
        sc.close();
    }
}
