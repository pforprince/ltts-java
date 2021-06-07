/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondassignment.second;

/**
 *
 * @author Benzee
 */
public class DeluxeRoom extends HotelRoom {

    private int ratePerSqFeet;

    public DeluxeRoom(int ratePerSqFeet, String hotelName, boolean hasTV, boolean hasWIFI, int numberOfSqFeet) {
        super(hotelName, hasTV, hasWIFI, numberOfSqFeet);
        this.ratePerSqFeet = 10;
    }

    public DeluxeRoom(String hotelName, boolean hasTV, boolean hasWIFI, int numberOfSqFeet) {
        super(hotelName, hasTV, hasWIFI, numberOfSqFeet);
    }

    int getRatePerSqFeet() {
        if (hasWIFI) {
            return ratePerSqFeet + 2;
        } else {
            return ratePerSqFeet;
        }
    }
}
