package org.java.springsecurity.masterclas;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SwitchClass {

    public static String getMonth(String month) {
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "first";
            case "April", "May", "June" -> "second";
            case "Jul", "Aug", "Sep" -> "third";
            default -> month + "is bad";
        };
    }

    public static void getDayOfWeek(int day) {
        String ofDay = switch (day) {
            case 0 -> "sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            default -> "No such day";
        };
        System.out.println(day + "day is " + ofDay);
        log.info("day ==== " + day);
//        return ofDay;
    }

    public static void getNumberArray(int number) {

        if (number < 0 || number > 9) {
            System.out.println("OTHER");
            return;
        };
        String num = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "oNE";
            case 2 -> "tWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";

            default -> "OTHER";
        };
        System.out.println(number + " Number " + num);

    }

    public static void main(String[] args) {
        System.out.println("hey =============" + SwitchClass.getMonth("Jan"));
        getDayOfWeek(1);
        getDayOfWeek(7);

        int count = 0;

        for (int i = 10; count < 5 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }

    }



    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    //testing odd number


}
