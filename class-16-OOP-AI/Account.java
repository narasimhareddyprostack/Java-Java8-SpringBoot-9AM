/**
 * Account.java - Demonstrates INHERITANCE
 * Concrete implementation of Bank class
 * Common parent for all account types (CA, SA)
 */
public class Account extends Bank {
    protected String name;
    protected String email;
    protected String addr;
    
    /**
     * Constructor to initialize account holder details
     */
    public Account(String name, String email, String addr) {
        this.name = name;
        this.email = email;
        this.addr = addr;
    }
    
    /**
     * Empty implementation of abstract method
     * Subclasses will override with specific logic
     */
    @Override
    public void cal_Bal() {
        // Empty implementation - to be overridden by subclasses
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getAddr() {
        return addr;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAddr(String addr) {
        this.addr = addr;
    }
}
