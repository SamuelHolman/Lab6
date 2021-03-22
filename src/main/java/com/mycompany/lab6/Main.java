/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab6;

/**
 *
 * @author Locke
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        /*System.out.println(employee1.getName() + "\t" + employee1.getIdNumber() + "\t" + employee1.getDepartment() + "\t" + employee1.getPosition());
        System.out.println(employee2.getName() + "\t" + employee2.getIdNumber() + "\t" + employee2.getDepartment() + "\t" + "\t" + employee2.getPosition());
        System.out.println(employee3.getName() + "\t" + employee3.getIdNumber() + "\t" + employee3.getDepartment() + "\t" + employee3.getPosition());
        */
        
        employee1.PrintEmployeeInformation();
        employee2.PrintEmployeeInformation();
        employee3.PrintEmployeeInformation();
        
    } 
}
