//W.A.P to reverse a string
public class RevStr {
    public static void main(String[] args) {
        String ToRev="HELLO WORLD";
        String Rev=" ";
        int count=ToRev.length();
        while(count!=0){
            Rev=Rev+ToRev.charAt(count-1);
            count--;
        }
        System.out.println(Rev);
    }
}
