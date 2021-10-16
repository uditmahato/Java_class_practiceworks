import java.util.Scanner;
class ArrayNum {
     public static void main(String[] args) {
         //initiated  sum
         int sum=0;
         //initialized temp to store the value for temporary period
         int temp;
         //Created array NumStore
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter 5 numbers");
         int NumStore[] = new int[5];
         
         //Store to store 5 int in  the array numStore;
         for(int i=0;i<5;i++){
             NumStore[i]=sc.nextInt();
             // now calculate the sum 
             sum=sum+NumStore[i];
         }
         System.out.println("Sum of all numbers : "+sum);

         //loop to print array values before sorting
         System.out.println("Before sorting:");
         for(int i=0; i<5;i++){
           System.out.print(NumStore[i]+" ");
         }
         //loop to sort the value of array

         for(int i=0;i<5;i++){
             for(int j=i+1;j<5;j++){
                 if(NumStore[i]>NumStore[j]){
                  temp=NumStore[i];
                  NumStore[i]=NumStore[j];
                  NumStore[j]=temp;
                 }
             }
         }
         System.out.println("\nAfter sorting:");

         //loop to print value after sorting in ascending order
         for(int i=0;i<5;i++){
            System.out.print(NumStore[i]+" ");
         }
     }
}
//Sole copyright to Code by Udit Kumar Mahato