import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to check : ");
        int n=sc.nextInt();
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;  //Remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println( temp + " is a palindrome number ");
        else
            System.out.println( temp + " is not a palindrome number");
        sc.close();
    }
}
