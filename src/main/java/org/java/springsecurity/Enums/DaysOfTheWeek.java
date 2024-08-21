package org.java.springsecurity.Enums;

public enum DaysOfTheWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public double getValue() {
     return switch (this) {
         case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> 1.0;
         case SATURDAY, SUNDAY -> 0.5;
         default -> 0.01;
     };
    }
    }
