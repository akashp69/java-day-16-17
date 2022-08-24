package com.assigments.algorithms;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("How Many Numbers of Elements Do You Want to Insert : ");
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        System.out.println("TOtal SIze = " + elements);
        String str[] = new String[elements];
        System.out.println("Entre Words To Sort: ");
        for (int i = 0; i < elements; i++) {
            str[i] = sc.next();

        }
        String[] sortedArray = insertionSort(str, str.length);
        for (int i = 0; i < elements; i++)
            System.out.print(sortedArray[i] + " ");
    }
    public static String[] insertionSort(String[] array, int length) {
        String temp = " ";
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}