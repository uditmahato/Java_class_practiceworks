//W.A.P to reverse a num using for loop
public class RevNum2 {
    public static void main(String[] args) {
        int num=6488294;
        int remainder=0,rev=0;
        for(;num!=0;num/=10){
            remainder=num%10;
            rev=rev*10+remainder;
        } 
        System.out.println(rev);
    }
}
