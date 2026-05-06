public class CA extends Account{
    int acc_Id;
    double acc_Bal;
    private double min_Bal;
    public CA(int id,String name,String email,String addr,double amount){
        super(name,email,addr);
        this.acc_Id=id;
        this.acc_Bal=amount;
    }
    public double getMin_Bal() {
        return min_Bal;
    }
    public void setMin_Bal(double min_Bal) {
        this.min_Bal = min_Bal;
    }
    public void cal_Bal(){
        System.out.println(this.acc_Bal-getMin_Bal());
    }
}