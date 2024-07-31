package org.java.springsecurity.masterclas;

public class SumOdd {
    public static void main(String[] args) {
//        System.out.println("hey");
//        System.out.println("oddd num" + isOdd(3));
//        System.out.println("sum ===== " + sumOdd(1, 10));
//        System.out.println("loop === " + sumWhile(10));
////        System.out.println("loop do === " doWhileLoop(10));
//        doWhileLoop(5);
        evenPrints(50);

    }

    public static boolean isOdd(int num) {
        if (num <= 0) {
            return false;
        }
        return num % 2 !=0;
    }

    public static int sumOdd(int start, int end) {
        if (end < start || start < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start ; i <= end; i++) {
            if (isOdd(i)) {
               return sum += i;
            }
        }
        return sum;
    }

    public static int sumWhile(int number) {
        int j = 1;
        while (j <= number) {
            System.out.println(j);
            j++;
        }
        return j;
    }

    public static void doWhileLoop(int number) {
        int j = 1;
        boolean isReady = false;
        do {
            if (j > number) {
                break;
            }
            System.out.println(j);
            j++;
            isReady =  j > 0;
        } while (isReady);
    }

    public static void evenPrints(int number) {
        int j = 0;
        while (j < number) {
            j +=5;
            if (j % 25 == 0) {
                continue;
            }
            System.out.println(j + "_");
        }
    }
}
