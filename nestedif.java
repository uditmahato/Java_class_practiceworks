public class nestedif {
    public static void main(String[] args) {
        int num =25;
        if(num % 2== 0){
            if(num % 3 ==0){
                System.out.println("The number is exactly divisible by 6");                
            } else {
                System.out.println("The number is divisble by 2 but not by 3");
            }
        } else{
            System.out.println("The number is not divisble by 6");
        }
    }
}
