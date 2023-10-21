package com.company;

public class Main {

    public static void main(String[] args) {
        EmployeesList list = new EmployeesList();
        Employee one = new Employee(12,1233,"john",3);
        Employee two = new Employee(11,1245,"lena",5);
        Employee three = new Employee(5,1333,"mark",3);
        Employee four = new Employee(6,2345,"mark",7);
        list.AddEmployee(one);
        list.AddEmployee(two);
        list.AddEmployee(three);
        list.AddEmployee(four);

        EmployeesList.printListnames(list.FindWithLengtOfService(3));
        System.out.println();
        list.listOfPhones("lena");
        System.out.println();
        EmployeesList.printListnames(list.FindWithId(6));


    }


}
