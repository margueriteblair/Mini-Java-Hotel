package com.margieblair;

import java.util.List;
import java.util.ArrayList;

public class Hotel {
    private String name;
    private List<Integer> availableRooms;
    private List<Integer> unavailableRooms;

    public Hotel(String name, List<Integer> availableRooms, List<Integer> unavailableRooms) {
        this.name = name;
        this.availableRooms= availableRooms;
        this.unavailableRooms = unavailableRooms;
    }

    public void bookRoom(int room) {
        unavailableRooms.add(room);
        availableRooms.remove(room);
    }

    public void unbookRoom(int room) {
        availableRooms.add(room);
        unavailableRooms.remove(room);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getAvailableRooms() {
        System.out.println("Please choose from one of the following rooms:");
        System.out.println(availableRooms);
        return availableRooms;
    }

    public List<Integer> getUnavailableRooms() {
        System.out.println("Which of the following rooms are you checking out of:");
        System.out.println(unavailableRooms);
        return unavailableRooms;
    }

}
