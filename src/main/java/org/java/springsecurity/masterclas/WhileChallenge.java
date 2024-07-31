package org.java.springsecurity.masterclas;

public class WhileChallenge {
    public static void main(String[] args) {
        findInRange(4,20);

    }
    public static boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public static void findInRange(int start, int end) {
        int i = 4;
        int finish = 20;
        int oddCount = 0;
        int evenCount = 0;
        while (i <= finish) {
            i++;
            if (!isEven(i)){
                oddCount++;
                continue;
            }
            System.out.println(i);
            evenCount++;
            if (evenCount >= 8) break;
        }
        System.out.println("even count ==== " + evenCount);
        System.out.println("odd count ==== " + oddCount);
    }

}
