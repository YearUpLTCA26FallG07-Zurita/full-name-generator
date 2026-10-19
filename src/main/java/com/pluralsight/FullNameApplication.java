package com.pluralsight;

import java.util.*;
public class FullNameApplication {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name.");

        System.out.print("First name: ");
        String firstName = myScanner.nextLine();

        System.out.print("Middle name: ");
        String middleName = myScanner.nextLine();

        System.out.print("Last name: ");
        String lastName = myScanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = myScanner.nextLine();

        String fullName = firstName;
        if (!middleName.isEmpty()){
            fullName += " " + middleName;
        }
        fullName += " " + lastName;
        if (!suffix.isEmpty()){
            fullName += ", " + suffix;
        }

        System.out.printf("%nFull name: ");
        System.out.println(fullName);

    }
}
