/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdassignment.area;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        System.out.println("Circle\nSquare\nEnter the shape");
        Scanner scanner = new Scanner(System.in);
        String val = scanner.next();
        if (val.toLowerCase().equals("circle")) {
            Circle circle = new Circle();
            System.out.println("Enter the Radius:");
            int value = scanner.nextInt();
            circle.setValue(value);
            System.out.println("Area of Circle is: " + circle.calculateArea(circle.getValue()));
        } else if (val.toLowerCase().equals("square")) {
            Square square = new Square();
            System.out.println("Enter the Side:");
            int value = scanner.nextInt();
            square.setValue(value);
            System.out.println("Area of Square is: " + square.calculateArea(square.getValue()));
        }
    }
}
