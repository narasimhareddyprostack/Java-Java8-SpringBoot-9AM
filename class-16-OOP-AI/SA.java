/**
 * SA.java - Savings Account
 * Demonstrates INHERITANCE and METHOD OVERRIDING (POLYMORPHISM)
 * Includes specific SA logic and additional deposit() method
 */
public class SA extends Account {
    private int acc_Id;
    private double acc_Bal;
    private double min_Bal;
    
    /**
     * Constructor - demonstrates constructor chaining with super()
     */
    public SA(int id, String name, String email, String addr, double amount) {
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
        System.out.println("Savings Account (" + name + ")");
        System.out.println("Account ID: " + acc_Id);
        System.out.println("Total Balance: " + acc_Bal);
        System.out.println("Minimum Balance: " + min_Bal);
        System.out.println("Available Balance: " + availableBal);
        System.out.println("---");
    }
    
    /**
     * Additional method specific to Savings Account
     * Demonstrates specific functionality for SA
     */
    public void deposit(double amount) {
        if (amount > 0) {
            acc_Bal += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + acc_Bal);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
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
