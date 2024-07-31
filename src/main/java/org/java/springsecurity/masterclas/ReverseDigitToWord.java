package org.java.springsecurity.masterclas;

public class ReverseDigitToWord {
    public static int reverse( int number) {
        int reverse = 0;
        int isNegative = number < 0 ? -1 : 1;

        while( number > 0 ) {
          int lastDig = number % 10;
          reverse = reverse * 10 + lastDig;
          number /=10;
        }
        return reverse * isNegative;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(numberToWords(123));
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= number; i *= 10) {
            count++;
        }
        return count;
    }

    public static boolean numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return false;
        }

        // get reversed number
        int reverse = reverse(number);

        // subtract numberDigits and reverseDigits to get leading zeroes
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        if (number == 0) {
            System.out.println("Zero");
            return false;
        }

        // use loop to print words
        while (reverse != 0) {
            int lastDigit = reverse % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            reverse /= 10;
        }

        for (int i = 0; i < leadingZeroes; i++) {
            System.out.println("Zero");
        }
        return false;
    }

}
