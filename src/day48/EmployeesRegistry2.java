package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeesRegistry2 {
    public static void main(String[] args) {

        //Employee is an abstract super type
        //Hourly and FullTimeEmployee are specific types
        // if we have Employee data type for e1 variable
        //we can write down the address of anything IS-A Employee

        Employee e1 = new HourlyEmployee("Tamila", 07, 68, 2080);
        //e1.calculateAnnualSalary();
        //re-assigning
        e1 = new FullTimeEmployee("Alimat", 01, 10000);
        //e1.calculateAnnualSalary();

        Employee e2 = new HourlyEmployee("Tam", 103, 57, 2080);
        Employee e3 = new FullTimeEmployee("Tamtam", 104, 13000);

        //what is the easiest way to store these 3 objects together

//        List<Employee> allEmployee = Arrays.asList(e1, e2, e3);
//        for (Employee eachEmployee:allEmployee) {
//            System.out.println(eachEmployee);
//        }

        List<Employee> allEmployee = Arrays.asList(e1, e2, e3);
        for (Employee eachEmployee:allEmployee) {
            System.out.println("Name: "+eachEmployee.name);
            eachEmployee.calculateAnnualSalary();
        }

    }

}
