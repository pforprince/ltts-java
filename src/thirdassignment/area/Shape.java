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
public abstract class Shape {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    abstract double calculateArea(int value);
}
