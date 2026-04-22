interface Payment {
    public abstract void pay(double amount);
}
class CC implements Payment{
    public void pay(double amount){
        System.out.println("CC Payment Amount"+amount);
    }
}
class GPay implements Payment{
    public void pay(double amount){
        System.out.println("GPay Payment Amount"+amount);
    }
}
class FlipkartPay implements Payment{
    public void pay(double amount){
        System.out.println("FlipKart Payment Amount"+amount);
    }
}
public class Test{
    public static void main(String[] args) {
        CC obj1=new CC();
        obj1.pay(1000.00);

        GPay obj2=new GPay();
        obj2.pay(2000.00);
        
        FlipkartPay obj3=new FlipkartPay();
        obj3.pay(3000.000);
    }
}