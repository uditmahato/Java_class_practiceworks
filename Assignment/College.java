import java.util.Scanner;
import java.io.*;
class College {
    public static void main(String[] args) throws FileNotFoundException {
        //intialization of object
        float MarksSum=0;
        String Result;
        Scanner sc=new Scanner(System.in);
        PrintWriter out = new PrintWriter("score.txt");
        out.printf("##########RESULT##########");
        //creation of array to store marks
        float MarkStore[]= new float[5];
        System.out.println("Enter the marks obtained in 5 subjects: ");
        
        //Loop to store value in array
        for(int i=0;i<5;i++){
            MarkStore[i]=sc.nextFloat();
            MarksSum=MarksSum+MarkStore[i];
        }
        System.out.println("Total Marks Obtained : "+MarksSum);
        float Percentage=(MarksSum/500)*100;
        System.out.println("Percentage Score : "+Percentage+"%");
        //loops for division
        if(Percentage<29.9){
             Result="FAIL";
             System.out.println("Division : "+Result);
        }
        else if(Percentage>=30 && Percentage<=59.9){
            Result="SECOND";
            System.out.println("Division : "+Result);
        }
        else if(Percentage>=60 && Percentage<=79.9){
            Result="FIRST ";
            System.out.println("Division : "+Result);
        }
        else{
            Result="DISTINCTION";
            System.out.println("Division : "+Result);
        }
        Scanner res=new Scanner(System.in);
        System.out.print("Enter the name of Student : " );
        String StudentName=res.nextLine();
        //now lets print in txt.file
        out.printf("\n"+"Name : "+StudentName);
        out.printf("\n"+"Division : "+Result.toLowerCase());
        sc.close();
        out.close();
    }
    
}
