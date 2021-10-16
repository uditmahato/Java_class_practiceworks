//W.A.P to reverse num
public class RevNum {
    public static void main(String[] args) {
        int num=984072;
        int remain ,rev=0;
        while(num!=0){
            remain=num%10;
            rev=(rev*10)+remain;
            num=num/10;
        }
        System.out.println(rev);
    }
}
