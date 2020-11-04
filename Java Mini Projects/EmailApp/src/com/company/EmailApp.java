package com.company;

import java.util.Scanner;

public class EmailApp {

        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private int mailCapacity;
        private String altMail;

        public EmailApp(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println("Email created for: "+firstName+" "+lastName);
            this.department= setDepartment();
            System.out.println("Your Department: "+this.department);
            this.password= randomPass(8);
            System.out.println("Your random pass: "+this.password);
            System.out.println("Your mail: "+getEmail(this.firstName, this.lastName, this.department));
        }

        private String setDepartment() {
            System.out.println("Please enter the department number: 1) Sales\n2) Development\n3) Accounting");
            Scanner sc= new Scanner(System.in);
            int depChoice= sc.nextInt();
            if(depChoice==1){return "sales";}
            else if(depChoice==2){return "development";}
            else if(depChoice==3){return "accounting";}
            else{return " ";}
        }

        private String randomPass(int length){
            String passSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789*@#%$!";
            char[] password= new char[length];
            for(int i=0; i<length; i++){
                int rand= (int) (Math.random()*passSet.length());
                password[i]= passSet.charAt(rand);
            }
            return new String(password);
        }

        private String getEmail(String firstName, String lastName, String department){
            return firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+".company.com";
        }

        public void setMailCapacity(int capacity){
            this.mailCapacity=capacity;
        }

    public void setAltMail(String altMail) {
        this.altMail = altMail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getMailCapacity() {
        return mailCapacity;
    }

    public String getAltMail() {
        return altMail;
    }
}


