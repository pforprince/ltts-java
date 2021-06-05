/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdassignment.area;

/**
 *
 * @author Benzee
 */
public class Circle extends Shape {

    double area;

    double calculateArea(int value) {
        return 3.14 * value * value;
    }
}
