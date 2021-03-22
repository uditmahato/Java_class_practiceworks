public class NoOfDigit {
    public static void main(String[]args) {
        int num=6465765;
        int count =0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Total no of digits "+count);
    }
}
