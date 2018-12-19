package org.fasttrackit;

/**
 * Hello world!
 */

// this is a comment
public class App {
    public static void main(String[] args) {

        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "Renault";

        // sout prints a message to the console
        System.out.println(firstEngine.manufacturer);

        // declaring a variable and instantiating a Car object
        // this is also called initializing a variable
        Car firstCompetitor = new Car(firstEngine);
        firstCompetitor.name = "Dacia";
        firstCompetitor.color = "black";
        firstCompetitor.doorCount = 5;
        firstCompetitor.mileage = 9.5;

        // local variables are variables declared inside a method
        // they don't receive default values
        Car secondCompetitor = new Car(new Engine());
        secondCompetitor.name = "Golf";

        System.out.println(firstEngine.manufacturer);
        System.out.println(firstCompetitor.engine.manufacturer);

        double traveledDistance =
                firstCompetitor.accelerate(100, 30);

        Engine autoVehicleEngine = new Engine();
        autoVehicleEngine.manufacturer = "Renault";

        AutoVehicle autoVehicle = new AutoVehicle(autoVehicleEngine);
    }
}
