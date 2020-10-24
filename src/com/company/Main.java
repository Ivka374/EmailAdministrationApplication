package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Account riley = new Account("Riley", "Simmons", Account.Department.ACCOUNTING);
        System.out.println(riley.getName());
        System.out.println(riley.getEmail());
        changePassword(riley);*/



    }

    public static void changePassword(Account account){
        System.out.println("Please enter your current password to continue: ");
        Scanner scanner = new Scanner(System.in);
        String entry = scanner.next();
        if (entry.equals(account.getPassword())){
            System.out.println("Please enter your new password: ");
            String newPassword = scanner.next();
            account.setPassword(newPassword);
        } else System.out.println("Wrong password");
    }
}
