package org.java.springsecurity.Interfaces;

public interface IFlightEnabled {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();
    void land();
    void fly();

    default void prey() {};
}
