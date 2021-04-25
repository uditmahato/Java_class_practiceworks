class Shape{
   Double length;
   Double breadth;
   Double area;
  Shape(double l, double b)
   {
      length = l;
      breadth  = b;
   
}
void getShapeType(){
    if(length==breadth){
        System.out.println("The given shape is square");
    }
    else{
        System.out.println("The given shape is Rectangle");
}
}
void area(){
    area= length*breadth;
    if(length==breadth){
        System.out.println("Area of Square is : " + area);
    }
    else{
        System.out.println("Area of Rectangle is : " + area);
    }
}
}
public class ConstArea {
    public static void main(String[] args) {
        Shape a=new Shape(4,5);
        a.getShapeType();
        a.area();
    }
}

