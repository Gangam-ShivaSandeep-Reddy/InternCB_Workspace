package com.java.acces_specifiers;

public class BankAccount {
    // Private field - accessible only within the BankAccount class
    private double balance;

    // Default (package-private) field - accessible within the same package
    String accountNumber;

    // Protected field - accessible within the same package and subclasses
    protected String accountHolderName;

    // Public field - accessible from anywhere
    public String bankName;

    // Static field - shared among all instances of the class
    static double interestRate = 3.5;

    // Private method - accessible only within the BankAccount class
    private void applyInterest() {
        balance += (balance * interestRate / 100);
    }

    // Default (package-private) method - accessible within the same package
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // Protected method - accessible within the same package and subclasses
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Public method - accessible from anywhere
    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }

    // Static method
    public static void setInterestRate(double rate) {
        interestRate = rate;
        System.out.println("Interest Rate Set To: " + interestRate);
    }

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, String bankName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.balance = initialBalance;
    }
    public class Main {
        public static void main(String[] args) {
            // Create a BankAccount object
            BankAccount account = new BankAccount("12345678", "Shia", "CBI Bank", 50000);

            // Access fields and methods with different access modifiers
            // account.balance; // Error: balance has private access in BankAccount
            // account.applyInterest(); // Error: applyInterest() has private access in BankAccount

            // Default (package-private) access
            System.out.println("Account Number: " + account.accountNumber);
            account.deposit(1000);

            // Protected access
            System.out.println("Account Holder Name: " + account.accountHolderName);
            account.withdraw(500);

            // Public access
            System.out.println("Bank Name: " + account.bankName);
            account.displayBalance();

            // Static method and field
            BankAccount.setInterestRate(4.0);
            System.out.println("Interest Rate: " + BankAccount.interestRate);
        }
    }
    

    
}
