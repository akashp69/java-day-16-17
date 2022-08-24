package com.assigments.algorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(
                "Enter Total Nos. of Array Elements You Want To sort: ");
        Scanner sc = new Scanner(System.in);
        int totalElements = sc.nextInt();
        int arr[] = new int[totalElements];

        System.out.println("Enter " + totalElements + " Array Elements: ");
        for (int i = 0; i < totalElements; i++)
            arr[i] = sc.nextInt();
        BubbleSort bs = new BubbleSort();
        bs.sort(arr, totalElements);
    }

    private void sort(int[] arr, int arrLength) {
        System.out.println("Before Sorting:");

        for (int i = 0; i < arrLength; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\nAfter Sorting:\n");
        for (int i = 0; i < arrLength - 1; i++) {

            for (int j = 0; j < arrLength - i - 1; j++) {
                int temp;

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
