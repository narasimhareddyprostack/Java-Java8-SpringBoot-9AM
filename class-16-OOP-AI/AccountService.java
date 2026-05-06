/**
 * AccountService.java - Service class demonstrating POLYMORPHISM
 * Accepts any Account subtype and calls appropriate implementation
 */
public class AccountService {
    /**
     * Static method demonstrating polymorphic behavior
     * Parameter accepts any Account subtype (CA or SA)
     * Automatically calls the correct cal_Bal() implementation
     * This is RUNTIME POLYMORPHISM (method overriding)
     */
    public static void getService(Account a) {
        a.cal_Bal();  // Calls appropriate implementation based on object type
    }
}
