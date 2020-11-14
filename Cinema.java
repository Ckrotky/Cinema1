package com.lesson6;

public class Cinema {
    private String name;
    private Hall[] halls;

    public Cinema(int numberOfHalls, int numberOfRows, int numberOfPlaces) {
        halls = new Hall[numberOfHalls];
        for (int i = 0; i < halls.length; i++) {
            halls[i] = new Hall(numberOfRows, numberOfPlaces);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hall[] getHalls() {
        return halls;
    }

    public void setHalls(Hall[] halls) {
        this.halls = halls;
    }


    public void showCinema(int numberOfRows) {
//        for (int j = 0; j < halls.length; j++){
//            System.out.print("Hall: "+j+"\t\t\t\t\t\t\t");
//        }
//        System.out.println();

        for (int i = 0; i < halls.length; i++) {
            System.out.print("Hall: " + (i + 1) +" ".repeat(12)+ "\t\t\t");
        }
        System.out.println();

        for (int i = 0; i < numberOfRows; i++) {
            for (Hall hall : halls) {
                System.out.print((i + 1) + ": ");
                System.out.print(hall.showRow(0));
                System.out.print("\t\t\t");
            }
            System.out.println();

        }

//        System.out.print(halls[0].showRow(0));
//        System.out.print("\t\t\t");
//        System.out.print(halls[1].showRow(1));
//        System.out.print("\t\t\t");
//        System.out.println();
//        System.out.print(halls[2].showRow(2));
//        System.out.print("\t\t\t");
//        System.out.print(halls[2].showRow(3));
//        System.out.print("\t\t\t");
    }
}

