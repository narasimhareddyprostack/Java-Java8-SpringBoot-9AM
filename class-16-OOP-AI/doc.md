# OOP Features Documentation - Banking System

## Project Overview
This is a banking system that demonstrates the **4 Pillars of OOP** (Abstraction, Inheritance, Encapsulation, Polymorphism) through account management hierarchy with Savings Account (SA) and Current Account (CA) types.

---

## 1. ABSTRACTION

**Definition**: Hiding complex implementation details and showing only essential features.

### Implementation in Your Code:
- **Bank.java**: Abstract class that defines the contract
  ```java
  public abstract class Bank {
      public abstract void cal_Bal();  // Only signature, no implementation
  }
  ```
  - Forces all subclasses to implement `cal_Bal()` method
  - Hides internal balance calculation logic from users
  - User doesn't need to know HOW balance is calculated, just that it CAN be calculated

**Real-world Analogy**: Like a bank's internal operation—customers don't see the behind-the-scenes logic, just the results.

---

## 2. INHERITANCE

**Definition**: A class inherits properties and methods from a parent class (reusability).

### Inheritance Hierarchy:
```
Bank (abstract parent)
  ↓
Account (concrete child of Bank)
  ├─ CA (Current Account - child of Account)
  └─ SA (Savings Account - child of Account)
```

### Examples:

| Class | Inherits From | Inherits | Implementation |
|-------|---------------|----------|-----------------|
| Account.java | Bank | `cal_Bal()` method | Provides empty implementation |
| CA.java | Account | All Account properties + `cal_Bal()` | Overrides with specific logic |
| SA.java | Account | All Account properties + `cal_Bal()` | Overrides with specific logic + adds `deposit()` |

### Code Example (Constructor Chaining):
```java
public CA(int id, String name, String email, String addr, double amount) {
    super(name, email, addr);  // Calls parent (Account) constructor
    this.acc_Id = id;
    this.acc_Bal = amount;
}
```

**Benefits**: Code reuse, maintainability, reduced redundancy

---

## 3. POLYMORPHISM

**Definition**: Same method name, different implementations based on object type.

### Method Overriding:
The `cal_Bal()` method is implemented differently in each class:

| Class | Implementation |
|-------|-----------------|
| Bank.java | Abstract (no body) |
| Account.java | Empty implementation `{}` |
| CA.java | Prints `acc_Bal - min_Bal` |
| SA.java | Prints `acc_Bal - min_Bal` |

### Polymorphic Behavior (Demo.java):
```java
AccountService.getService(sa1);  // Calls SA's cal_Bal()
AccountService.getService(ca1);  // Calls CA's cal_Bal()
```

The same method call produces **different outputs** depending on the object type—this is **runtime polymorphism** (method overriding).

**Real-world Analogy**: Like a "Move" command—a car moves differently than a bird, but both respond to the same "move" instruction.

---

## 4. ENCAPSULATION

**Definition**: Bundling data (variables) and methods together, restricting direct access to sensitive data.

### Implementation (CA.java & SA.java):
```java
private double min_Bal;  // Private - hidden from outside

public double getMin_Bal() {
    return min_Bal;
}

public void setMin_Bal(double min_Bal) {
    this.min_Bal = min_Bal;
}
```

**Benefits**:
- Prevents direct modification of `min_Bal` from outside
- Allows control over how data is modified
- Protects data integrity

### Usage (Test.java):
```java
sa.setMin_Bal(500);      // Controlled access through setter
double bal = sa.getMin_Bal();  // Controlled access through getter
```

---

## 5. KEY OOP CONCEPTS DEMONSTRATED

| Concept | Where Used | Purpose |
|---------|-----------|---------|
| **Abstract Class** | Bank.java | Define contract, prevent instantiation |
| **Inheritance** | Account→CA, Account→SA | Code reuse, hierarchy |
| **Method Overriding** | cal_Bal() in CA, SA | Polymorphic behavior |
| **Constructor Chaining** | super() calls | Initialize parent class data |
| **Encapsulation** | private min_Bal + getters/setters | Data protection |
| **Polymorphic Parameter** | AccountService.getService(Account a) | Accept any Account subtype |

---

## 6. FILE DESCRIPTIONS

### Bank.java
- **Purpose**: Abstract base class defining the banking contract
- **Key Feature**: Abstract method `cal_Bal()` that all subclasses must implement

### Account.java
- **Purpose**: Concrete implementation of Bank, common parent for account types
- **Features**: 
  - Stores account holder information (name, email, address)
  - Constructor to initialize these details
  - Empty implementation of `cal_Bal()`

### CA.java (Current Account)
- **Purpose**: Specific current account implementation
- **Features**:
  - Account ID and balance storage
  - Private minimum balance with getter/setter (encapsulation)
  - Overridden `cal_Bal()` to calculate balance after minimum balance deduction

### SA.java (Savings Account)
- **Purpose**: Specific savings account implementation
- **Features**:
  - Account ID and balance storage
  - Private minimum balance with getter/setter
  - Overridden `cal_Bal()` method
  - Additional `deposit()` method for deposits

### AccountService.java
- **Purpose**: Service class demonstrating polymorphism
- **Key Method**: Static `getService(Account a)` accepts any Account subtype
  ```java
  public static void getService(Account a) {
      a.cal_Bal();  // Calls appropriate implementation based on object type
  }
  ```

### Demo.java
- **Purpose**: Main demonstration of polymorphic behavior
- **Flow**:
  1. Creates SA and CA objects
  2. Sets minimum balance for each
  3. Calls polymorphic service method

### Test.java
- **Purpose**: Alternative testing with more detailed output
- **Features**: Tests both SA and CA with deposit operations

---

## 7. EXECUTION FLOW

### Demo.java Execution:
1. Create SA object (Savings Account for Rahul)
2. Create CA object (Current Account for Sonia)
3. Set minimum balance for each (encapsulation—using setters)
4. Call `AccountService.getService()` with polymorphic parameters
5. Method automatically calls the correct `cal_Bal()` implementation

### Test.java Execution:
1. Create SA and CA objects
2. Set minimum balance
3. Call `cal_Bal()` on SA
4. Deposit amount into SA
5. Call `cal_Bal()` again on SA after deposit
6. Call `cal_Bal()` on CA

---

## 8. SUMMARY TABLE - 4 OOP PILLARS

| OOP Pillar | Code Location | Implementation |
|-----------|----------------|-----------------|
| **Abstraction** | Bank.java | Abstract class with abstract method `cal_Bal()` |
| **Inheritance** | Account, CA, SA | Multi-level inheritance: Bank → Account → (CA, SA) |
| **Polymorphism** | `cal_Bal()` override | Different implementations per class; same method call produces different results |
| **Encapsulation** | min_Bal field (CA, SA) | Private variable + public getter/setter methods |

---

## 9. KEY TAKEAWAYS

✓ **Abstraction** simplifies complexity by hiding implementation details  
✓ **Inheritance** promotes code reuse through hierarchical relationships  
✓ **Polymorphism** enables flexible, extensible code through method overriding  
✓ **Encapsulation** protects data integrity through access control  

This banking system is an excellent real-world example of applying all 4 OOP pillars effectively!