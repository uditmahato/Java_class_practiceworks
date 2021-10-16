class Calculator{
    public static int add(int a,int b) {
        return(a+b);

    }
    public static int add(int a,int b,int c)
    {
        return(a+b+c);

    }
    public static String add(String test)
    {
        return("Hello"+test);

    }
    
}
public class CalDemo {
    public static void main(String[] args) {
        System.out.println("Sum"+(Calculator.add(10,20)));
        System.out.println("Sum"+(Calculator.add(10,20,30)));
        System.out.println((Calculator.add("World")));
        System.out.println(Calculator)
        
    }
}
