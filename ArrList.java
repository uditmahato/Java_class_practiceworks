import  java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class ArrList {
    
    public static void main(String[] args) throws IOException   {
        Scanner sc = new Scanner(System.in);
        int finalcost=0;
        int id=1;
        
        ArrayList<String > name = new ArrayList<String>();
        ArrayList<Integer > price = new ArrayList<Integer>();
        FileWriter myWrite =new FileWriter("hello1.txt");
       try{
           for(int i=0;i<3 ;i++){
            System.out.println("enter name");
        name.add(sc.next());
           System.out.println("enter price");
        price.add(sc.nextInt());
        
       
        }
           
           myWrite.write("ID "+"        "+"costomer name "+"         " +"price" +System.lineSeparator());
           
        for (String s : name ){
             myWrite.write(id+ "  ");
        id++;
          
        myWrite.write(   "               "+s+"              "   );
        
        
         for(Integer k :price){
            if(k>1000){
                finalcost = (int)(k-k*0.1);
                myWrite.write(finalcost +System.lineSeparator());
                
                 
                
                 
            }
            else if(k<1000){
            finalcost =(int)(k-k*0.05);
            myWrite.write( finalcost +System.lineSeparator());
            
            } else{
               break;
            }
          
        }
         
       
}
       
        myWrite.close();
        
     
    }
       catch(Exception e){
           
           System.out.println("sorry ");
       }
    }
  
}