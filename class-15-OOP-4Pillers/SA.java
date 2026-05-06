public class SA extends Account{
    int acc_Id;
    double acc_Bal;
    private double min_Bal;
    public SA(int id,String name,String email,String addr,double amount){
        super(name,email,addr); //invoking parent class constructor
        this.acc_Id=id;
        this.acc_Bal=amount;
    }
    public double getMin_Bal() {
        return min_Bal;
    }
    public void setMin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;
    }
    public void deposit(double amount){
        this.acc_Bal=this.acc_Bal+amount;
    }
    public void cal_Bal(){
        System.out.println(this.acc_Bal - getMin_Bal());
    }
    
}