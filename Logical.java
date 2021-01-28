public class Logical {
    public static void main(String[] args) {
        int a=5,b=9,c=7;
        boolean res =(a==b)&(b==c);
        System.out.println(res);
        c=50;
        res =(a==b) | (b==c);
        System.out.println(res); 
    }
}
