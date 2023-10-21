package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmployeesList {
    private List<Employee> employeeList;

    public EmployeesList(){
        employeeList = new ArrayList<>();
    }

    public void AddEmployee(Employee employee){
        employeeList.add(employee);
    }

    public List<Employee> FindWithLengtOfService(int lengtofservice){
        List<Employee> list = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getLengtOfservice() == lengtofservice) {
                list.add(employee);
            }
        }
        return list;
    }

    public void listOfPhones(String name){
        List<Employee> list= new ArrayList<>();
        for (Employee employee : employeeList) {
            if(employee.getName().equals(name)){
                list.add(employee);
            }
        }
        for (Employee employee: list
             ) {
            System.out.print(employee.getPhone()+ " ");
        }
    }

    public List<Employee>  FindWithId(int id){
        List<Employee> list= new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getPersonalID() == id) {
                list.add(employee);
            }
        }
        return list;
    }

    public static void printListnames(List<Employee> list){
        for (Employee emp: list
             ) {
            System.out.print(emp.getName() + " ");
        }
    }











}
