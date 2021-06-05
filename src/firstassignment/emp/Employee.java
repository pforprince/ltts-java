/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment.emp;

/**
 *
 * @author Benzee
 */
public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nMobile: " + mobile;
    }

}
