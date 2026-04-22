class Account {
    public  void open_Account(){
        System.out.println("Account Opened Successfully");
    }
    public void deposit(){
        System.out.println("Amount Deposited");
    }
    public void withdrawl(){
        System.out.println("Withdrawl successfully!");
    }
    public static void main(String[] args) {
        int eid   =101;
        Account a1=new Account();
        a1.open_Account();
        a1.deposit();
        a1.withdrawl();
    }
}
