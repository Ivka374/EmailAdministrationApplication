package com.company;

public class Account {
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password = generatePassword();
    private int mailboxCapacity;

    public Account(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.mailboxCapacity = 100;
        this.email = generateEmail(firstName, lastName, department);
    }

    private String generateEmail(String firstName, String lastName, String department){
        return firstName.toLowerCase() + "_" + lastName.toLowerCase() + "_" + department.toLowerCase() + "@abv.com";
    }

    private String generatePassword(){

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
}
