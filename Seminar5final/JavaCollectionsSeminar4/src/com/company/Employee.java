package com.company;

public class Employee {

    private int personalID;
    private int phone;
    private String name;
    private int lengtOfservice;


    public Employee(int personalID, int phone, String name, int lengtOfservice) {
        this.personalID = personalID;
        this.phone = phone;
        this.name = name;
        this.lengtOfservice = lengtOfservice;
    }


    public int getPersonalID() {
        return personalID;
    }

    public int getLengtOfservice() {
        return lengtOfservice;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }
}
