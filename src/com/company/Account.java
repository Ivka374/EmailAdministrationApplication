package com.company;

import javafx.scene.shape.StrokeLineCap;

public class Account {
    private String firstName;
    private String lastName;
    private Department department;
    private String email;
    private String password = generatePassword();
    private int mailboxCapacity;

    public Account(String firstName, String lastName, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.mailboxCapacity = 100;
        this.email = generateEmail(firstName, lastName, department);
    }

    public enum Department{
        SALES,
        DEVELOPMENT,
        ACCOUNTING
    }

    private String generateEmail(String firstName, String lastName, Department department){
        return firstName.toLowerCase() + "," + lastName.toLowerCase() + "@" + department.toString().toLowerCase() + ".company.com";
    }

    private String generatePassword(){
        // chose a Character random from this String
        String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"
                + "@#!$%&*()-_/|:;?<>";

        // create StringBuffer size of alphaNumericString
        StringBuilder sb = new StringBuilder(12);

        for (int i = 0; i < 12; i++) {

            // generate a random number between
            // 0 to alphaNumericString variable length
            int index
                    = (int)(alphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(alphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
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
