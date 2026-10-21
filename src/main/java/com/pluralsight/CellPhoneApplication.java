package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();

       // myPhone.setModel("iphone x");

        System.out.print("What is the serial number? ");
        int serialNumber = read.nextInt();
        read.nextLine();
        System.out.print("What model is the phone? ");
        String model = read.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier = read.nextLine();
        System.out.print("What is the phone number? ");
        String phoneNumber = read.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = read.nextLine();

        myPhone.setSerialNumber(serialNumber);
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        System.out.println(" ");

        System.out.println(myPhone.getSerialNumber());
        System.out.println(myPhone.getModel());
        System.out.println(myPhone.getCarrier());
        System.out.println(myPhone.getPhoneNumber());
        System.out.println(myPhone.getOwner());













    }
}
