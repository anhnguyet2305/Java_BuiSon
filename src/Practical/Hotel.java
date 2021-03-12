package Practical;

import java.util.Scanner;

public class Hotel {
    String name;
    String location;
    String ownerName;
    String Location;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName, String location1) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
        Location = location1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

}
