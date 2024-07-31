package org.java.springsecurity.masterclas;

public class FindBiggestPrime {

    public static void main(String[] args) {
        // Test cases to verify the methods
//        System.out.println(getLargestPrime(10)); // Output: 7
//        System.out.println(getLargestPrime(29)); // Output: 29
//        System.out.println(getLargestPrime(30)); // Output: 29
//        System.out.println(getLargestPrime(2));  // Output: 2
//        System.out.println(getLargestPrime(1));
// Output: -1 (No prime number less than or equal to 1)
        System.out.println(getLargestPrimeSimple(1212));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1; // No prime number less than 2
        }

        for (int i = number; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }

        return -1; // Fallback, in case no prime number is found (though theoretically, this should not occur)
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getLargestPrimeSimple(int number) {

        if (number < 2) {
            return -1;
        }

        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
            factor = i;
            while (number % i == 0) {
                number /= i;
            }
        }
        return number == 1 ? factor : number;
    }


}
