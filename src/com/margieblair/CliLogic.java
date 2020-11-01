package com.margieblair;

import java.util.Scanner;

public class CliLogic {

    private static Scanner scan = new Scanner(System.in);

    public static void runProgram(Hotel hotel) {
        System.out.println("Welcome to the " + hotel.getName());
        System.out.println("Would you like to check in (1) or check out (2)?");
        int choiceToken = scan.nextInt();
        if (choiceToken == 1) {
            hotel.getAvailableRooms();
        } else if (choiceToken == 2) {
            hotel.getUnavailableRooms();
        } else {
            System.out.println("Invalid number option, please try again.");
        }

    }
}
