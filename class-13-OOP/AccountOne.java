public class AccountOne{

    public void deposit_amount(double amount){
        System.out.println("Amount Deposited successfully");    
    }
    
    public static void main(String[] args) {
        AccountOne a1=new AccountOne(101,"Rahul",5000.00);
        a1.deposit_amount(1000.00);
    }
}