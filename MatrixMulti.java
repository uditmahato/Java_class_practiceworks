import java.util.Scanner;
public class MatrixMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1= new int[2][2];
        int[][] arr2= new int[2][2];
        int[][] result = new int[2][2];
        System.out.println("Enter four elements of First matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter four elements of second matrix");
        for(int i=0;i<2;i++){
            for( int j=0;j<2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Performing addition : ");
        for(int i=0;i<2;i++){
            for( int j=0;j<2;j++){
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Resultant Array "+"\t");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(result[i][j]+"\t");
            }
        }
        System.out.println("Operation Complete");
        sc.close();
    }

}
