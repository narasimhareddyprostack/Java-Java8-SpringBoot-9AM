/**
 * Test.java - Alternative testing class with detailed output
 * Tests both SA and CA with various operations
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("=== BANKING SYSTEM - TEST CLASS ===\n");
        
        // Test Savings Account
        System.out.println("--- SAVINGS ACCOUNT TEST ---");
        SA sa = new SA(201, "Arjun", "arjun@email.com", "Bangalore", 100000);
        sa.setMin_Bal(2000);
        
        System.out.println("Initial balance details:");
        sa.cal_Bal();
        
        System.out.println("\nAfter deposit of 15000:");
        sa.deposit(15000);
        sa.cal_Bal();
        
        // Test Current Account
        System.out.println("\n--- CURRENT ACCOUNT TEST ---");
        CA ca = new CA(202, "Priya", "priya@email.com", "Pune", 85000);
        ca.setMin_Bal(10000);
        
        System.out.println("Initial balance details:");
        ca.cal_Bal();
        
        System.out.println("\nUpdating balance to 95000:");
        ca.setAcc_Bal(95000);
        ca.cal_Bal();
        
        // Demonstrate Encapsulation
        System.out.println("\n--- ENCAPSULATION DEMONSTRATION ---");
        System.out.println("Accessing SA minimum balance through getter:");
        System.out.println("SA Minimum Balance: " + sa.getMin_Bal());
        
        System.out.println("Accessing CA minimum balance through getter:");
        System.out.println("CA Minimum Balance: " + ca.getMin_Bal());
        
        System.out.println("\nTrying to set negative minimum balance:");
        sa.setMin_Bal(-500);  // Will reject this
        
        System.out.println("\n=== TEST COMPLETE ===");
    }
}
