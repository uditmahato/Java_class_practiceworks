import java.io.*;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("record.txt")); 
        PrintWriter out = new PrintWriter(new File("result.txt"));
        out.printf("NAME\t\t\tMARK1\t\t\tMARK2\t\t\tMARK3\t\t\tTOTAL\n");
        while (in.hasNext()) {
            String line = in.nextLine();
            String[] arr = line.split(" ");
            int total = Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]);
            out.printf("%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t\t%d\n", arr[0], arr[1], arr[2], arr[3], total);
            // System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
        }
        in.close();
        out.close();
    }
}