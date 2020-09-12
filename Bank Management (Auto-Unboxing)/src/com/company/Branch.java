package com.company;

import java.util.ArrayList;

    public class Branch {
        private String name;
        ArrayList<Customer> customer;

        public Branch(String custName) {
            this.name = custName;
            this.customer = new ArrayList();
        }

        public String getName() {
            return this.name;
        }

        public ArrayList<Customer> getCustomer() {
            return this.customer;
        }

        public boolean newCustomer(String custName, double initialAmount) {
            if (this.findCustomer(custName) == null) {
                this.customer.add(new Customer(custName, initialAmount));
                return true;
            } else {
                return false;
            }
        }

        public boolean newTransaction(String custName, double amount) {
            Customer existingCust = this.findCustomer(custName);
            if (existingCust != null) {
                existingCust.addTransactions(amount);
                return true;
            } else {
                return false;
            }
        }

        private Customer findCustomer(String custName) {
            for(int i = 0; i < this.customer.size(); ++i) {
                if (((Customer)this.customer.get(i)).name == custName) {
                    return (Customer)this.customer.get(i);
                }
            }

            return null;
        }

}
