public class ContinueStat {
    public static void main (String[] args){
        for(int i=0;i<=10;i++){
            if(i==2||i==5)
            continue;
            else
            System.out.println("Loop # " + i);
          }
            System.out.println("Two numbers omitted");
    }
}
