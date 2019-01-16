package org.fasttrackit;

public class Game {

    private Track[] tracks = new Track[10];

    public void addTrack(int index, Track track) {
        tracks[index] = track;
    }

    public void displayAvailableTracks() {
        System.out.println("Available tracks:");
        System.out.println(tracks[0]);
        System.out.println(tracks[1]);
    }
}
