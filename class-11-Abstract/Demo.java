abstract class Payment{
    abstract void pay(double amount);
}

class UPI extends Payment{
    void pay(double amount){
        System.out.println("UPI Payment Amount:"+amount);
    }
}
class CC extends Payment{
    void pay(double amount){
        System.out.println("CC Payment Amount:"+amount);
    }
}
public class Demo {
    public static void main(String[] args) {
        UPI obj1=new UPI();
        CC obj2=new CC();
        obj1.pay(5000.00);
        obj2.pay(15000.00);
    }
}
