package org.java.springsecurity.masterclas;

public class GCD {
    public static void main(String[] args) {
        System.out.println(
                getGreatestCommonDivisor(1785,546)
        );
        System.out.println(getGreatestCommonDivisor2(12,24));

    }
    public static int getGreatestCommonDivisor(int first, int second) {
        // Check if either number is less than 10
        if (first < 10 || second < 10) {
            return -1; // Invalid value
        }

        while (first != second) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }

        return first;
    }

    public static int getGreatestCommonDivisor2(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

//        int min = Math.min(first, second);
        int min = first < second ? first : second;
        int gcd = 1;
        for (int j = 1; j <= min; j++) {
            if (first % j == 0 && second % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
