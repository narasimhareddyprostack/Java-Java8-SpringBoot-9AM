public class Test {
    public static void main(String[] args) {
        SA sa=new SA(101,"Rahul",
                             "rg@gmail.com","Bangalore",5000.00);
        sa.setMin_Bal(500);

        sa.cal_Bal();

        sa.deposit(4000);
        System.out.println("After Depositing");
        sa.cal_Bal();

        System.out.println("Current Account class");
        CA ca=new CA(1001, "Sonia", "sg@gmail.com", "Bangalore", 25000.00);
        ca.setMin_Bal(5000.00);
        ca.cal_Bal();
    }
}