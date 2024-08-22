package org.java.springsecurity.Interfaces;

public record IDragonFly(String name, String type) implements IFlightEnabled {
    @Override
    public void takeOff() {
        System.out.println("using both legs " + name + " and " + type);
    }

    @Override
    public void land() {
        System.out.println("using both legs to land " + name + " and " + type);
    }

    @Override
    public void fly() {
        System.out.println("using wings to fly " + name );
    }
}
