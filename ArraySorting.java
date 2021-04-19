import java.util.Scanner;
public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j,n,temp;

        System.out.println("Enter the number of elements:") ;
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements") ;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Elements sorted in Ascending order are");
        for( i=0;i<n;i++){
            System.out.print(a[i]+" ") ;
        }

    }
}
