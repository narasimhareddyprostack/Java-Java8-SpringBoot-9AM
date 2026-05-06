/**
 * CA.java - Current Account
 * Demonstrates INHERITANCE and METHOD OVERRIDING (POLYMORPHISM)
 * Implements specific CA logic with minimum balance concept
 */
public class CA extends Account {
    private int acc_Id;
    private double acc_Bal;
    private double min_Bal;
    
    /**
     * Constructor - demonstrates constructor chaining with super()
     */
    public CA(int id, String name, String email, String addr, double amount) {
        super(name, email, addr);  // Calls parent (Account) constructor
        this.acc_Id = id;
        this.acc_Bal = amount;
        this.min_Bal = 0;
    }
    
    /**
     * Overrides abstract method from Bank
     * Demonstrates POLYMORPHISM - same method, different implementation
     */
    @Override
    public void cal_Bal() {
        double availableBal = acc_Bal - min_Bal;
        System.out.println("Current Account (" + name + ")");
        System.out.println("Account ID: " + acc_Id);
        System.out.println("Total Balance: " + acc_Bal);
        System.out.println("Minimum Balance: " + min_Bal);
        System.out.println("Available Balance: " + availableBal);
        System.out.println("---");
    }
    
    // Encapsulation - Getters and Setters
    public int getAcc_Id() {
        return acc_Id;
    }
    
    public void setAcc_Id(int acc_Id) {
        this.acc_Id = acc_Id;
    }
    
    public double getAcc_Bal() {
        return acc_Bal;
    }
    
    public void setAcc_Bal(double acc_Bal) {
        this.acc_Bal = acc_Bal;
    }
    
    public double getMin_Bal() {
        return min_Bal;
    }
    
    public void setMin_Bal(double min_Bal) {
        if (min_Bal >= 0) {
            this.min_Bal = min_Bal;
        } else {
            System.out.println("Minimum balance cannot be negative!");
        }
    }
}
