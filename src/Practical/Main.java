package Practical;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Hotel[] hotels;

    public static void main(String[] args){
        hotels = new Hotel[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your hotel information!");
        for (int i = 0; i <10; ++i){
            System.out.println("Hotel : " +i );

            System.out.println("name : ");
            String name = scanner.next();

            System.out.println("location : ");
            String location = scanner.next();

            System.out.println("ownerName : ");
            String ownerName = scanner.next();

            System.out.println("Location : ");
            String Location = scanner.next();

            hotels[i] = new Hotel(name, location, ownerName, Location);
        }


        System.out.println("Please enter the owner name of the hotel : ");
        String ownerName = scanner.next();
        searchOwnerName(ownerName);

    }

    public static void searchOwnerName(String ownerName){
        System.out.println("Hotels of " + ownerName + ":");
        for (Hotel hotel: hotels) {
            if (hotel.ownerName.equals(ownerName)) {
                System.out.println(hotel.toString());
            }
        }
    }
}
