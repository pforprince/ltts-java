/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment.emp;

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
        System.out.println(employee.toString());
        System.out.println("Verify and Update the details: \n"
                + "Menu");
        System.out.println("1.Update Employee name\n2.Update Employee Address\n3.Update Employee mobile\n4.All information correct/Exit");
        boolean value = true;
        while (value) {
            System.out.println("Menu\n1.Update Employee name\n2.Update Employee Address\n3.Update Employee mobile\n4.All information correct/Exit");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Current Name is: " + employee.getName() + " \nEnter the name:");
                    employee.setName(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Current Address is: " + employee.getAddress() + " \nEnter the Address:");
                    employee.setAddress(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Current Mobile is: " + employee.getMobile() + " \nEnter the Mobile:");
                    employee.setMobile(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("The details are\n" + employee.toString());
                    value = false;
                    break;

            }
        }

    }

}
