class Account{
    double balance;
    Account(double balance){
        this.balance = balance;
    }
    double getBalance(){
        return balance;
    }
    void withdraw(){
        double balance=getBalance();
        double amt;
        if(balance<amt){
           System.out.println("Fail Transaction");
        }else{
            System.out.println("Decrement balance by amount "+amt);
        }
    }
}
public class TestBanking {
    public static void main(String[] args){

    }
}