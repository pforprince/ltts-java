/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondassignment.second;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class HotelMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
        int hotelType = s.nextInt();
        s.nextLine();
        System.out.println("Hotel Name:");
        String hotelName = s.nextLine();
        System.out.println("Room Square Feet Area:");
        int sqFeet = s.nextInt();
        s.nextLine();
        System.out.println("Room has TV (yes/no):");
        boolean hasTV = s.nextBoolean();
        System.out.println("Room has Wifi (yes/no):");
        boolean hasWifi = s.nextBoolean();
        if (hotelType == 1) {
            DeluxeRoom deluxeRoom = new DeluxeACRoom(sqFeet, hotelName, hasTV, hasWifi, sqFeet);
            System.out.println("Room Tariff per day is: "+deluxeRoom.calculateTariff());
        } else if (hotelType == 2) {
            DeluxeACRoom deluxeACRoom = new DeluxeACRoom(sqFeet, hotelName, hasTV, hasWifi, sqFeet);
            System.out.println("Room Tariff per day is: "+deluxeACRoom.calculateTariff());
        } else if (hotelType == 3) {
            SuiteACRoom suiteACRoom = new SuiteACRoom(hotelName, hasTV, hasWifi, sqFeet);
            System.out.println("Room Tariff per day is: "+suiteACRoom.calculateTariff());
        }
    }
}
