import java.util.Scanner;
import java.io.*;

public class TestFile {
    public static void main(String[] args) throws FileNotFoundException {
        // used to read input from the keyboard
        // Scanner sc = new Scanner(System.in);
        // read input from the file
        Scanner sc = new Scanner(new File("C:\\Users\\xps\\Desktop\\javacodes\\test.txt"));
        while (sc.hasNext()) {
            String i = sc.next();
            System.out.println(i);
        }
        sc.close();
    }
}