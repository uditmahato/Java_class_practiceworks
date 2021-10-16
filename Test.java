//demonstrate the use of this keyword 
class Box{
    double length;
    double breadth;
    double height;
    String color;
    public Box(double length,double breadth,double height,String color)
    {
        // instance variable hiding 
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.color = color;
    }
    double volume()
    {
        return (this.length*this.breadth*this.height);
    }
    Box compareVolume(Box temp)
    {
        if(this.volume() > temp.volume() )
        return this;
        else 
        return temp;
    }
}
public class Test {
    public static void main(String[] args){
        Box b1 = new Box(10,20,30,"blue");
        Box b2 = new Box(15,30,40,"red");
        Box obj =  b1.compareVolume(b2);
        System.out.println(obj.color+" color box has highest volume");
    }
    
}
