package com.javalevelbasic.task005;

import java.util.Scanner;

/**
 * There is a nine-storey house with 4 entrances. The entrance number starts with one.
 * There are 4 apartments on one floor. Write a program that will receive the apartment
 * number from the keyboard, and will display on the screen on which floor, which entrance
 * this apartment is located. If there is no such apartment in this house,
 * then you need to inform the user about it.
 */
public class FloorAndEntranceTheApartment {

    public static final int FLOORS = 9;
    public static final int NUMBER_OF_ENTRANCES_IN_HOUSE = 4;
    public static final int APARTMENTS_IN_ONE_FLOOR = 4;

    public static void main(String[] args) {
        printBuildingInfo();

        int apartmentNumber = readApartmentNumber();

        getFloorAndEntrance(apartmentNumber);
    }

    private static void printBuildingInfo() {
        System.out.println("In the house " + FLOORS + " floors");
        System.out.println("In the house " + NUMBER_OF_ENTRANCES_IN_HOUSE + " entrances");
        System.out.println("In the house " + APARTMENTS_IN_ONE_FLOOR + " apartments on one floor");
    }

    /**
     * Find the floor and entrance of the apartment.
     * @param apartmentNumber
     */
    private static void getFloorAndEntrance(int apartmentNumber) {
        if (apartmentNumber < 1) {
            System.out.println("Wrong apartment number");
            return;
        }

        int totalApartments = APARTMENTS_IN_ONE_FLOOR * FLOORS * NUMBER_OF_ENTRANCES_IN_HOUSE;

        if (apartmentNumber > totalApartments) {
            System.out.println("Don't exist apartment with this number");
            return;
        }

        apartmentNumber = apartmentNumber - 1;
        int entranceNumber = apartmentNumber / (APARTMENTS_IN_ONE_FLOOR * FLOORS );
        int floorNumber = (apartmentNumber - entranceNumber * APARTMENTS_IN_ONE_FLOOR * FLOORS) / (APARTMENTS_IN_ONE_FLOOR);
        System.out.println("Apartment number " + (apartmentNumber + 1) + " is on the " + (floorNumber + 1) + " floor and " + (entranceNumber + 1) + " entrance");
    }

    /**
     * read the apartment number from the keyboard.
     * @return apartment number
     */
    private static int readApartmentNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the apartment number: ");
        int number;

        try {
            number = scanner.nextInt();
        } catch (NumberFormatException e) {
            return 0;
        }

        return number;
    }
}
