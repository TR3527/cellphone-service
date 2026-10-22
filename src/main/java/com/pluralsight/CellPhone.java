package com.pluralsight;

public class CellPhone {
    //serial number (1000000-999999)
    //model (ex:iphone X)
    //carrier
    //phoneNumber(800-555-5555)
    //owner

    //data
    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    //constructor
    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    /// /GET & SET

    //SN
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    //MODEL
    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //Carrier
    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    //PHONE NUMBER
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //OWNER
    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public void dial(String phoneNumber) {

        String dial = owner + "'s " + "phone is calling " + phoneNumber;

        System.out.println(dial);

//        //or
//        public String dial(String phoneNumber) {
//
//            String dial = owner + "'s phone is calling " + phoneNumber;
//
//            return dial;
//        }


    }




}
