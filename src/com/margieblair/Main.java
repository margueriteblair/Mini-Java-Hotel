package com.margieblair;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        List availableRooms = List.of(101, 102, 103, 201, 202, 203);
        List unavailableRooms = List.of();
        Hotel newHotel = new Hotel("Baby Hotel", availableRooms, unavailableRooms);
        System.out.println(availableRooms);
    }
}
