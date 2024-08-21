package org.java.springsecurity.Enums;

import java.util.Arrays;
import java.util.Random;

public class Days {
    public static void main(String[] args) {
        DaysOfTheWeek week = DaysOfTheWeek.FRIDAY;
        System.out.println(Arrays.toString(week.getClass().getEnumConstants()));

        System.out.println(getDaysOfTheWeek());
//        System.out.println();

        switchDays(DaysOfTheWeek.WEDNESDAY);

        for (DaysOfTheWeek days: DaysOfTheWeek.values()) {
            System.out.println(days.name() + " " + days.getValue());
        }
    }

    public static DaysOfTheWeek getDaysOfTheWeek() {
        int randomInt = new Random().nextInt(7);
        var allDays = DaysOfTheWeek.values();
        System.out.println(allDays[randomInt]);
        return allDays[randomInt];
    }

    public static void switchDays(DaysOfTheWeek daysOfTheWeek) {
        int weekDayInt = daysOfTheWeek.ordinal() + 1;

        switch (daysOfTheWeek) {
            case FRIDAY -> System.out.println("Friday "+ weekDayInt);
            case SATURDAY -> System.out.println("Saturday "+ weekDayInt);
            case SUNDAY -> System.out.println("Sunday "+ weekDayInt);
            default -> System.out.println(daysOfTheWeek +" _ " + weekDayInt);
        }

    }
}
