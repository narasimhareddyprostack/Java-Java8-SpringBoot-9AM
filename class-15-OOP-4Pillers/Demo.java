public class Demo {
    public static void main(String[] args) {
        SA sa1=new SA(101,"Rahul","rg@gmail.com","Bangalore",5000.00);
        CA ca1=new CA(1001, "Sonia", "sg@gmail.com", "Bangalore", 25000.00);
        sa1.setMin_Bal(500);
        ca1.setMin_Bal(5000);
        
        AccountService.getService(sa1);
        AccountService.getService(ca1);
    }
}
