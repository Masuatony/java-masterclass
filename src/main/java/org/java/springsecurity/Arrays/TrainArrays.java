package org.java.springsecurity.Arrays;

import java.util.Arrays;

public class TrainArrays {
    public static void main(String[] args) {
        int[] train = {1, 2, 3, 4, 5};
        int length = train.length;
        System.out.println("Train length: {} " + length);
        for (int j : train) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("last item {} " + train[length - 1]);
//        Arrays.
//        System.out.println("sum of all items {} " + train.stream().filter(i -> i < 4));
    }
}
