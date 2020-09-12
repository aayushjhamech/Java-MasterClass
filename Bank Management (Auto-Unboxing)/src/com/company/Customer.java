package com.company;

import java.util.ArrayList;

    public class Customer {
        String name;
        ArrayList<Double> transactions;

        public Customer(String name, double initialAmount) {
            this.name = name;
            this.transactions = new ArrayList();
            this.addTransactions(initialAmount);
        }

        public void addTransactions(double amount) {
            this.transactions.add(amount);
        }

        public String getName() {
            return this.name;
        }

        public ArrayList<Double> getTransactions() {
            return this.transactions;
        }
    }


