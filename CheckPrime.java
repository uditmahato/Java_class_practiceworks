public class CheckPrime {
    public static void main (String[] args){
        int num= 13;
        int count=0;
        for(int i=1;i<=11;i++){
            if (num%i==0)
            count++;
        }
        if(count<=2){
            System.out.println(num +" is a prime number");
        }
        else {
            System.out.println(num +" is not a prime number");
        }
        
    }
}