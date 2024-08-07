package org.java.springsecurity.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length-1);
        System.out.println(Arrays.toString(fourthArray));

        int[] fifthArray = Arrays.copyOf(fourthArray,fourthArray.length + 5);
        System.out.println(Arrays.toString(fifthArray));

    }

    private static int[] getRandomArray(int len) {
        Random rand = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = rand.nextInt(100);
//            arr[i + 1] = rand.
        }

        return arr;
    }


}
