import java.io.*;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CountText.txt"));
        int lower=0;
        int upper=0;
        int whitespace=0;
        int others=0;
        int len=0;
        while (sc.hasNext()) {
            String i = sc.next();
            len=i.length();
            System.out.println(i);   
        for (int i = 0; i < len; i++) {
            char ch = .charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                upper++;
            }
            else if (ch >= 'a' && ch <= 'z'){
                lower++;
            } else if (ch ==' ') {
                whitespace++;
            } else {
                others++;
            }
        }

        System.out.println("Lower case letters : " + lower);
        System.out.println("Upper case letters : " + upper);
        System.out.println("space: " + whitespace);
        System.out.println("other: " + others);
        sc.close();   
    }
}