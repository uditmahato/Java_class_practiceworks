import java.util.Scanner;
public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j,temp;
        int sum=0;
        int[] a = new int[5];

        System.out.println("Enter Five numbers") ;
        for(i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Before sorting");
        for (i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("\r\n"+"After sorting "+ "\r\n");
        for( i=0;i<5;i++){
            System.out.print(a[i]+" ") ;
        }
        for (int k = 0; k < 5; k++) {
            sum = sum + a[k];
        }
        System.out.println("\r\n"+"Total sum : " +sum);
    }
}
