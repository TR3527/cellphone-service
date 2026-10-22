package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void display(CellPhone phone){

        System.out.println(phone.getOwner());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getModel());



    }
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();

        CellPhone myPhone2 = new CellPhone();




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

//
        System.out.print("What is the serial number? ");
        int serialNumber2 = read.nextInt();
        read.nextLine();
        System.out.print("What model is the phone? ");
        String model2 = read.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier2 = read.nextLine();
        System.out.print("What is the phone number? ");
        String phoneNumber2 = read.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner2 = read.nextLine();

        myPhone2.setSerialNumber(serialNumber2);
        myPhone2.setModel(model2);
        myPhone2.setCarrier(carrier2);
        myPhone2.setPhoneNumber(phoneNumber2);
        myPhone2.setOwner(owner2);

        System.out.println(" ");

        System.out.println(myPhone2.getSerialNumber());
        System.out.println(myPhone2.getModel());
        System.out.println(myPhone2.getCarrier());
        System.out.println(myPhone2.getPhoneNumber());
        System.out.println(myPhone2.getOwner());

        //System.out.println(myPhone.dial(phoneNumber));
        //other display method ^

        myPhone.dial(phoneNumber);

        display(myPhone);
        //myPhone2.setOwner("Test");
        display(myPhone2);

        myPhone.dial(myPhone2.getPhoneNumber());

        myPhone2.dial(myPhone.getPhoneNumber());










    }
}
