class Rectangle{
    double length;
    double breadth;
    //constructor for rectangle
    Rectangle(){
        length=10;
        breadth=20;
    }
    //parameterized constructor
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    void area(){
        double a;
        a=length*breadth;
        System.out.println("area : "+a);
    }
    
    void perimeter() {
        double p;
        p = 2*(length * breadth);
        System.out.println("perimeter : " + p);
    }
}
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rec =new Rectangle();
        System.out.println(rec.length+rec.breadth);
        rec.area();
      rec.perimeter();
    }
}
