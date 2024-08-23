package org.java.springsecurity.Interfaces.Animal.Animals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IBird extends IAnimal implements ITrackable, IFlightEnabled {
    @Override
    public void makeSound() {
        System.out.println("Birds yaps! ");
    }

    @Override
    public void takeOff() {
        System.out.println("Birds take off! ");
    }

    @Override
    public void land() {
        System.out.println("Birds land! ");
    }

    @Override
    public void fly() {
        System.out.println("Birds fly! ");
    }

    @Override
    public void track() {
        System.out.println("Birds track! ");
    }

    public static void main(String[] args) {
        IBird bird = new IBird();
        IAnimal animal = bird;
        IFlightEnabled flier = bird;

        animal.makeSound();
        bird.makeSound();
        bird.fly();
        bird.track();
        bird.takeOff();

        inFlight(flier);
//        ITrackable truck = new ITrackable();

        LinkedList<IFlightEnabled> flights = new LinkedList<>();
        flights.add(bird);
        List<IFlightEnabled> listFlies = new ArrayList<>();
        listFlies.add(bird);
        triggerFliers(listFlies);
    }

    public static void inFlight(IFlightEnabled flightEnabled) {
        flightEnabled.takeOff();

        if (flightEnabled instanceof ITrackable trackable) {
            trackable.track();
        }
    }

    private static void triggerFliers(List<IFlightEnabled> flightEnableds) {
        for (var flightEnabled : flightEnableds) {
            flightEnabled.fly();
        }
    }

    private static void flyFliers(List<IFlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<IFlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.land();
        }
    }
}
