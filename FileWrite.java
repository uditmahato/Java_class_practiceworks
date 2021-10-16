import java.io.*;
import java.util.Scanner;
public class FileWrite {
    public static void main(String[] args)throws FileNotFoundException {
        int[]arr = new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        PrintWriter outF= new PrintWriter(new File("array_sum.txt"));
        System.out.println("Enter 5 integers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        outF.printf("sum = %d ",sum);
        outF.close();
        sc.close();
    }
}
