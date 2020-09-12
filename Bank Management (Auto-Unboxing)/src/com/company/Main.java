package com.company;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");
        bank.addBranch("Bengaluru");
        bank.addCustomer("Bengaluru", "Aayush", 2.0E7D);
        bank.addCustomer("Deoghar", "Simmy", 5523651.0D);
        bank.addBranch("Deogahr");
        bank.addBranch("Pune");
        bank.addCustomer("Pune", "Jha", 5235456.0D);
        bank.addCustomer("Pune", "jnwcb", 5.8648154E7D);
        bank.addCustomerTransaction("Bengaluru", "Aayush", 23522.0D);
        bank.addCustomerTransaction("Bengaluru", "Aayush", 23662.0D);
        bank.addCustomerTransaction("Deoghar", "Simmy", 6391.0D);
        bank.listCustomers("Bengaluru", true);
    }
}
