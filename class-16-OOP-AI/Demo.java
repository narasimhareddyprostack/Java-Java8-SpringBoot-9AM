/**
 * Demo.java - Main demonstration of OOP concepts and POLYMORPHISM
 * Shows how the same method call produces different outputs based on object type
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("=== BANKING SYSTEM - OOP DEMONSTRATION ===\n");
        
        // Create Savings Account for Rahul
        SA sa1 = new SA(101, "Rahul", "rahul@email.com", "Mumbai", 50000);
        
        // Create Current Account for Sonia
        CA ca1 = new CA(102, "Sonia", "sonia@email.com", "Delhi", 75000);
        
        System.out.println("--- Setting Minimum Balances (ENCAPSULATION) ---");
        sa1.setMin_Bal(1000);  // Using setter - encapsulation
        ca1.setMin_Bal(5000);  // Using setter - encapsulation
        System.out.println();
        
        System.out.println("--- Polymorphic Method Calls ---");
        System.out.println("Calling getService() with SA object:");
        AccountService.getService(sa1);  // Calls SA's cal_Bal()
        
        System.out.println("\nCalling getService() with CA object:");
        AccountService.getService(ca1);  // Calls CA's cal_Bal()
        
        System.out.println("\nSame method call, DIFFERENT outputs based on object type!");
        System.out.println("This is RUNTIME POLYMORPHISM (Method Overriding)\n");
        
        System.out.println("--- Deposit Operation (SA specific method) ---");
        sa1.deposit(5000);
        System.out.println("\nBalance after deposit:");
        AccountService.getService(sa1);
    }
}
