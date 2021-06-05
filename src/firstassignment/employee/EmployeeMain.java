/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        employee.setName(scanner.next());
        System.out.println("Enter Address");
        employee.setAddress(scanner.next());
        System.out.println("Enter Mobile");
        employee.setMobile(scanner.next());

        System.out.println("Employee Details:" + "\n" + employee.toString());
    }
}
