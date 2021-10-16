import java.util.Scanner;
import java.io.*;

public class FileOddEven {
    public static void main(String[] args) throws FileNotFoundException {
        // used to read input from the keyboard
        // Scanner sc = new Scanner(System.in);
        // read input from the file
        Scanner sc = new Scanner(new File("C:\\Users\\xps\\Desktop\\javacodes\\test.txt"));
        while (sc.hasNext()) {
            int x = sc.nextInt();
            // Integer x=Integer.valueOf(i);
            if(x %2==0){
               System.out.println("even");
            }
            else{
               System.out.println("odd");
            }
        }
        sc.close();
    }
}