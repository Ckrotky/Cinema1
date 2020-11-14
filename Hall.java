package com.lesson6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hall {
    private Place[][] places;


    public Hall(int countOfRows, int countOfPlaces) {
        places = new Place[countOfRows][countOfPlaces];
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                places[i][j] = new Place();
            }
        }
    }


    public Place[][] getPlaces() {
        return places;
    }

    public void bookPlace(int row, int placeIndex, Client client) {
        Place place = places[row - 1][placeIndex - 1];

        boolean isFree = place.isFree();
        if (isFree) {
            place.setClient(client);
            place.setBookTime(LocalDateTime.now());
            System.out.println("Место забронировано");
        } else {
            System.out.println("Место уже занято");
        }
        showHall();
    }

    public void unbookPlace(int row, int placeIndex) {
        Place place = places[row - 1][placeIndex - 1];
        boolean isFree = place.isFree();
        if (!isFree) {
            place.setClient(null);
            place.setBookTime(null);
            System.out.println("Место освобождено");
        } else {
            System.out.println("Место свободно");
        }
        showHall();
    }


    public String showRow(int row) {
        String rowHall = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < places[row].length; i++) {
            rowHall = sb.append("[-]" + " ").toString();
        }
        return rowHall;
    }



    public void showHall() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM HH:mm");
        for (int i = 0; i < places.length; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < places[i].length; j++) {
                if (places[i][j].isFree()) {
                    System.out.print("[-] ");
                } else {
                    String firstName = places[i][j].getClient().getFirstName();
                    LocalDateTime time = places[i][j].getBookTime();
                    System.out.print("[" + firstName + ":" + format.format(time) + "] ");
                }
            }
        }
    }


}
