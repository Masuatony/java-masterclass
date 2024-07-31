package org.java.springsecurity.masterclas;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IsOdd {
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return number % 2 != 0;
    }

    // Method to sum odd numbers in a range
    public static int sumOdd(int start, int end) {
        if (end < start || start <= 0 || end <= 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Testing the methods
//        System.out.println(isOdd(5)); // true
//        System.out.println(isOdd(4)); // false
//
//        System.out.println(sumOdd(1, 20)); // 25 (1 + 3 + 5 + 7 + 9)
//        System.out.println(sumOdd(5, 5));  // 5
//        System.out.println(sumOdd(-1, 10)); // -1 (invalid input)
//        System.out.println(sumOdd(10, 5));  // -1 (invalid input)
        sumDigit(-1);
        sumMethod2(-1234);
        getNumberRange(6);
    }

    public static int sumDigit(int dig) {
        if (dig < 0 ) {
            log.info("entering the block " + dig);
            return -1;
        }
        int sum = 0;
        while(dig > 9) {
            sum += (dig % 10);
            dig = dig/10;
        }
        sum += dig;
        System.out.println("sum === " + sum);
        return sum;
    }

    public static int sumMethod2(int number) {
        int sum = 0;
        if (number < 0) {
//            log.info();
            return -1;
        }

        while ( number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("sum method 2 ===== " + sum);
        return sum;
    }

    public static void getNumberRange(int number) {
        while(number < 15) {
            number++;
            if (number <= 5) {
                System.out.println("number less");
                continue;
            }
            if (number >= 10) {
                break;
            }
        }


    }

}
