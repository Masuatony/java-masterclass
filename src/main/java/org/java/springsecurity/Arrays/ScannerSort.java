package org.java.springsecurity.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerSort {
    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int size = 5;
        int[] array = getIntegers(size);
        printArray(array);
//        bubbleSort(array);
        sortAsc(array);
        sortDesc(array);

//        System.out.println("Original array: ";
//        System.out.println("Original array: " + Arrays.toString(array));
//        bubbleSort(array);
//        System.out.println("Sorted array: " + java.util.Arrays.toString(array));
    }

  public static void printArray(int[] args) {
//        for (int i : args) {
//            System.out.print(i + " ");
//        }

        for (int i = 0 ; i < args.length ; i++) {
            System.out.println("Element " + i + " contents " + args[i]);
        }
        System.out.println();
  }

  public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j+1] and arr[i]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
      System.out.println(Arrays.toString(arr));
        return arr;
  }

  public static int[] sortAsc(int[] args){
        int[] arr = new int[args.length];
        int temp;
        boolean flag =  true;
        while(flag){
            flag = false;
            for(int i = 0; i < args.length - 1; i++){
                if(args[i] > args[i + 1]){
                    temp = args[i];
                    args[i] = args[i + 1];
                    args[i + 1] = temp;
                    flag = true;
                }
            }
        }
      System.out.println(Arrays.toString(args));
        return args;
  }

  public static int[] sortDesc(int[] args){
      int[] sortedArray = Arrays.copyOf(args, args.length);
      boolean flag = true;
      int temp;
      while (flag) {
          flag = false;
          for (int i=0; i<sortedArray.length-1; i++) {
              if (sortedArray[i] < sortedArray[i+1]) {
                  temp = sortedArray[i];                     // 1
                  sortedArray[i] = sortedArray[i+1];         // 2
                  sortedArray[i+1] = temp;                   // 3
                  flag = true;                               // 4
              }
          }
      }
      System.out.println(Arrays.toString(sortedArray));

      return sortedArray;
  }




}
