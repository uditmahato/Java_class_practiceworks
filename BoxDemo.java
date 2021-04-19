class Box{
//four instance of variable of the box which is defined
int length;
int breadth;
int height;
String color;
//define some method
void volume(){
    int vol;
    vol=length*breadth*height;
    System.out.println(vol);
}

int volume1() {
    int vol;
    vol = length * breadth * height;
    System.out.println(vol);
    return vol;
}
}
public class BoxDemo {
    public static void main(String[] args){
        //a box object is created here
        Box myBox = new Box();
        myBox.length=10;
        myBox.breadth=15;
        myBox.height=20;
        myBox.color="red";
        System.out.println("Volume of the box is " + (myBox.length*myBox.breadth*myBox.height)+"cubic meter");
        //Creating another  box
        Box myBox2=new Box();
        Box myBox3=new Box();
        myBox3=myBox2;
        myBox2.length=25;
        myBox2.breadth=50;
        myBox2.height=75;
        myBox2.color= "blue";
        myBox2.volume();
        myBox3.length=250000;
        volm=myBox2.volume1();
        System.out.println(volm);
        System.out.println("Volume of the box is " + (myBox2.length * myBox2.breadth * myBox2.height) + "cubic meter");
    }
}
