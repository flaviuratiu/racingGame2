package org.fasttrackit;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[10];
    private List<Vehicle> competitors = new ArrayList<>();

    public void start() {
        addCompetitors(2);
        displayCompetitors();
        addTrack(0, new Track("Highway", 300));
        addTrack(1, new Track("Seaside", 100));
        displayAvailableTracks();

        Track track;

        // let the user choose what track to use (the 1st one or the 2nd one)
        // based on their choice, populate the local variable "track" above
        // with the reference of the correct object from the "tracks" array


    }

    public void addCompetitors(int competitorCount) {
        for (int i = 0; i < competitorCount; i++) {
            Vehicle vehicle = new Vehicle();

            String name = getVehicleNameFromUser();
            vehicle.setName(name);

            double mileage = ThreadLocalRandom.current().nextDouble(5, 15);
            vehicle.setMileage(mileage);

            System.out.println("Your mileage is: " + mileage);

            // vehicle details will be populated when we learn to get user's input
            competitors.add(vehicle);
        }

        // enhanced for with lists (same as with arrays)
//        for (Vehicle vehicle : competitors) {
//            System.out.println(vehicle.getName());
//        }
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your vehicle name is: " + name);
        return name;
    }

    private double getVehicleAccelerationSpeedFromUser() {
        System.out.println("Please enter acceleration speed:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public void displayCompetitors() {
        System.out.println("Welcome! Race is starting with:");
        for (int i = 0; i < competitors.size(); i++) {
            if (competitors.get(i) != null) {
                System.out.println(competitors.get(i).getName());
            }
        }
    }

    public void addTrack(int index, Track track) {
        tracks[index] = track;
    }

    public void displayAvailableTracks() {
        System.out.println("Available tracks:");

        // (classic) for loop
//        for (int i = 0; i < tracks.length; i++) {
//            if (tracks[i] != null) {
//                System.out.println(tracks[i].getName());
//            }
//        }

        // enhanced for loop (for-each)
        for (Track track : tracks) {
            if (track != null) {
                System.out.println(track.getName());
            }
        }

    }
}
