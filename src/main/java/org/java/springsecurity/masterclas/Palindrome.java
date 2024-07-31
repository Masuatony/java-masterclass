package org.java.springsecurity.masterclas;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("12321"));
        System.out.println(isPalindrome2(11));
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumOfEvenNumbers(12345678));
        System.out.println(new Palindrome().getHello());

    }

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        int left = 0;
        int right = cleanedStr.length() -1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(int number) {
        if (number < 0) {
            return false;
        }

        int original = number;
        int reverse  = 0;

        while (original != 0) {
            int digit = original % 10;
            reverse  = reverse  * 10 + digit;
            original /= 10;
        }

        // Check if the original number and the reversed number are the same
        return original == reverse ;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0 ) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = number;

        while( firstDigit >= 10) {
            firstDigit /= 10;
        }
        return firstDigit + lastDigit;
    }

    public static int sumOfEvenNumbers(int number) {
        int sum = 0;
//         while( number != 0 ) {
//             int digit = number % 10;
//
//             if (digit % 2 == 0) {
//                 sum +=digit;
//             }
//             number /= 10;
//         }
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }
         return sum;
    }

    public String getHello() {
        return "Hey google";
    }

    //even numbers


}
