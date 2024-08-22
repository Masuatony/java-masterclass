package org.java.springsecurity.Interfaces;

public enum IFlightStages implements ITrackable {
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        System.out.println("following everywhere ");
    }
}
