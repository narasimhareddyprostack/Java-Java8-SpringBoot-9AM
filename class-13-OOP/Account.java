public class Account {
    //instance variable
    int acc_Id;
    String acc_Name;
    double acc_Bal;

    public Account(int id, String name,double amount){
        this.acc_Id=id;
        this.acc_Name=name;
        this.acc_Bal=amount;
    }
    public void depoist(double amount){
        this.acc_Bal=this.acc_Bal+amount;
    }
    public void withdrawl(double amount){
         this.acc_Bal=this.acc_Bal+amount;
    }
    public double get_Bal(){
        return this.acc_Bal-500.00;
    }
    public static void main(String[] args) {
        Account a1=new Account(101,"Rahul",5000.50);
        Account a2=new Account(102,"Sonia",25000.50);
        a1.depoist(500.00);
        a1.depoist(500.00);
        a1.withdrawl(50);
        System.out.println(a1.get_Bal());
        System.out.println(a2.get_Bal());
    }
}
